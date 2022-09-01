"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
/**
 *
 * logger e' il decoratr, serve a decorare classi metodi proprieta funzioni
 * ed e' di fatto una funzione che si aggancia ad una struttura per
 * aggiungere funzionalita'
 *
 * in angular saranno gia pronti e se collegate ad una determinata classse o
 * prioprieta andranno a fare delle modifice o delle
 * aggiunte alle cose sulle cui li attacco
 *
 * Sul nostro decoratore logger il conosole log di f ci serve
 * a vedere su quale funzione/x si attacca,
 * in questo caso si vede sul log che si attacca al [class Person]
 *
 */
function logger(f) {
    console.log('....loading');
    console.log(f);
}
//da abilitare "experimental decorator" nel ts confing
// 
// il decoratore va scritto attaccato alla clsse/funzione/ecc
// sulla quale devo attaccarlo
let Person = class Person {
    constructor() {
        this.name = 'Mario';
        console.log('istanziato');
    }
};
Person = __decorate([
    logger
], Person);
let person = new Person();
console.log(person);
//----------------------------
function AggiungiMetodo(f) {
    console.log(f);
    f.prototype.mostraNome = function () {
        console.log('Gusto: ' + this.gusto);
    };
    f.prototype.prezzo = 5;
    f.prototype.mostraPrezzo = function () {
        console.log('Prezzo: ' + this.prezzo);
    };
}
let Pizza = class Pizza {
    constructor() {
        this.gusto = 'Margherita';
    }
};
Pizza = __decorate([
    AggiungiMetodo
], Pizza);
let margherita = new Pizza();
margherita.mostraNome();
margherita.mostraPrezzo();
