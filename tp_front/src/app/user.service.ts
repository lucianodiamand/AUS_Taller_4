import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url: string = environment.api;

  constructor(private http: HttpClient) { }

  guardarUsuario(user: User): Observable<User> {
    return this.http.post<User>(`${this.url}/user`, user);
  }

  obtenerUsuarios(): Observable<User[]> {
    return this.http.get<User[]>(`${this.url}/user`);
  }

  borrarUsuario(user: User): Observable<void> {
    return this.http.delete<void>(`${this.url}/user/${user.id}`);
  }
}
