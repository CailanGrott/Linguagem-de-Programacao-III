package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Produto {
    private String nome;
    private BigDecimal valor;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;
    private String origem;

    public Produto(String nome, BigDecimal valor, LocalDate dataFabricacao,
                   LocalDate dataVencimento, String origem) {
        this.nome = nome;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
        this.origem = origem;
    }

    public String getNome() {
        return this.nome;
    }


    public BigDecimal getValor() {
        return valor;
    }
}