import { AsyncPipe, NgFor } from "@angular/common";
import { Component, OnDestroy, OnInit } from "@angular/core";
import { PersonaService } from "../persona.service";
import { PersonaDto } from "./persona-dto";
import { Observable, Subscriber, Subscription } from "rxjs";
import { FormBuilder, FormGroup, ReactiveFormsModule } from "@angular/forms";

@Component({
  selector: "app-persona-list",
  imports: [NgFor, AsyncPipe, ReactiveFormsModule],
  templateUrl: "./persona-list.component.html",
  styleUrl: "./persona-list.component.scss",
})
export class PersonaListComponent implements OnInit, OnDestroy {
  personas$!: Observable<Array<PersonaDto>>;

  personaForm: FormGroup;

  subscription!: Subscription;

  constructor(
    private readonly servicio: PersonaService,
    private readonly fb: FormBuilder
  ) {
    this.personaForm = this.fb.group({
      nombre: [""],
      apellido: [""],
    });
  }

  ngOnInit() {
    this.personas$ = this.servicio.getPersonas();
  }

  guardar() {
    console.log(this.personaForm.value);
    this.subscription = this.servicio
      .savePersona(this.personaForm.value)
      .subscribe(() => this.ngOnInit());
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }
}
