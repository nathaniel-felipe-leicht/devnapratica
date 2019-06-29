import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovimentoEstoqueFormComponent } from './views/movimentoEstoque-form/movimentoEstoque-form.component';
import { MovimentoEstoqueListComponent } from './views/movimentoEstoque-list/movimentoEstoque-list.component';
import { MovimentoEstoqueRouterModule } from './movimentoEstoque.routing';
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
import { MovimentoEstoqueResolver } from './views/movimentoEstoque-form/movimentoEstoque.resolver';

@NgModule({
  declarations: [MovimentoEstoqueFormComponent, MovimentoEstoqueListComponent],
  imports: [
    CommonModule,
    MovimentoEstoqueRouterModule,
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
    MovimentoEstoqueResolver
  ]
})
export class MovimentoEstoqueModule { }
