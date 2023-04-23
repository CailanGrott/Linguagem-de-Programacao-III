package model;

import enums.TipoCerveja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cerveja extends Produto {

    private TipoCerveja tipo;
    private double teorAlcoolico;
    private int volume;

    public Cerveja(String nome, BigDecimal valor, LocalDate dataFabricacao,
                   LocalDate dataVencimento, String origem, TipoCerveja tipo,
                   double teorAlcoolico, int volume) {
        super(nome, valor, dataFabricacao, dataVencimento, origem);
        this.tipo = tipo;
        this.teorAlcoolico = teorAlcoolico;
        this.volume = volume;
    }

}
