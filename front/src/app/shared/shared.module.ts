import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SideNavComponent } from './common/side-nav/side-nav.component';
import { TopBarComponent } from './common/top-bar/top-bar.component';
import { FormsModule }   from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'; 
import { AutoCompleteModule } from 'primeng/primeng';

@NgModule({
  declarations: [SideNavComponent, TopBarComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AutoCompleteModule
  ]
})
export class SharedModule { }
