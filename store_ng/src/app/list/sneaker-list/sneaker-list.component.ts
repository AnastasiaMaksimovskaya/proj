import { Component, OnInit } from '@angular/core';
import {Sneaker} from "../../model/products/sneaker";
import {SneakerServiceService} from "../../service/sneaker-service.service";

@Component({
  selector: 'app-sneaker-list',
  templateUrl: './sneaker-list.component.html',
  styleUrls: ['./sneaker-list.component.css']
})
export class SneakerListComponent implements OnInit {

  sneakers: Sneaker[];

  constructor(private sneakerService: SneakerServiceService) { }

  ngOnInit(): void {
    this.sneakerService.findAll().subscribe(data => {
      this.sneakers = data;
    });
  }
}
