export class User {
  id?: number | undefined;
  name: string;
  lastname:string;
  active:boolean;
  constructor(name:string, lastname:string, active:boolean = true){
    this.name = name;
    this.lastname = lastname;
    this.active = active;
  }
}
