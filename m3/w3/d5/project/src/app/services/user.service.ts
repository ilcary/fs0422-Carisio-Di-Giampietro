import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  apiUrl:string = 'http://localhost:3000/users'

  constructor(private http: HttpClient) { }

  allUsers:User[] = []


  getAllUsers():Observable<User[]> {
    return this.http.get<User[]>(this.apiUrl)
  }

  getUserById(id:number):User|null {
    let foundUser = this.allUsers.find((user:User) => Number(user.id) === id);
    return foundUser ||null
  }

  addUser(user:User):void {
    user = Object.assign({}, user);
    this.allUsers.push(user);
  }

  deleteUser(post:User):Observable<User>{
    return this.http.delete<User>(this.apiUrl + '/' + post.id)
  }

  editUser(user:User):void{
    let index = this.allUsers.findIndex(user => user.id == user.id)
    this.allUsers.splice(index,1, user)
  }
}
