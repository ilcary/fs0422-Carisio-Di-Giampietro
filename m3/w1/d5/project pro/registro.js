"use strict";
//classe per creare una carta in html tramite dei parametri
var Card = /** @class */ (function () {
    function Card(__durataChiamata, __costoChiamata) {
        this.durataChiamata = __durataChiamata;
        this.costoChiamata = __costoChiamata;
        this.createcard();
    }
    Card.prototype.takeClassAndWrite = function (card, classe, write) {
        var carta = document.querySelector();
        var element = card.querySelector(classe);
        element.textContent = write;
        return element;
    };
    //creazione dell'html tramite il duplicato in d-none
    Card.prototype.createcard = function () {
        var _a;
        var carta = (_a = document.querySelector('#cardTemplate')) === null || _a === void 0 ? void 0 : _a.cloneNode(true);
        this.takeClassAndWrite(carta, 'p', "".concat(this.durataChiamata));
        this.takeClassAndWrite(carta, 'cite', " ".concat(this.durataChiamata, " minuti, dal costo di ").concat(this.costoChiamata, " "));
        var diplay = document.querySelector('#displaycard');
        diplay === null || diplay === void 0 ? void 0 : diplay.append(carta);
    };
    return Card;
}());
/* //al caricamento della pagina lancio una funzione che mi carica tutti i messaggi
window.onload = () => {

    fetch(apiMessaggi)
    .then(res=>res.json())
    .then(mess=>{
        for(let m of mess){
            // nuova istanza di Card per ogni messaggio presente nella rotta
            new Card(m.durataChiamata, m.costoChiamata)
        }
    })

} */ 
//# sourceMappingURL=registro.js.map