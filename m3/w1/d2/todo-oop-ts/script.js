"use strict";
var _a;
class Todo {
    constructor(selettore) {
        this.target = document.querySelector(selettore);
        this.selettore = selettore;
        let db = localStorage.getItem(selettore) || '[]';
        this.allTodos = JSON.parse(db);
        this.creaHTMLBase();
        if (this.allTodos.length > 0) {
            for (let todo of this.allTodos) {
                this.creaHTMLTodo(todo);
            }
        }
    }
    creaHTMLBase() {
        //creo gli elementi
        let input = document.createElement('input');
        let button = document.createElement('button');
        let list = document.createElement('div');
        //attivo funzionalità del button
        button.addEventListener('click', () => {
            this.creaHTMLTodo();
            this.salvaNuovoTodo();
        });
        //formatto gli elementi
        input.classList.add('form-control');
        button.classList.add('btn', 'btn-primary');
        button.textContent = 'Salva';
        //salvo gli elementi nelle proprietà della classe
        this.input = input;
        this.button = button;
        this.list = list;
        //mostro gli elementi
        if (this.target) {
            this.target.append(input, button, list);
        }
        else {
            throw new Error(`Elemento target(${this.selettore}) non trovato`);
        }
    }
    creaHTMLTodo(testo = null) {
        let newTodo = document.createElement('div');
        newTodo.classList.add('alert', 'alert-success');
        newTodo.textContent = testo || this.input.value;
        this.list.append(newTodo);
    }
    salvaNuovoTodo() {
        this.allTodos.push(this.input.value);
        localStorage.setItem(this.selettore, JSON.stringify(this.allTodos));
        this.input.value = '';
    }
}
let todo1 = new Todo('#todo');
let todo2 = new Todo('#todo2');
(_a = document.querySelector('#btnProva')) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () {
    todo1.creaHTMLTodo('prova');
});
//# sourceMappingURL=script.js.map