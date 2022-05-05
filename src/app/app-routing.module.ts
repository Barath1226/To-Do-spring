import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SignupComponent } from './signup/signup.component';
import { TodoComponent } from './todo/todo.component';

const routes: Routes = [
  
  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'navbar', component:NavbarComponent},
  {path:'signup', component:SignupComponent},
  {path:'todo', component:TodoComponent},
  {path:'login', component:LoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
