import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {

  items = [
    {
      label: 'Cliente',
      routerLink: '/clientes'
    },
    {
      label: 'Produtos',
      routerLink: '/produtos'
    },
    {
      label: 'Movimentos de Estoque',
      routerLink: '/movimentosEstoque'
    },
    {
      label: 'Pedidos',
      routerLink: '/pedidos'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
