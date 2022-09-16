import { Injectable } from '@angular/core';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  allUsers:User[] = []


  getAllUsers():User[] {
    return this.allUsers
  }

  getUserById(id:number):User|null {
    let foundUser = this.allUsers.find((user:User) => user.id === id);
    return foundUser ||null
  }

  addUser(user:User):void {
    user = Object.assign({}, user);
    this.allUsers.push(user);
  }

  deleteUser(id: number):void{
    this.allUsers = this.allUsers.filter((u:User)=> u.id !== id)
  }

  editUser(user:User):void{
    let index = this.allUsers.findIndex(user => user.id == user.id)
    this.allUsers.splice(index,1, user)
  }
}
