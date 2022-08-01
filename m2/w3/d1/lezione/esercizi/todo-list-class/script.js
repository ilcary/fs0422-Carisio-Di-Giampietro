class Todo{

    constructor(target){
        
        this.target = document.querySelector(target)
        this.input = '';
        this.button = '';
        this.list = '';

        this.createBaseHTML()

    }

    createInput(){
        let input = document.createElement('input');
        input.classList.add('form-control');
        input.type = 'text';
        this.input = input;
    }
    
    createbutton(){
        let button = document.createElement('button');
        button.classList.add('btn','btn-primary');
        button.innerHTML = 'Save';

        button.addEventListener('click',() => this.addTodo() )

        this.button = button;
    }

    addTodo(){
        let todo = document.createElement('div');//<div></div>
        todo.innerHTML = this.input.value;
        todo.classList.add('alert','alert-success');
        this.list.append(todo);
        this.input.value = '';
    }
    
    createBaseHTML(){
        
        //creo i containers
        let formContainer = document.createElement('div');
        let listContainer = document.createElement('div');
        formContainer.classList.add('container');
        listContainer.classList.add('container');
        
        //creo input
        this.createInput()
        
        //creo bottone
        this.createbutton()

        //creo lista
        let list = document.createElement('div');
        list.classList.add('row')
        this.list = list;

        //inserisco gli elementi nei rispettivi container
        formContainer.append(this.input,this.button)
        listContainer.append(list)
        this.target.append(formContainer,listContainer)

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