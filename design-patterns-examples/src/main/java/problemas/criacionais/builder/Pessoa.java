package problemas.criacionais.builder;

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
	
	public Pessoa(String nome, String sobrenome, String cpf, String rg,
				  LocalDate dataNascimento, Contato contato, boolean estrangeiro,
				  boolean emObito, boolean maiorDeIdade, boolean isEleitor) {
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

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Contato getContato() {
		return contato;
	}

	public boolean isEstrangeiro() {
		return estrangeiro;
	}

	public boolean isEmObito() {
		return emObito;
	}

	public boolean isMaiorDeIdade() {
		return maiorDeIdade;
	}

	public boolean isEleitor() {
		return isEleitor;
	}
	
}
