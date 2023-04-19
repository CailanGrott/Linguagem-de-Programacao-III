package model;

import java.time.LocalDate;

public class Usuario extends Pessoa {

    private String username;
    private String senha;

    public Usuario(String nome, LocalDate dataNascimento, Endereco endereco,
                   String documento, String username, String senha) {
        super(nome, dataNascimento, endereco, documento);
        this.username = username;
        this.senha = senha;
    }

}
