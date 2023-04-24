package com.example.cevamaster;

import com.example.cevamaster.build.Endereco;
import com.example.cevamaster.build.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsuarioTest {
    @Test
    void testCriarUsuario() {
        Endereco endereco = Endereco.builder()
                .logradouro("Rua Professor Cristiano Fischer")
                .numero(1238)
                .cep("12345-678")
                .build();

        Usuario usuario = Usuario.builder()
                .nome("Cailan")
                .sobrenome("Grott")
                .cpf("123.456.789-10")
                .rg("123456789")
                .endereco(endereco)
                .username("cailangrott")
                .senha("123456")
                .build();

        assertEquals("Cailan", usuario.getNome());
        assertEquals("Grott", usuario.getSobrenome());
        assertEquals("123.456.789-10", usuario.getCpf());
        assertEquals("123456789", usuario.getRg());
        assertEquals(endereco, usuario.getEndereco());
        assertEquals("cailangrott", usuario.getUsername());
        assertEquals("123456", usuario.getSenha());
    }
}
