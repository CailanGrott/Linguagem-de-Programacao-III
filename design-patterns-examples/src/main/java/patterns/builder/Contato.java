package patterns.builder;

public class Contato {
    private String telefone;
    private String email;

    private Contato(ContatoBuilder builder) {
        this.telefone = builder.telefone;
        this.email = builder.email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class ContatoBuilder {
        private String telefone;
        private String email;
    }
}

