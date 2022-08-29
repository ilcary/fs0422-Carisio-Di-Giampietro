interface Iuser{
    nome: string;
    cognome: string;
    email: string;
    password: string;
}

class User implements Iuser{
    nome: string;
    cognome!: string;
    email!: string;
    password!: string;
    constructor(nome:string){
        this.nome = nome
    }
}

let user:Iuser = new User('Mario');
