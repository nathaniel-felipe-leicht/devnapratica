import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PedidoFormComponent } from './views/pedido-form/pedido-form.component';
import { PedidoListComponent } from './views/pedido-list/pedido-list.component';
import { PedidoRouterModule } from './pedido.routing';
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
import { PedidoResolver } from './views/pedido-form/pedido.resolver';

@NgModule({
  declarations: [PedidoFormComponent, PedidoListComponent],
  imports: [
    CommonModule,
    PedidoRouterModule,
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
    PedidoResolver
  ]
})
export class PedidoModule { }
