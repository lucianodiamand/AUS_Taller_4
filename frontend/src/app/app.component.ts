import { Component } from "@angular/core";
import { HolaComponent } from "./hola/hola.component";
import { PersonaListComponent } from "./persona-list/persona-list.component";

@Component({
  selector: "app-root",
  imports: [PersonaListComponent],
  templateUrl: "./app.component.html",
  styleUrl: "./app.component.scss",
})
export class AppComponent {
  title = "angular-template";
}
