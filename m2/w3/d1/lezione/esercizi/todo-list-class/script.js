class Todo{

    constructor(target){
        
        this.todoName = target;
        this.target = document.querySelector(target)
        this.input = '';
        this.button = '';
        this.list = '';
        this.allTodos = localStorage.getItem(target) ? JSON.parse(localStorage.getItem(target)) : [];

        this.createBaseHTML()

        if(this.allTodos.length > 0){
            for(let td of this.allTodos){
                this.addTodo(td)
            }
        }

    }

    createInput(){
        let input = this.createElementWithClass('input','form-control');
        input.type = 'text';
        this.input = input;
    }
    
    createbutton(){
        let button = this.createElementWithClass('button','btn btn-primary');
        button.innerHTML = 'Save';

        button.addEventListener('click',() => this.addTodo() )

        this.button = button;
    }

    addTodo(td){
        let todo = this.createElementWithClass('div','alert alert-success');
        todo.innerHTML = td || this.input.value;
        todo.addEventListener('click',() => {
            todo.remove()
            let index = this.allTodos.indexOf(this.input.value)  
            td || this.allTodos.splice(index,1)
            td || this.saveTodos()
        })

        td || this.allTodos.push(this.input.value)
        td || this.saveTodos()

        this.list.append(todo);
        this.input.value = '';
    }
    
    createBaseHTML(){
        
        //creo i containers
        let formContainer = this.createElementWithClass('div','container')
        let listContainer = this.createElementWithClass('div','container')
        
        //creo input
        this.createInput()
        
        //creo bottone
        this.createbutton()

        //creo lista
        let list = this.createElementWithClass('div','row');
        this.list = list;

        //inserisco gli elementi nei rispettivi container
        formContainer.append(this.input,this.button)
        listContainer.append(list)
        this.target.append(formContainer,listContainer)

    }

    saveTodos(){
        localStorage.setItem(this.todoName,JSON.stringify(this.allTodos))
    }

    createElementWithClass(tag,className){
        let element = document.createElement(tag);
        element.className = className
        return element;
    }

}

let todo = new Todo('#todo1');
let todo2 = new Todo('#todo2');
let todo3 = new Todo('#todo3');

/*
    <div class="container">//formContainer
        <input class="form-control" type="text" >//input
        <button class="btn btn-primary" >Salva</button>//button
    </div>

    <div class="container">//listContainer
        <div class="row">//list

        </div>
    </div>
*/