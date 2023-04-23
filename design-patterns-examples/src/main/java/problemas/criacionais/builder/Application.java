package problemas.criacionais.builder;

import java.time.LocalDate;

public class Application {

    private static final int IDADE_MAIORIDADE = 18;

    public static void main(String[] args) {
        Contato contato = new Contato(
                "519999999",
                "maria.silva@mail.com");

        Pessoa pessoa = new Pessoa(
                "João",
                "Silva",
                "01234567890",
                "0123456789",
                LocalDate.of(1990, 1, 1),
                contato,
                false,
                false,
                true,
                true);

        System.out.println("Nome da pessoa: " + pessoa.getNome());

        if (!pessoa.isEstrangeiro()) {
            System.out.println("A pessoa " + pessoa.getNome() + " é brasileira");
        } else {
            System.out.println("A pessoa " + pessoa.getNome() + " é estrangeira");
        }

        if (isPessoaMaiorDeIdade(pessoa)) {
            System.out.println("A pessoa é maior de idade!");
        } else {
            System.out.println("A pessoa não é maior de idade");
        }

    }

    private static boolean isPessoaMaiorDeIdade(Pessoa pessoa) {
        return LocalDate.now().getYear() - pessoa.getDataNascimento().getYear() >= IDADE_MAIORIDADE;
    }

}
