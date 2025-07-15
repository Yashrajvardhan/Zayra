import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { get } from 'node:http';

@Injectable({
  providedIn: 'root'
})
export class ZayraService {
private baseUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { 
    
  }
  getConnection(){
    return this.http.get(this.baseUrl, {responseType:'text'});
  }

  getUsers(){
    return this.http.get(this.baseUrl.concat("carts"));
  }


  getUserById(userId: number) {
    return this.http.get(`${this.baseUrl}${userId}`);
  } 

  getAllProducts(){
    return this.http.get(this.baseUrl.concat("products"));
  }
}
