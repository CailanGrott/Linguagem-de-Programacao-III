package model;

public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco(String logradouro, int numero, String complemento, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

}
