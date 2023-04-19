package patterns.builder;

public class Application {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.builder()
                .cpf("2222")
                .build();
    }
}
