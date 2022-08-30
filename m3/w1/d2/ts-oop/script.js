"use strict";
class User {
    constructor(name, cognome) {
        this.role = 'user';
        this.name = name;
        this.cognome = cognome;
    }
    saluto() {
        console.log(`Ciao, mi chiamo ${this.name} ${this.cognome}`);
    }
    get getName() {
        return this.name;
    }
    set setId(id) {
        this.id = id;
    }
}
let user1 = new User('Mario', 'Rossi');
//console.log(user1.name)//non posso perchè name è private
user1.saluto();
console.log(user1.getName);
user1.setId = 5;
class Admin extends User {
    constructor(name, cognome, fullAccess) {
        super(name, cognome);
        this.role = 'Admin';
        this.fullAccess = fullAccess;
    }
}
let admin = new Admin('Maria', 'Bianchi', true);
console.log(admin.role);
console.log(admin.getName);
console.log(admin);
admin.saluto();
//# sourceMappingURL=script.js.map