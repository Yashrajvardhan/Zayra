import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-women',
  imports: [CommonModule],
  templateUrl: './women.html',
  styleUrl: './women.css'
})
export class Women {
 products: {
    id: number;
    name: string;
    price: number;
    image: string;
  }[] = [
    { id: 1, name: 'Summer Dress', price: 54.5, image: 'assets/img/women/elegant-summer-dress.jpg' },
    { id: 2, name: 'Casual Blouse', price: 39.99, image: 'assets/img/women/chic-casual-blouse.jpg' },
    { id: 3, name: 'Casual Blouse', price: 39.99, image: 'assets/img/women/chic-casual-blouse.jpg' },
    // ... rest
  ];

  addToCart(product: { id: number; name: string; price: number; image: string }) {
    console.log(`Added to cart: ${product.name}`);
  }
}
