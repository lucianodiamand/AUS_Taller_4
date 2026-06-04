import { AsyncPipe, NgFor } from "@angular/common";
import { Component, OnDestroy, OnInit } from "@angular/core";
import { PersonaService } from "../persona.service";
import { PersonaDto } from "./persona-dto";
import { Observable, Subscriber, Subscription } from "rxjs";

@Component({
  selector: "app-persona-list",
  imports: [NgFor, AsyncPipe],
  templateUrl: "./persona-list.component.html",
  styleUrl: "./persona-list.component.scss",
})
export class PersonaListComponent implements OnInit {
  personas$!: Observable<Array<PersonaDto>>;

  constructor(private readonly servicio: PersonaService) {}

  ngOnInit() {
    this.personas$ = this.servicio.getPersonas();
  }
}
