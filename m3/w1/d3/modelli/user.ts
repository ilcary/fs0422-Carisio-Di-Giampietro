import {Address} from "./Address";

export class User {

    id:number|undefined;
    name:string;
    lastname:string;
    address:Address|undefined;
    billingAddress:Address|undefined;
    constructor(name:string,lastname:string){
        this.name= name;
        this.lastname= lastname;
    }

    set setAddress(address:Address){
        this.address= address;
    }

    set setBillingAddress(address:Address){
        this.billingAddress= address;
    }

}

let user:User = new User('Mario','Rossi')

////////////
let address:Address = new Address('via roma 1','Roma','Itali',67051)
user.setAddress= address