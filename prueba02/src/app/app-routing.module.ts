import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DosComponent } from './dos/dos.component';
import { UnoComponent } from './uno/uno.component';

const routes: Routes = [
  { path: 'uno', component: UnoComponent },
  { path: 'dos/:id', component: DosComponent },
  { path: '', redirectTo: '/dos', pathMatch: 'full' },
  { path: '**', component: DosComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
