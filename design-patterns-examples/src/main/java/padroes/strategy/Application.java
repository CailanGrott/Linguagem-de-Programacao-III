package padroes.strategy;

public class Application {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcular(Operacao.SOMA, 10, 5));
    }

}
