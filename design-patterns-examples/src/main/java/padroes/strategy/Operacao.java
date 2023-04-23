package padroes.strategy;

public enum Operacao {
	
	SOMA(new SomaStrategy()), 
	SUBTRACAO(new SubtracaoStrategy()), 
	MULTIPLICACAO(new MultiplicacaoStrategy()), 
	DIVISAO(new DivisaoStrategy()); 
	
	private Operacao(OperacaoStrategy strategy) {
		this.strategy = strategy;
	}
	
	private final OperacaoStrategy strategy;
	
	public OperacaoStrategy getStrategy() {
		return strategy;
	}

}
