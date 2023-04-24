package com.example.cevamaster;

import com.example.cevamaster.build.Cerveja;
import com.example.cevamaster.build.enums.TipoCerveja;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CervejaTest {
    @Test
    void testGetValor() {
        Cerveja cerveja = Cerveja.builder()
                .nome("Skol")
                .valor(BigDecimal.valueOf(4.5))
                .dataFabricacao(LocalDate.of(2022, 4, 22))
                .dataVencimento(LocalDate.of(2023, 4, 22))
                .origem("Brasil")
                .tipoCerveja(TipoCerveja.PILSEN)
                .teorAlcoolico(4.7)
                .build();

        assertEquals(BigDecimal.valueOf(4.5), cerveja.getValor());
    }
}
