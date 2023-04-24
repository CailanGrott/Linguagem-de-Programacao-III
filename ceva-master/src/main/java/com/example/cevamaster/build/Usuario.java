package com.example.cevamaster.build;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Usuario extends Pessoa{
    //O uso das annotations (@SuperBuilder, @Getter, @Setter) reduz o código e torna o código mais conciso e legível.
    //Polimorfismo: a classe Usuario herda da classe Pessoa, demonstrando o conceito de polimorfismo.
    private String username;
    private String senha;

    //Código legível, sem informações desnecessárias e com nomes claros para as variáveis e métodos.
    //Método toString passando apenas o nome para não exibir senha desnecessáriamente.
    @Override
    public String toString() {
        return "\n" + username;
    }
}
