"use strict";
class Todo {
    constructor(selettore) {
        this.target = document.querySelector(selettore);
        this.selettore = selettore;
        let db = localStorage.getItem(selettore) || '[]';
        this.allTodos = JSON.parse(db);
        this.creaHTMLBase();
    }
    creaHTMLBase() {
        //creo gli elementi
        let input = document.createElement("input");
        let btn = document.createElement("button");
        let list = document.createElement("div");
        //attivo funzionalità button
        btn.addEventListener("click", () => {
            this.creaHTMLTodo();
            this.salvaNuovoTodo();
        });
        //formatto gli elementi
        input.classList.add("form-control");
        btn.classList.add("btn", "btn-primary");
        btn.textContent = "salva";
        //salvo gli elementi nelle proprieta della classe
        this.input = input;
        this.btn = btn;
        if (this.target) {
            this.target.append(input, btn, list);
        }
        else {
            throw new Error("No target specified");
        }
    }
    creaHTMLTodo(testo = null) {
        let newTodo = document.createElement("div");
        newTodo.classList.add("alert", 'alert-success');
        newTodo.textContent = testo || this.input.value;
        this.list.append(newTodo);
    }
    salvaNuovoTodo() {
        this.allTodos.push(this.input.value);
        localStorage.setItem(this.selettore, JSON.stringify(this.allTodos));
    }
}
new Todo('#todo');
//# sourceMappingURL=script.js.map