package problemas.comportamentais.strategy;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class Calculadora {
	
	public double calcular(Operacao operacao, int a, int b) {
		
		if (Operacao.SOMA == operacao) {
			return (a + b);
		}
		if (Operacao.SUBTRACAO == operacao) {
			return (a - b);
		}
		if (Operacao.MULTIPLICACAO == operacao) {
			return (a * b);
		}
		if (Operacao.DIVISAO == operacao) {
			BigDecimal dividendo = BigDecimal.valueOf(a);
			BigDecimal divisor = BigDecimal.valueOf(b);
			BigDecimal resultado = dividendo.divide(divisor, 2, HALF_UP);
			return resultado.doubleValue();
		}
		throw new UnsupportedOperationException("Opera��o n�o suportada");
	}

}
