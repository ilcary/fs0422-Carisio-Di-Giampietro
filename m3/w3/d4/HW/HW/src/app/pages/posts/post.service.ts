import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from 'src/app/Classes/post';


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

/**
 * export class HomeComponent implements OnInit {

  constructor(private postSvc: PostService) { }

  posts:Post[] = [];
  likesNum:number = 0;

  ngOnInit(): void {
    this.postSvc.getAllPosts().subscribe(
      {
        next: res => {
          this.posts = res;
          this.likesNum = this.posts.filter(p => p.like == true).length;
        },
        error: error => console.log(error)
      }
    )
  }

  deletePost(post: Post): void {
    this.postSvc.deletePost(post).subscribe(res => {
      let index:number = this.posts.findIndex(p => p.id === post.id)
      this.posts.splice(index, 1);
    })
  }

  like(post:Post):void{
    post.like = !post.like;
    this.postSvc.editPost(post).subscribe(res => {
      let index:number = this.posts.findIndex(p => p.id === post.id)
      this.posts.splice(index, 1, post);
      this.likesNum = this.posts.filter(p => p.like == true).length;
    })
  }
 */
