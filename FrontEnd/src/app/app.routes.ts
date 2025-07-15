import { Component } from '@angular/core';
import { Routes } from '@angular/router';

import { Men } from './Categories/men/men';
import { Women } from './Categories/women/women';
import { Kids } from './Categories/kids/kids';
import { Contact } from './Pages/contact/contact';
import { Home } from './Pages/home/home';
import { Login } from './Pages/login/login';
import { Signup } from './Pages/signup/signup';
import { Cart } from './Pages/cart/cart';
import { Checkout } from './Pages/checkout/checkout';
import { Admin } from './Pages/admin/admin';

export const routes: Routes = [
    { path: '', component: Home },
    { path: 'men', component: Men },
    { path: 'women', component: Women },
    { path: 'kids', component: Kids },
   
    { path: 'contact', component: Contact },
    { path: 'login', component: Login },
    { path: 'signup', component: Signup },
    { path: 'cart', component: Cart },
    { path: 'checkout', component: Checkout },
    { path: 'admin', component: Admin },

];
