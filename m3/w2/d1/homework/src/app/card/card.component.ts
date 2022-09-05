import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    this.getAllPhotos();
  }

  photos: any[] = [];
  likesNum:number = 0;

  getAllPhotos(){
    fetch('http://localhost:3000/users')
    .then(res => res.json())
    .then((res) => (this.photos = res))
    .catch(err => {
      throw new Error('Error fetching photos: ' + err.message);
    })
  }

  deletePhoto(id:number):void{
    let option:{} = {
      method: "DELETE",
      headers: {
          "content-type": "application/json"
      }
    }

    fetch("http://localhost:3000/users/" + id, option)
    .then(res => res.json())
    .then(() => {
      let index = this.photos.find(u => u.id === id);
      this.photos.splice(index, 1);
      this.likesNum--
    })


  }

  checkLike(user:any):void{
    if(user.like){
      this.likesNum--
    }else{
      this.likesNum++;
    }
    user.like = !user.like


  }


}
