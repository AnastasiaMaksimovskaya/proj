import {BaseModel} from "./base-model";

export class Shop extends BaseModel{
  name : string;
  address: string;
  openTime: string;
  closedTime: string;
}
