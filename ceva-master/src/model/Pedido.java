package model;

import enums.FormaPagamento;
import enums.StatusPedido;

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

    public double calcularValorTotal() {
        double valorTotalPedido = 0;
        double descontoPix = 0.05;
        double descontoDinheiro = 0.1;
        double acrescimoCartao = 0.03;

        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
            valorTotalPedido += produto.getValor();
        }
        if (formaPagamento == formaPagamento.PIX) {
            valorTotalPedido -= (valorTotalPedido * descontoPix);
        }
        if (formaPagamento == formaPagamento.DINHEIRO) {
            valorTotalPedido -= (valorTotalPedido * descontoDinheiro);
        }
        if (formaPagamento == formaPagamento.CARTAO) {
            valorTotalPedido += (valorTotalPedido * acrescimoCartao);
        }

        return valorTotalPedido;
    }

}
