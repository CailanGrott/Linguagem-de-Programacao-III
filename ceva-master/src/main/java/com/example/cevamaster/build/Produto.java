package com.example.cevamaster.build;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

//A classe utiliza a anotação @SuperBuilder para estender o comportamento do construtor gerado pelo Lombok,
// permitindo que as classes que estenderem a classe Produto também possam utilizar o padrão de construção do Lombok.
@SuperBuilder
@Data
public abstract class Produto {
    //A classe é abstrata, o que ajuda a definir uma hierarquia de classes mais clara e organizada,
    // além de evitar a criação de objetos do tipo Produto diretamente.
    private String nome;
    private BigDecimal valor;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;
    private String origem;

}