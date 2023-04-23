package padroes.builder;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Pessoa pessoaFundatec = Pessoa.builder()
                .nome("Felipe")
                .sobrenome("Brandão")
                .cpf("1111111111")
                .dataNascimento(LocalDate.now())
                .build();

        System.out.println(pessoaFundatec.getNome());



















        Contato contatoJoao = Contato.builder()
                .telefone("519999999")
                .email("maria.silva@mail.com")
                .build();

        Pessoa pessoa = Pessoa.builder()
                .nome("Maria")
                .sobrenome("Silva")
                .estrangeiro(false)
                .emObito(false)
                .contato(contatoJoao)
                .build();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getContato().getEmail());
        System.out.println(pessoa.getRg());
    }

}
