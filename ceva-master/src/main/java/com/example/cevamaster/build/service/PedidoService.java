package com.example.cevamaster.build.service;

import com.example.cevamaster.build.Pedido;

public class PedidoService {
    //A classe tem um objetivo simples e direto, atuar apenas como um serviço para efetuar um pedido.
    public void efetuarPedido(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " efetuado com sucesso!");
        System.out.println("Valor total: " + pedido.calcularValorTotal());
        System.out.println("Enviar para: " + pedido.getUsuario());
        System.out.println("Endereço: " + pedido.getUsuario().getEndereco().getLogradouro());
    }
}
