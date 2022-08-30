var _a;
function prova() {
    //non posso restituire nulla perchè la funzione restituisce void
}
function $(selettore) {
    return document.querySelector(selettore);
}
function stringa() {
    return 'ciao';
}
//dati in entrata
function bold(testo) {
    return "<b>".concat(testo, "</b>");
}
var boldCiao = bold('ciao');
console.log(boldCiao);
function creaHTMLBold(testo) {
    document.write("<b>".concat(testo, "</b>"));
}
(_a = $(".elemento")) === null || _a === void 0 ? void 0 : _a.style.color; // il simbolo? in questo caso serve a far si che gli attributi vengano letti solo se la funzione $() non restituisce null
var X = function (selettore) { return document.querySelector(selettore); };
X('.elemento');
