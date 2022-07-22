
// var to do list
let addToDoButton = document.getElementById('addToDo');
let toDoContainer = document.getElementById('toDoContainer');
let inputField = document.getElementById('input-field');

let  toDoList = [];

//script to do list
addToDoButton.addEventListener('click', function(){
    var paragraph = document.createElement('p');
    paragraph.classList.add('paragraph-styling');
    paragraph.innerText = inputField.value; //da capire perche value e non innerText
    toDoContainer.appendChild(paragraph);

    // var check = document.createElement('input');
    // check.setAttribute('type', 'checkbox');
    // paragraph.appendChild(check);
    // check.setAttribute('id', 'checkToDo')

    // ifChecked();

    inputField.value = '';
    paragraph.addEventListener('click', function(){
        // paragraph.style.textDecoration = 'line-through';
        paragraph.style = 'color: green;';
    })
    paragraph.addEventListener('dblclick', function(){
        toDoContainer.removeChild(paragraph);
    })

    toDoList.push(paragraph);
    console.log(toDoList);
})



//var menu drop
// let modifiche = document.querySelectorAll('.slide li');


// for(let mod of modifiche){
//     mod.addEventListener('click', () => {
//         let formato = mod.getAttribute('data-formato');
//         console.log(formato + '');
        
//             for(let box of toDoList){
//                 console.log(box.getAttribute('checked') + ' ');
//                 if(box.getAttribute('checked') == null){
//                     box.parentNode.style = formato;
//                 }
//             }

//     })
// }

// //

// function ifChecked(){
//     let test = document.querySelectorAll('#checkToDo')
//     for(let singleCheck of test){
//         singleCheck.addEventListener('change',() => {
//         console.log('sono cliccato');  
//     })
//     console.log(test);
    
// }
// }


//test ti prego devi funzioanre
let modifiche = document.querySelectorAll('.slide li');


for(let mod of modifiche){
    mod.addEventListener('click', () => {
        let formato = mod.getAttribute('data-formato');
        
            for(let toDo of toDoList){
                if(toDo.style.color == 'green'){
                    toDo.style = formato;
                }
            }

    })
}