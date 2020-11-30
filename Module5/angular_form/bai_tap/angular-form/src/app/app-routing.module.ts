import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TodoComponent} from './todo/todo.component';
import {FormAngularComponent} from './form-angular/form-angular.component';


const routes: Routes = [
  {path: 'todo', component: TodoComponent},
  {path: 'angular-form', component: FormAngularComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
