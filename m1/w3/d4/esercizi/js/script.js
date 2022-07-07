
function acronimo(text) {
    return text
      .split(' ')
      .reduce(function(accumulator, word) {
        return accumulator + word.charAt(0);
      }, '');
  }
  
  console.log(acronimo('Mario Rossi'));

let x = 'Domenico';

let persone = ['Silvio', 'Alessio', 'Mirko', 'Alessandro',x]

console.log(persone)   
console.log(persone[2])
console.log(persone.length)

persone.push('Davide', 'Giuliana')// aggiungo con .push Davide e Giuliana

console.log(persone) 

persone.pop()// Davide si lascia con Giuliana quindi la levo dalle persone con cui potrei uscire con il metodo .pop

console.log(persone) 

let scelta = Math.floor(Math.random() * persone.length)// scelgo una persona a caso con cui uscire

console.log(`Questa sera esco con: ${persone[scelta]}`)
   
