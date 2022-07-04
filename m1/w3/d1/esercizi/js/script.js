var bloccoRosso = document.getElementById("blocco-rosso");//HTMLElement, ricevo un solo elemento
console.log(bloccoRosso)
console.log(bloccoRosso.id)
console.log(bloccoRosso.innerHTML)//innerHTML è una proprietà degli ogetti HTML, che comprende il contenuto dell'elemento preso in causa
//bloccoRosso.style.backgroundColor = 'red';


var div = document.getElementsByTagName('div'); // array di elementi
console.log(div)
console.log(div.innerHTML)
div[1].style.backgroundColor = 'blue';
div[2].style.backgroundColor = 'blue';
div[3].style.backgroundColor = 'blue';

var blocchiGialli = document.getElementsByClassName('blocchi-gialli')

console.log(blocchiGialli)


blocchiGialli[0].style.backgroundColor = 'yellow';
blocchiGialli[1].style.backgroundColor = 'yellow';
blocchiGialli[2].style.backgroundColor = 'yellow';

/*

*/
var bloccoRosso = document.querySelector('#blocco-rosso')

//accetta qualunque query di css, restituisce il primo elemento trovato

var primoBloccoNew = document.querySelector('.blocchi-gialli')//il primo elementi con la classe blocchi-gialli'

var BlocchiGialliNew = document.querySelectorAll('.blocchi-gialli')//array


/*funzione*/

function saluta(){
alert('ciao')
bloccoRosso.style.backgroundColor = 'red';
}
