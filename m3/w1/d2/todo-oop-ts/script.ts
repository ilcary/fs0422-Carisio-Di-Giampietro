class Todo {
    protected target!: HTMLElement | null;
    protected selettore!:string;
    protected input!: HTMLInputElement | null;
    protected btn!: HTMLButtonElement | null;
    protected list!: HTMLElement | null;
    protected allTodos!:string[];

    constructor(selettore: string) {
        this.target = document.querySelector(selettore);
        this.selettore = selettore;
        let db:string = localStorage.getItem(selettore) || '[]';
        this.allTodos = JSON.parse(db);
        this.creaHTMLBase()

    }

    protected creaHTMLBase() {
        //creo gli elementi
        let input: HTMLInputElement = document.createElement("input");
        let btn: HTMLButtonElement = document.createElement("button");
        let list: HTMLElement = document.createElement("div");
        //attivo funzionalità button
        btn.addEventListener("click", () => {
            this.creaHTMLTodo();
            this.salvaNuovoTodo();
        })

        //formatto gli elementi
        input.classList.add("form-control");
        btn.classList.add("btn", "btn-primary");
        btn.textContent = "salva";

        //salvo gli elementi nelle proprieta della classe
        this.input = input;
        this.btn = btn;

        if (this.target) {
            this.target.append(input, btn, list)
        } else {
            throw new Error("No target specified")
        }
    }

    public creaHTMLTodo(testo:string|null = null) {
        let newTodo = document.createElement("div");
        newTodo.classList.add("alert", 'alert-success');
        newTodo.textContent = testo || this.input.value;
        this.list.append(newTodo);
    }

    protected salvaNuovoTodo(){
        this.allTodos.push(this.input.value);
        localStorage.setItem(this.selettore, JSON.stringify(this.allTodos));
    }
}

new Todo('#todo')