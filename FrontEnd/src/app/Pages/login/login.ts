import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [RouterModule,CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {

}
