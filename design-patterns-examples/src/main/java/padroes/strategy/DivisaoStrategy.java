package padroes.strategy;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class DivisaoStrategy implements OperacaoStrategy {
    private static final int CASAS_DECIMAIS = 2;

    @Override
    public double calcular(int a, int b) {
        BigDecimal dividendo = BigDecimal.valueOf(a);
        BigDecimal divisor = BigDecimal.valueOf(b);
        BigDecimal resultado = dividendo.divide(divisor, CASAS_DECIMAIS, HALF_UP);

        return resultado.doubleValue();
    }
}
