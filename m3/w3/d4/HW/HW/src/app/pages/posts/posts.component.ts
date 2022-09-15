import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

type post = {
  title: string,
  content: string
}


@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.scss']
})
export class PostsComponent implements OnInit {

  allPosts!: post[]

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getAllPosts().subscribe({
      next: res => this.allPosts = res,
      error: err => console.log(err)

    })
  }

  apiUrl:string = 'http://localhost:3000/post'

  getAllPosts(){
    return this.http.get<post[]>(this.apiUrl)
  }
}
