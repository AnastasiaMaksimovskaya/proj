import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/';
import {Sneaker} from "../model/products/sneaker";


@Injectable({
  providedIn: 'root'
})
export class SneakerServiceService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/products/sneakers';
  }

  public findAll(): Observable<Sneaker[]> {
    return this.http.get<Sneaker[]>(this.usersUrl);
  }
}
