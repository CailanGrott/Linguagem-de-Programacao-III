package com.example.cevamaster.build;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Endereco {
    //Classe direta e simples. Foi resumido pelas annotations @Builder e @Data, que comporta as informações necessárias
    //para o uso da classe.
    private final String logradouro;
    private final int numero;
    private final String cep;
    private final String complemento;
}

