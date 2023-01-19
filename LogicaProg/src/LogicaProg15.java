/*
 LogicaProg15 significa CalculadoraImpostoComCondicional por causa do exercicio
 exercicio:
dado um determinado salario
se o salario for maior que 4500 imprima 30% do valor
senao imprima 10% do valor
 */
public class LogicaProg15 {
	public static void main(String[] args) {
		float salario = 4200.50F;
		if (salario > 4500) {
			float trintaPorCento = salario * 0.3F;
			System.out.println("30% = " + trintaPorCento);
	    } else {
	    	float dezPorCento = salario * 0.1F;
	    	System.out.println("10% = " + dezPorCento);

	    }

    }

}
