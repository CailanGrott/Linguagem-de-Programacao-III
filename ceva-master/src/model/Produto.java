package model;

import java.time.LocalDate;

public abstract class Produto {
    private String nome;
    private int valor;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;
    private String origem;

    public Produto(String nome, int valor, LocalDate dataFabricacao,
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


    public int getValor() {
        return valor;
    }
}