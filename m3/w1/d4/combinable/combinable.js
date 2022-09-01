/**
 * abbastanza chiaro, definisco un combinable quidni un nuov tipo
 * dato per la tipizzazione
 *
 * strnum e' il combinable
 */
var x = '4';
var y = 4;
function combina(input1, input2) {
    if (typeof input1 === 'number' && typeof input2 === 'number') {
        var result = Number(input1) + Number(input2);
        return result;
    }
    else {
        var result = input1 + ' ' + input2;
        return result;
    }
}
console.log(combina('ciao', 'Mario'));
console.log(combina(4, 5));
console.log(combina('Ciao', 5));
console.log(combina(3, '5'));
console.log(combina('3', '5'));
//devo rispettare il formato altrimenti mi va in errore
var amministratore = {
    name: 'Mario',
    privileges: ['tutti']
};
var dipendente = {
    start: new Date,
    skills: ['popipopi']
};
//questo deve avere le proprieta' di Admin ed Employee
var megaDipendente = {
    name: 'Piero',
    privileges: ['tutti'],
    start: new Date,
    skills: ['popipopi']
};
var ugo = {
    name: 'Ugo',
    privileges: ['tutti'],
    start: new Date,
    skills: ['popipopi']
};
