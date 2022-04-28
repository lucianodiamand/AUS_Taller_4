import { Injectable } from '@angular/core';
import { Hero } from './hero';

const HEROES: Hero[] = [
  { nombre: 'Super', apellido: 'Man' },
  { nombre: 'Bat', apellido: 'Man' }
];

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor() {
    console.log('Me inicializaron');
  }

  getHeroes(): Hero[] {
    return HEROES;
  }
}
