/*
 levando em consideracao o ultimo exercicio
 desafio: utilize apenas uma variavel para guardar o resultado e imprimir no final
 */
public class LogicaProg15Desafio {
	public static void main(String[] args) {
		float salario = 4200.50F;
		float resultado = 0F;
		if (salario > 4500) {
			resultado = salario * 0.3F;
		} else {
			resultado = salario * 0.1F;
		}
		System.out.println("O valor final e: " + resultado);
	}
}
