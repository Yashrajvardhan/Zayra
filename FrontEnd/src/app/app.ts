import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from './Components/navbar/navbar';
import { Footer } from './Components/footer/footer';
import { Home } from './Pages/home/home';
import { ZayraService } from './zayra-service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Navbar,Footer],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit {
  protected title = 'Zayra';
   ngOnInit(): any {
        
  }
  constructor(private service: ZayraService){
    this.service.getConnection().subscribe({next: data => {console.log(data)}} );
  }

  
}
