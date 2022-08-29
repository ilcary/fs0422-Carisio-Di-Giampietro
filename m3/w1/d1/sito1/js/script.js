var a = 5;
var b = '5';
//b = 4//non posso assegnare numero a stringa
//commento su una riga
/*
Commento su più
righe
*/
var ternario = a < 2 ? 'è vero' : 'è falso';
console.log(ternario);
var bool = true;
if (!bool) {
    console.log('ciao');
}
//Operatore &&
console.log(bool && a < 2);
console.log(bool && a > 2);
console.log(bool && !(a > 2));
//operatore ||
console.log(bool || a < 2);
console.log(bool || a > 2);
console.log(bool || !(a > 2));
var c = b || [];
//array
var arr = ['ciao'];
var arrMisto;
if (!bool) {
}
if (bool) {
}
else {
}
/**
 * Cicli
 */
for (var i = 0; i <= 10; i++) {
    console.log(i);
}
var day = new Date().getDay();
console.log();
if (day == 0) {
    console.log('Domenica');
}
else if (day == 1) {
    console.log('Lunedì');
}
switch (day) {
    case 0:
        console.log('Domenica');
        break;
    case 1:
        console.log('Lunedì');
        break;
}
var stringa = 'Mario';
var numero = 0;
var booleano = false;
var oggetto = {};
var array = [];
var union = true;
var any = {
    nome: 'Mario',
    cognome: 'Rossi'
};
console.log(any.nome);
var sconosciuto = {
    nome: 'Mario',
    cognome: 'Rossi'
};
function saluta() {
    console.log('ciao');
}
function saluta2() {
    return 'Ciao';
}
function saluta3(saluto) {
    return saluto;
}
saluta(); //nessun argomento
saluta2(); //nessun argomento
saluta3('ciao'); //1 argomento di tipo stringa
function saluta4(saluto) {
    if (saluto === void 0) { saluto = null; }
    return saluto;
}
saluta4();
/**
 * tipizzazione oggetti
 */
var oggetto2 = {
    nome: 'Mario',
    cognome: 'Rossi'
};
console.log(oggetto2.nome);
var User = /** @class */ (function () {
    function User() {
    }
    return User;
}());
var oggetto3 = {
    nome: 'Mario',
    cognome: 'Rossi'
};
var utenti = [oggetto2, oggetto3];
/*
date
*/
var oggi = new Date();
