import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  form: FormGroup;

  constructor(
    private builder: FormBuilder,
    private service: UserService
  ) {
    this.form = this.builder.group({
      usuario: [''],
      clave: ['']
    });
  }

  ngOnInit(): void {
  }

  enviarDatos(): void {
    const usuario = this.form.get('usuario')?.value;
    const clave = this.form.get('clave')?.value;
    const user: User = new User(usuario, clave);
    this.service.guardarUsuario(user).subscribe((result) => {
      console.log(result);
    });
  
  }

}
