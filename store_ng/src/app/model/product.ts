import {Shop} from "./shop";
import {BaseModel} from "./base-model";

export class Product extends BaseModel{
  description: string;
  name: string;
  image:string;
  amount: number;
  size: number;
  visible: boolean;
  price: number;
  shops: Shop[];
}
