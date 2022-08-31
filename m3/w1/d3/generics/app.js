"use strict";
function numero(x) {
    return x;
}
numero(5);
function numeroGeneric(x) {
    return x;
}
numeroGeneric(5);
function sommaOConcatena(x, y) {
}
sommaOConcatena(['ciao'], 5);
function prova(carattere1) {
    return typeof carattere1;
}
prova('a'); //ab
prova(67051); //ab
let obj = {
    prop1: 'prova',
    prop2: 67051,
};
class CustomerArray {
    constructor() {
        this.arr = []; //qui diventa un array di T
    }
    addItem(item) {
        this.arr.push(item);
    }
    getItems() {
        return this.arr;
    }
}
//# sourceMappingURL=app.js.map