import { Component, OnInit } from '@angular/core';

export const POST_API:string = 'http://localhost:3000/Posts'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {
    this.getAllPosts();
  }


  posts: {
    userId: number;
    id: number;
    title: string;
    body: string;
    active: boolean;
    like: number;
  }[] = [];

   activePosts: {
    userId: number;
    id: number;
    title: string;
    body: string;
    active: boolean;
    like: number;
  }[] = [];

  getAllPosts() {

      fetch(POST_API)
      .then(response => response.json())
      .then(response => {
        (this.activePosts = response.filter((p: { active: boolean; }) => p.active === true))})
      .catch(err => {
        throw new Error('Error fetching photos: ' + err.message);
      })
  }

  mettiLike(id: number){
    let pst:{
      userId: number;
      id: number;
      title: string;
      body: string;
      active: boolean;
      like: number;
    }|undefined = this.posts.find(p => p.id === id);
    console.log(pst);
    console.log(id);

    console.log(pst!.like);
    pst!.like++
    console.log(pst!.like);


    let options = {
      method:"PATCH",
      body: JSON.stringify({
        like: pst!.like,
      }),
      headers:{
        "content-type":"application/json"
      }

    }

      fetch(POST_API+'/'+pst!.id,options)
      .then(res=> res.json())
      .then((res)=>{

        console.log(res.like);

      })

    }

  }


