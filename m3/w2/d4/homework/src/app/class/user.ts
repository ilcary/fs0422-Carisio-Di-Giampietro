export class User {
  name:string;
  lastname:string;
  btd: Date;
  id: number|undefined;
  constructor(name:string, lastname:string, btd: Date , id?:number) {
    this.name = name;
    this.lastname = lastname;
    this.btd = btd;
    this.id = id;
}
}
