import { Component } from '@angular/core';

import { RouterModule, RouterOutlet } from '@angular/router';
import { Navbar } from '../../Components/navbar/navbar';
import { Footer } from '../../Components/footer/footer';
import { ZayraService } from '../../zayra-service';

@Component({
  selector: 'app-home',
  imports: [RouterModule],
  templateUrl: './home.html',
  styleUrls: ['./home.css']
})
export class Home {
  data: any[] = [];
  constructor(private service: ZayraService) {
    this.service.getAllProducts().subscribe((response: any) => { 
      this.data = response;
      console.log(this.data);
    });
  }}
