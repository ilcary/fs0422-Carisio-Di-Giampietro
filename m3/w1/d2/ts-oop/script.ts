class User{

    protected id:number|undefined;
    private name: string;
    private cognome: string;
    public role: string = 'user';

    constructor(name:string, cognome:string){
        this.name = name;
        this.cognome = cognome;
    }

    public saluto():void{
        console.log(`Ciao, mi chiamo ${this.name} ${this.cognome}`);
    }

    get getName():string{
        return this.name;
    }

    set setId(id:number){
        this.id = id;
    }
}

let user1 = new User('Mario','Rossi');

//console.log(user1.name)//non posso perchè name è private
user1.saluto()

console.log( user1.getName )

user1.setId = 5;


class Admin extends User{
    public role:string = 'Admin';
    private fullAccess:boolean;
    constructor(name:string, cognome:string,fullAccess:boolean) {
        super(name, cognome)
        this.fullAccess = fullAccess;
    }
}

let admin = new Admin('Maria','Bianchi', true);

console.log( admin.role )
console.log( admin.getName )
console.log( admin )
admin.saluto()