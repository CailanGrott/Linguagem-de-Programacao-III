package com.example.cevamaster;

import com.example.cevamaster.build.Endereco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnderecoTest {
    @Test
    void testCriarEndereco() {
        Endereco endereco = Endereco.builder()
                .logradouro("Rua 1")
                .numero(123)
                .cep("12345-678")
                .complemento("Apto 101")
                .build();

        assertEquals("Rua 1", endereco.getLogradouro());
        assertEquals(123, endereco.getNumero());
        assertEquals("12345-678", endereco.getCep());
        assertEquals("Apto 101", endereco.getComplemento());
    }
}
