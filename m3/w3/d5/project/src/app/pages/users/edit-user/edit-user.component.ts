import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.scss']
})
export class EditUserComponent implements OnInit {





  form!: FormGroup

  constructor(
    private auth: AuthService,
    private userSrv: UserService,
    private router: Router,
    private activeRoute: ActivatedRoute
    ) { }

    actualUserId: number = Number(this.activeRoute.snapshot.paramMap.get('id'))

  ngOnInit(): void {
    let actualUser = this.userSrv.getUserById(this.actualUserId)
    if(actualUser)
    this.form = new FormGroup({
      name: new FormControl(actualUser.name, Validators.required),
      email: new FormControl(actualUser.email, Validators.required),
      password: new FormControl(null, Validators.required)
    })
  }

  submit():void{
    this.userSrv.editUser(this.form.value, this.actualUserId)
    .subscribe(user => {
      console.log(user);
      alert(`User ${user.name} update successfully you are pleased to log in with the new data`)
      this.form.reset();
      this.auth.logOut()
      this.router.navigate(['/login']);
    })
  }
}
