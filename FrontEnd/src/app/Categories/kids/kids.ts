import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-kids',
  imports: [CommonModule],
  templateUrl: './kids.html',
  styleUrl: './kids.css'
})
export class Kids {
 products = [
    {
      id: 1,
      name: "Kids' Dino T‑Shirt",
      price: 499,
      image: 'assets/img/kids/kids-dino-tshirt.jpg',
    },
    {
      id: 2,
      name: "Girls' Floral Dress",
      price: 799,
      image: 'assets/img/kids/girls-floral-dress.jpg',
    },
    {
      id: 3,
      name: "Boys' Adventure Shorts",
      price: 349,
      image: 'assets/img/kids/boys-adventure-shorts.jpg',
    },
    {
      id: 4,
      name: "Toddler's Cozy Hoodie",
      price: 649,
      image: 'assets/img/kids/toddlers-cozy-hoodie.jpg',
    },
  ];

  addToCart(product: any): void {
    console.log(`Added to cart: ${product.name}`);
  }
}
