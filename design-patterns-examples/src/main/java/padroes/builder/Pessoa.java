package padroes.builder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


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
			long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
			this.maiorDeIdade = idade >= 18;
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

		public PessoaBuilder isEleitor(boolean eleitor) {
			this.isEleitor = eleitor;
			return this;
		}
		
		public Pessoa build() {
			return new Pessoa(this);
		}
	}

}
