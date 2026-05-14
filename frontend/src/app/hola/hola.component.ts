import { CommonModule, UpperCasePipe } from "@angular/common";
import { Component, inject } from "@angular/core";
import { HolaService } from "../hola.service";

@Component({
  selector: ".app-hola",
  imports: [CommonModule],
  templateUrl: "./hola.component.html",
  styleUrl: "./hola.component.scss",
})
export class HolaComponent {
  private service = inject(HolaService);
  constructor() {}

  sayHola() {
    return this.service.sayHola();
  }
}
