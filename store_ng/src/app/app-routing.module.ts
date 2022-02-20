import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SneakerListComponent} from "./list/sneaker-list/sneaker-list.component";

const routes: Routes = [
  { path: 'products/sneakers', component: SneakerListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
