package com.example.cevamaster.build;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public abstract class Pessoa {
    //A classe não contém comentários excessivos ou desnecessários,
    // o que ajuda a manter o código mais limpo e fácil de entender.
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Endereco endereco;

    //A classe utiliza o método toString() para gerar uma representação em String dos objetos da classe.
    // Isso ajuda a depurar o código e a entender o estado dos objetos em tempo de execução.
    public String toString() {
        return "\n" + nome + " , "
                    + sobrenome + " , "
                    + cpf + " , "
                    + rg + " , " + "Endereco ["
                    + endereco + "\n";
    }
}