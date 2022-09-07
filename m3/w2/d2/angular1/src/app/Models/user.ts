export class User {

  id: number | undefined;
  name!: string;
  email!: string;

  constructor(name: string, email: string) {
    this.name = name;
    this.email = email;
  }

}
