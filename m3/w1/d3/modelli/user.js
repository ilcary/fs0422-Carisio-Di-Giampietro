"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.User = void 0;
const Address_1 = require("./Address");
class User {
    constructor(name, lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    set setAddress(address) {
        this.address = address;
    }
    set setBillingAddress(address) {
        this.billingAddress = address;
    }
}
exports.User = User;
let user = new User('Mario', 'Rossi');
////////////
let address = new Address_1.Address('via roma 1', 'Roma', 'Itali', 67051);
user.setAddress = address;
