
document.write('Hello World!');
document.write('Hello World!');

document.getElementById('test').innerHTML = 'ciao';
document.getElementById('test').style.backgroundColor = 'red';

// console.log('$c ciao','color:red');
console.log('posso scrivere quello che voglio');
console.log(3 + 4);


// commento a una sola riga

/*
commento
su più righe */

/* variabili*/

var nomeVariabile = 'ciao';

var a = 4;
var b = 5;

console.log(a, b)
console.log(a + b)


console.log(c)
var c = 5
console.log(c)

a = 1
console.log(a)


/**tipi di dato
  
  number
  string
  boolean
  array
  object

 */

  var x = 5 // variabile numerica
  var y = '5' // variabile stringa
  console.log(y + y)
  console.log(x + x)

  var nome ='Mario'
  var saluto = 'Ciao'

  console.log(saluto + ' '+ nome + 'sono già le ' + y)

var b = true; //variabile booleana

  var h = [1,2,3,4,40,'ciao']; // variabile array
console.log(h[5])

var o = { // variabile oggetto
    nome: "edoardo",
    eta: 27,
    sposato: false,
}

console.log( o.nome, o.sposato)
console.table(o)
console.log(o)

/*
conversioni e operazioni
operatori matematizi

*=moltiplicazione
+=somma
-=sottrazione
/=divisione

*/

a = 2;
b = 2;

console.log(a / b)

c = '2'

d = b +c; //string

console.log(d)// la variabile numerica ha subito una conversione in stringa

console.log(b * c)//conversione di c in numero

e = '2a'
console.log(a * e)// not a number (NaN)

console.log()

//casting

console.log(typeof c, typeof a)

console.log(typeof String(a) ) // conversione in stringa usando String()


/*
 funzioni
*/

function saluta(){// la funzione saluta e stata definita, ma non verrà mai eseguita se non sarà invocata in maniera diretta
console.log('ciao');
}



saluta();
saluta();
saluta();