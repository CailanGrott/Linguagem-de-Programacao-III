package com.example.cevamaster.build;

import com.example.cevamaster.build.enums.TipoCerveja;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Cerveja extends Produto {
    //Polimorfismo: a classe Cerveja herda da classe Produto, demonstrando o conceito de polimorfismo.
    //Classe direta e simples. Foi resumido pelas annotations @Builder, @Getter e @Setter, que comporta as informações
    //necessárias para o uso da classe.
    private TipoCerveja tipoCerveja;
    private double teorAlcoolico;
    private int volume;
}
