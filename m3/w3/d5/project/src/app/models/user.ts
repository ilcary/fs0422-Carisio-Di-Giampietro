import { ILogin } from "./ilogin";

export class User implements ILogin {
  id:number | undefined;
  name: string;
  email: string;
  password: string;

  constructor(name: string, email: string, password: string){
    this.name = name;
    this.email = email
    this.password = password
  }
}
