const style =[
    'color: salmon',
    'background: wheat',
    'font-size: 25px',
    'border: 1px solid red',
  ].join(';');

interface ISmartphone {
    carica: number;
    numeroChiamate: number;
    costoPerMinuto: number;

    ricarica(unaRicarica: number): void;
    chiamata(minutiDurata: number): void;
    numero404(): number;
    getNumeroChiamate(): number;
    azzeraChiamate(): void;

}

class firstUser implements ISmartphone {

    carica: number;
    numeroChiamate: number;
    costoPerMinuto: number;

    constructor(__carica: number) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }



    ricarica(unaRicarica: number): void {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata: number): void {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2)
        this.carica = +credito // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++
    }
    numero404(): number {
        return this.carica
    }
    getNumeroChiamate(): number {
        return this.numeroChiamate
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }

}

let primoUtente = new firstUser(15)
console.log('%cPRIMO UTENTE',style);
console.log(primoUtente);
primoUtente.chiamata(6)
primoUtente.chiamata(3)
console.log(`il numero di chiamate da lei effettuate è ${primoUtente.numeroChiamate}`);
console.log(`${primoUtente.numero404()}€ è il credito dopo le due chiamate`);
primoUtente.azzeraChiamate();
console.log(primoUtente);


class secondUser implements ISmartphone {

    carica: number;
    numeroChiamate: number;
    costoPerMinuto: number;

    constructor(__carica: number) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }



    ricarica(unaRicarica: number): void {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata: number): void {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2)
        this.carica = +credito // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++
    }
    numero404(): number {
        return this.carica
    }
    getNumeroChiamate(): number {
        return this.numeroChiamate
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }

}

let secondoUtente = new secondUser(15)
console.log('%cSECONDO UTENTE',style);
console.log(secondoUtente);
secondoUtente.chiamata(10)
secondoUtente.chiamata(6)
console.log(`il numero di chiamate da lei effettuate è ${secondoUtente.numeroChiamate}`);
console.log(`${secondoUtente.numero404()}€ è il credito dopo le due chiamate`);
secondoUtente.azzeraChiamate();
console.log(secondoUtente);


class thirdUser implements ISmartphone {

    carica: number;
    numeroChiamate: number;
    costoPerMinuto: number;

    constructor(__carica: number) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }



    ricarica(unaRicarica: number): void {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata: number): void {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2)// with the method toFixed we leave only the decimal we want by a parameter, it return a string so:
        this.carica = +credito // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++
    }
    numero404(): number {
        return this.carica
    }
    getNumeroChiamate(): number {
        return this.numeroChiamate
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }

}

let terzaUtente = new thirdUser(15)
console.log('%cTERZO UTENTE',style);
console.log(terzaUtente);
terzaUtente.chiamata(12)
terzaUtente.chiamata(29)
console.log(`il numero di chiamate da lei effettuate è ${terzaUtente.numeroChiamate}`);
console.log(`${terzaUtente.numero404()}€ è il credito dopo le due chiamate`);
terzaUtente.azzeraChiamate();
console.log(terzaUtente);
