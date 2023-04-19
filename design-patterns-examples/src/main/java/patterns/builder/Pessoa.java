package patterns.builder;

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

    private Pessoa(PessoaBuilder builder) {
        this.nome = builder.nome;
        this.sobrenome = builder.sobrenome;
        this.cpf = builder.cpf;
        this.rg = builder.rg;
        this.dataNascimento = builder.dataNascimento;
        this.contato = builder.contato;
        this.estrangeiro = builder.estrangeiro;
        this.emObito = builder.emObito;
        this.maiorDeIdade = builder.maiorDeIdade;
        this.isEleitor = builder.isEleitor;
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

    public boolean isEleitor() {
        return isEleitor;
    }

    public void setEleitor(boolean eleitor) {
        isEleitor = eleitor;
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public static class PessoaBuilder {
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



        private PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public PessoaBuilder rg(String rg) {
            this.rg = rg;
            return this;
        }

        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public PessoaBuilder contato(Contato contato) {
            this.contato = contato;
            return this;
        }

        public PessoaBuilder estrangeiro(boolean estrangeiro) {
            this.estrangeiro = estrangeiro;
            return this;
        }

        public PessoaBuilder emObito(boolean emObito) {
            this.emObito = emObito;
            return this;
        }

        public PessoaBuilder maiorDeIdade(boolean maiorDeIdade) {
            this.maiorDeIdade = maiorDeIdade;
            return this;
        }

        public PessoaBuilder isEleitor(boolean isEleitor) {
            this.isEleitor = isEleitor;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}


