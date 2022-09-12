import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from '../Classes/post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private http: HttpClient) { }

  apiUrl:string = 'http://localhost:3000/posts'

  getAllPosts():Observable<Post[]>{
    return this.http.get<Post[]>(this.apiUrl)
  }

  addPost(post:Post):Observable<Post>{
    return this.http.post<Post>(this.apiUrl, post)
  }

  editPost(post:Post):Observable<Post>{
    return this.http.patch<Post>(this.apiUrl + '/' + post.id, post)
  }

  deletePost(post:Post):Observable<Post>{
    return this.http.delete<Post>(this.apiUrl + '/' + post.id)
  }

}
