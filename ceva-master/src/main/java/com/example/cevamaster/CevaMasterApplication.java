package com.example.cevamaster;

import com.example.cevamaster.build.*;
import com.example.cevamaster.build.enums.FormaPagamento;
import com.example.cevamaster.build.enums.TipoCerveja;
import com.example.cevamaster.build.service.PedidoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;


public class CevaMasterApplication {
    public static void main(String[] args) {
        Endereco endereco1 = Endereco.builder()
                .logradouro("Rua Professor Cristiano Fischer, 1238")
                .build();

        Usuario usuario1 = Usuario.builder()
                .username("Cailan")
                .endereco(endereco1)
                .build();

        Cerveja polar = Cerveja.builder()
                .nome("Polar")
                .tipoCerveja(TipoCerveja.IPA)
                .valor(BigDecimal.valueOf(10))
                .build();

        Pedido pedido1 = Pedido.builder()
                .id(1)
                .usuario(usuario1)
                .produtos(List.of(polar))
                .formaPagamento(FormaPagamento.PIX)
                .build();

        PedidoService concluirPedido = new PedidoService();
        concluirPedido.efetuarPedido(pedido1);
    }
}
