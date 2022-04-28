import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../persona.service';

@Component({
  selector: '[repo]',
  templateUrl: './reportes.component.html',
  styleUrls: ['./reportes.component.css']
})
export class ReportesComponent implements OnInit {

  dato1: string = 'Zapato';
  fecha: Date = new Date();

  constructor(private servicio: PersonaService) {
    console.log('Se inicializa el repo');
  }

  ngOnInit(): void {
  }

  cambiarValor(): void {
    this.dato1 = 'Chau';
  }
}
