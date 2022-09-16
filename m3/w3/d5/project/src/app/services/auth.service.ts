import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AuthResponse } from '../models/auth-response';
import { ILogin } from '../models/ilogin';
import { IRegister } from '../models/iregister';
import { User } from '../models/user';



@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpClient) { }

  apiUrl:string = 'http://localhost:3000'

  register(registerData:IRegister){
    return this.http.post<AuthResponse>(this.apiUrl+'/register', registerData)
  }

  login(loginData:ILogin){
    return this.http.post<AuthResponse>(this.apiUrl+'/login', loginData)
  }

  isUserLogged():boolean{
    return localStorage.getItem('access') != null
  }

  getLoggedUser():User{
    let db = localStorage.getItem('access')
    return db ? JSON.parse(db).user : null
  }
  getAccessToken():string{
    let db = localStorage.getItem('access')
    console.log(db);

    return db ? JSON.parse(db).accessToken : null
  }

  saveAccessData(data:AuthResponse):void{
    localStorage.setItem('access',JSON.stringify(data))
  }

  logOut(): void{
    localStorage.removeItem('access')
  }

}
