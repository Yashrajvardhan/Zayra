import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-men',
  imports: [CommonModule],
  templateUrl: './men.html',
  styleUrl: './men.css'
})
export class Men {
   products = [
    {
      name: 'Casual Cotton Tee',
      price: '$29.99',
      image: 'assets/images/tee.jpg'
    },
    {
      name: 'Slim Fit Jeans',
      price: '$69.00',
      image: 'assets/images/jeans.jpg'
    },
    {
      name: 'Comfort Hoodie',
      price: '$45.00',
      image: 'assets/images/hoodie.jpg'
    },
    {
      name: 'Linen Blend Shirt',
      price: '$59.99',
      image: 'assets/images/linen.jpg'
    },
    {
      name: 'Sporty Shorts',
      price: '$34.99',
      image: 'assets/images/shorts.jpg'
    },
    {
      name: 'Lightweight Jacket',
      price: '$85.00',
      image: 'assets/images/jacket.jpg'
    }
  ];

}
