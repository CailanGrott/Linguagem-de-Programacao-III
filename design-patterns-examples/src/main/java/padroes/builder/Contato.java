package padroes.builder;

public class Contato {
	
	private final String telefone;
	private final String email;
	
	private Contato(ContatoBuilder builder) {
		telefone = builder.telefone;
		email = builder.email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public static ContatoBuilder builder() {
		return new ContatoBuilder();
	}
	
	public static class ContatoBuilder {
		
		private String telefone;
		private String email;
		
		private ContatoBuilder() {
		}
		
		public ContatoBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}
		
		public ContatoBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public Contato build() {
			return new Contato(this);
		}
	}

}
