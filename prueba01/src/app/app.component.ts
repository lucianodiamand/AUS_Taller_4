import { Component } from '@angular/core';
import { Hero } from './hero';
import { PersonaService } from './persona.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'prueba01';

  hero: Hero | null = new Hero('Super', 'Man');

  constructor(private service: PersonaService) {
    console.log('Se inicializa AppComponent');
  }

  ngOnInit() {

  }

  getHeroes(): Hero[] {
    return this.service.getHeroes();
  }
  /* mostrarNombre(): string {
    return this.hero.nombre + ' - ' + this.hero.apellido;
  } */
}
