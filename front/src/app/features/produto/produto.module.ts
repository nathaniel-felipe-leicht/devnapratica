import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProdutoFormComponent } from './views/produto-form/produto-form.component';
import { ProdutoListComponent } from './views/produto-list/produto-list.component';
import { ProdutoRouterModule } from './produto.routing';
import { TableModule } from 'primeng/table';
import { AutoCompleteModule } from 'primeng/autocomplete';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { ReactiveFormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { KeyFilterModule } from 'primeng/keyfilter';
import { CalendarModule } from 'primeng/calendar';
import { RadioButtonModule } from 'primeng/radiobutton';
import { MessageService } from 'primeng/api';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { ProdutoResolver } from './views/produto-form/produto.resolver';

@NgModule({
  declarations: [ProdutoFormComponent, ProdutoListComponent],
  imports: [
    CommonModule,
    ProdutoRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    AutoCompleteModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,
    ToastModule
  ],
  providers: [
    MessageService,
    ProdutoResolver
  ]
})
export class ProdutoModule { }
