import { Component } from "@angular/core";
import { HolaComponent } from "./hola/hola.component";

@Component({
  selector: "app-root",
  imports: [HolaComponent],
  templateUrl: "./app.component.html",
  styleUrl: "./app.component.scss",
})
export class AppComponent {
  title = "angular-template";
}
