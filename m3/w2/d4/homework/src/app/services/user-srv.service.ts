import { Injectable } from '@angular/core';
import { User } from '../class/user';

@Injectable({
  providedIn: 'root'
})
export class UserSrvService {

  constructor() { }

  allUsers:User[] = []

  lastId:number = 0;

  getAllUsers():User[] {
    return this.allUsers
  }

  getUserById(id:number):User|null {
    let foundUser = this.allUsers.find((user:User) => user.id === id);
    return foundUser ||null
  }

  addUser(user:User):void {
    user = Object.assign({}, user);
    this.lastId++
    user.id = this.lastId
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
