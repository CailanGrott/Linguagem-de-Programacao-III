package com.example.cevamaster;

import com.example.cevamaster.build.*;
import com.example.cevamaster.build.enums.FormaPagamento;
import com.example.cevamaster.build.enums.StatusPedido;
import com.example.cevamaster.build.enums.TipoCerveja;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    @Test
    void testCalcularValorTotal() {
        Produto cerveja1 = Cerveja.builder()
                .nome("Cerveja Pilsen")
                .valor(BigDecimal.valueOf(3.99))
                .tipoCerveja(TipoCerveja.PILSEN)
                .volume(350)
                .teorAlcoolico(4.5)
                .build();

        Produto cerveja2 = Cerveja.builder()
                .nome("Cerveja IPA")
                .valor(BigDecimal.valueOf(5.99))
                .tipoCerveja(TipoCerveja.IPA)
                .volume(500)
                .teorAlcoolico(6.5)
                .build();

        Usuario usuario = Usuario.builder()
                .nome("Cailan")
                .sobrenome("Grott")
                .cpf("123.456.789-00")
                .rg("123456789")
                .endereco(Endereco.builder()
                        .logradouro("Rua Professor Cristiano Fischer")
                        .numero(1238)
                        .complemento("Apto 203")
                        .cep("12345-678")
                        .build())
                .username("Cailan")
                .senha("123456")
                .build();

        List<Produto> produtos = new ArrayList<>();
        produtos.add(cerveja1);
        produtos.add(cerveja2);

        Pedido pedido = Pedido.builder()
                .id(1)
                .usuario(usuario)
                .produtos(produtos)
                .dataPedido(LocalDateTime.now())
                .status(StatusPedido.CRIADO)
                .formaPagamento(FormaPagamento.CARTAO)
                .build();

        BigDecimal valorTotal = BigDecimal.valueOf(0);
        for (Produto produto : produtos) {
            valorTotal = valorTotal.add(produto.getValor());
        }
        BigDecimal acrescimoCartao = BigDecimal.valueOf(0.3);
        valorTotal = valorTotal.add(valorTotal.multiply(acrescimoCartao));

        assertEquals(valorTotal, pedido.calcularValorTotal());
    }
}
