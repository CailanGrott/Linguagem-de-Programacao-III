package model;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private String documento;

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco,
                  String documento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.documento = documento;
    }

}
