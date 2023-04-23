package padroes.strategy;

public class MultiplicacaoStrategy implements OperacaoStrategy {
	
	@Override
	public double calcular(int a, int b) {
		return (a * b);
	}

}
