import { Component, OnInit } from '@angular/core';
import { PostModule } from '../post/post';
import {POST_API} from '../pages/home/home.component'



@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})



export class FormComponent implements OnInit {

  constructor() { }



  ngOnInit(): void {
  }

  newPost:PostModule = new PostModule('','','');

  addNewPost():void{
    let postCopy = Object.assign({}, this.newPost)

    let option = {
      method: "POST",
      body: JSON.stringify(postCopy),
      headers: {
          "content-type": "application/json"
      }
    }

    fetch(POST_API, option)
    .then(res => res.json())
    .then(() => {
      this.newPost = new PostModule('','','')
    })
  }
}
