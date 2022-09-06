export class User {
  id:number|undefined;
  name!:string;
  email!:string;

  constructor (id:number|undefined, name:string, email:string) {
  }
}
