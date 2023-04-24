package com.example.cevamaster.build;

import com.example.cevamaster.build.enums.FormaPagamento;
import com.example.cevamaster.build.enums.StatusPedido;
import com.example.cevamaster.build.regraDeNegocio.DescontoPorPagamento;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
//A classe utiliza a interface DescontoPorPagamento para implementar o método calcularValorTotal(),
// o que ajuda a separar as responsabilidades da classe e a torná-la mais coesa.
public class Pedido implements DescontoPorPagamento {
    private int id;
    private Usuario usuario;
    private List<Produto> produtos;
    private LocalDateTime dataPedido;
    private StatusPedido status;
    private FormaPagamento formaPagamento;


    //Modificador de acesso final afim de garantir que os dencontos não sejam alterados.
    private final BigDecimal descontoPix = BigDecimal.valueOf(0.1);
    private final BigDecimal descontoDinheiro = BigDecimal.valueOf(0.15);
    private final BigDecimal acrescimoCartao = BigDecimal.valueOf(0.3);


    //A classe utiliza tipos BigDecimal em vez de tipos primitivos (double) para os campos que
    // representam valores monetários, o que é uma boa prática para evitar erros de precisão.
    @Override
    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotalPedido = BigDecimal.valueOf(0);
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
            valorTotalPedido = valorTotalPedido.add(produto.getValor());
        }
        if (formaPagamento == FormaPagamento.PIX) {
            valorTotalPedido = valorTotalPedido.subtract(valorTotalPedido.multiply(descontoPix));
        }
        if (formaPagamento == FormaPagamento.DINHEIRO) {
            valorTotalPedido = valorTotalPedido.subtract(valorTotalPedido.multiply(descontoDinheiro));
        }
        if (formaPagamento == FormaPagamento.CARTAO) {
            valorTotalPedido = valorTotalPedido.add(valorTotalPedido.multiply(acrescimoCartao));
        }

        return valorTotalPedido;
    }
}

