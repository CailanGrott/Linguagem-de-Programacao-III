package padroes.strategy;

public class Calculadora {
	public double calcular(Operacao operacao, int a, int b) {
		return operacao.getStrategy().calcular(a, b);
	}
}
