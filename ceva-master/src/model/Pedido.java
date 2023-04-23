package model;

import enums.FormaPagamento;
import enums.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private Usuario usuario;
    private List<Produto> produtos;
    private LocalDateTime dataPedido;
    private StatusPedido status;
    private FormaPagamento formaPagamento;

    public Pedido(int id, Usuario usuario, List<Produto> produtos, FormaPagamento formaPagamento) {
        this.id = id;
        this.usuario = usuario;
        this.produtos = produtos;
        this.formaPagamento = formaPagamento;
        this.dataPedido = LocalDateTime.now();
        this.status = StatusPedido.CRIADO;
    }

    public long getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotalPedido = BigDecimal.valueOf(0);
        BigDecimal descontoPix = BigDecimal.valueOf(0.05);
        BigDecimal descontoDinheiro = BigDecimal.valueOf(0.1);
        BigDecimal acrescimoCartao = BigDecimal.valueOf(0.03);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
            valorTotalPedido = valorTotalPedido.add(produto.getValor());
        }
        if (formaPagamento == formaPagamento.PIX) {
            valorTotalPedido = valorTotalPedido.subtract(valorTotalPedido.multiply(descontoPix));
        }
        if (formaPagamento == formaPagamento.DINHEIRO) {
            valorTotalPedido = valorTotalPedido.subtract(valorTotalPedido.multiply(descontoDinheiro));
        }
        if (formaPagamento == formaPagamento.CARTAO) {
            valorTotalPedido = valorTotalPedido.add(valorTotalPedido.multiply(acrescimoCartao));
        }

        return valorTotalPedido;
    }

}
