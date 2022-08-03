class TodoElement{
    constructor(testo, data){
        this.testo = testo;
        this.data = data;
    }
}

let button = document.querySelector('#salva');

/*opzione lunga
let coseDaFare = localStorage.getItem('lista');

if(coseDaFare){
    var jsonCoseDaFare = JSON.parse(coseDaFare);
    console.log(jsonCoseDaFare);
}else{
    var jsonCoseDaFare = [];
}
*/

let coseDaFare = localStorage.getItem('lista') ? JSON.parse(localStorage.getItem('lista')) : [];//metodo fast
//let coseDaFare = JSON.parse(localStorage.getItem('lista') || '[]'); metodo super fast

for(let cosa of coseDaFare){
   console.log(cosa.testo, cosa.data)
   creaTodo(cosa.testo, cosa.data)
}



button.addEventListener('click',function(e){

    e.preventDefault();//blocco l'invio del form

    let testo = document.querySelector('#testo');
    let data = document.querySelector('#data');

    //creo l'html
    creaTodo(testo.value, data.value)


    let todo = new TodoElement(testo.value, data.value)
    coseDaFare.push(todo)

    let todoJson = JSON.stringify(coseDaFare);//trasformo l'oggetto in stringa json
    localStorage.setItem('lista', todoJson)//salvo l'oggetto

    //svuoto i campi
    document.querySelector('#formTodo').reset()//resetto tutti i campi del form

})

function creaTodo(testo, data){
    let div = document.createElement('div');//<div></div>
    div.innerHTML = testo;//<div>Comprare l'insalata</div>
    div.classList.add('alert','alert-success');//<div class="alert alert-success">Comprare l'insalata</div>
    
    let dataDiv = document.createElement('div');//<div></div>
    dataDiv.innerText = data;//<div>02/02/1991</div>
    
    div.append(dataDiv);//<div class="alert alert-success">Comprare l'insalata<div>02/02/1991</div></div>
    document.querySelector('#lista').append(div);
}
