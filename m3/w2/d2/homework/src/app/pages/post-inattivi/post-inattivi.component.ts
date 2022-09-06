import { Component, OnInit } from '@angular/core';
import { POST_API } from '../home/home.component';

@Component({
  selector: 'app-post-inattivi',
  templateUrl: './post-inattivi.component.html',
  styleUrls: ['./post-inattivi.component.scss']
})
export class PostInattiviComponent implements OnInit {

  constructor() { }
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



  getAllPosts(): void{

      fetch(POST_API)
      .then(response => response.json())
      .then(response => {
        (this.posts =response)})
      .catch(err => {
        throw new Error('Error fetching photos: ' + err.message);
      })
  }

  activePost(id: number,active: boolean){
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

    console.log(pst!.active);
    pst!.active = !active
    console.log(pst!.active);


    let options = {
      method:"PATCH",
      body: JSON.stringify({
        active: active,
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
