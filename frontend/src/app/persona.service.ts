import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { PersonaDto } from "./persona-list/persona-dto";

@Injectable({
  providedIn: "root",
})
export class PersonaService {
  constructor(private readonly http: HttpClient) {}

  getPersonas(): Observable<PersonaDto[]> {
    return this.http.get<PersonaDto[]>("http://localhost:8080/persona");
  }

  savePersona(persona: PersonaDto): Observable<PersonaDto[]> {
    return this.http.post<PersonaDto[]>(
      "http://localhost:8080/persona",
      persona
    );
  }
}
