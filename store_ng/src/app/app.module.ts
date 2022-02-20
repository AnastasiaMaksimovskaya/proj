import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { SneakerListComponent } from './list/sneaker-list/sneaker-list.component';
import { AppRoutingModule } from './app-routing.module';
import {SneakerServiceService} from "./service/sneaker-service.service";

@NgModule({
  declarations: [
    AppComponent,
    SneakerListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [SneakerServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
