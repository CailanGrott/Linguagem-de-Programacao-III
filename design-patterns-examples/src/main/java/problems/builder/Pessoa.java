package problems.builder;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private Contato contato;
    private boolean estrangeiro;
    private boolean emObito;
    private boolean maiorDeIdade;
    private boolean isEleitor;

    public Pessoa(String nome, String sobrenome, String cpf, String rg, LocalDate dataNascimento,
                  Contato contato, boolean estrangeiro, boolean emObito, boolean maiorDeIdade, boolean isEleitor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.estrangeiro = estrangeiro;
        this.emObito = emObito;
        this.maiorDeIdade = maiorDeIdade;
        this.isEleitor = isEleitor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public boolean isEmObito() {
        return emObito;
    }

    public void setEmObito(boolean emObito) {
        this.emObito = emObito;
    }

    public boolean isMaiorDeIdade() {
        return maiorDeIdade;
    }

    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }

    public void getIsEleitor(boolean isEleitor) {
        this.isEleitor = isEleitor;
    }

    public void setIsEleitor(boolean isEleitor) {
        this.isEleitor = isEleitor;
    }
}
