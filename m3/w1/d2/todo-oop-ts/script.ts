
class Todo{
    protected target!:HTMLElement|null;
    protected selettore!:string;
    protected input!:HTMLInputElement;
    protected button!:HTMLButtonElement;
    protected list!:HTMLElement;
    protected allTodos!:string[];
    
    constructor(selettore:string){
        this.target = document.querySelector(selettore);
        this.selettore = selettore;
        let db:string = localStorage.getItem(selettore) || '[]';
        this.allTodos = JSON.parse(db);
        this.creaHTMLBase();

        if(this.allTodos.length > 0){
            for(let todo of this.allTodos){
                this.creaHTMLTodo(todo)
            }
        }
    }

    protected creaHTMLBase(){
        //creo gli elementi
        let input:HTMLInputElement = document.createElement('input');
        let button:HTMLButtonElement = document.createElement('button');
        let list:HTMLElement = document.createElement('div');
        //attivo funzionalità del button
        button.addEventListener('click',() => {
            this.creaHTMLTodo();
            this.salvaNuovoTodo();
        })
        //formatto gli elementi
        input.classList.add('form-control');
        button.classList.add('btn','btn-primary');
        button.textContent = 'Salva';
        //salvo gli elementi nelle proprietà della classe
        this.input = input;
        this.button = button;
        this.list = list;
        //mostro gli elementi
        if(this.target){
           this.target.append(input, button, list)
        }else{
            throw new Error(`Elemento target(${this.selettore}) non trovato`)
        }
    
    }

    public creaHTMLTodo(testo:string|null = null){
        let newTodo = document.createElement('div');
        newTodo.classList.add('alert','alert-success')
        newTodo.textContent = testo || this.input.value;
        this.list.append(newTodo);
    }

    protected salvaNuovoTodo(){
        this.allTodos.push(this.input.value)
        localStorage.setItem(this.selettore,JSON.stringify(this.allTodos))
        this.input.value = '';
    }
}

let todo1 = new Todo('#todo')
let todo2 = new Todo('#todo2')

document.querySelector('#btnProva')
?.addEventListener('click',function(){
    todo1.creaHTMLTodo('prova')
})