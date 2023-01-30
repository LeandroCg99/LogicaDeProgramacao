import java.util.Scanner;

/*
 exercicio dias da semana
 receba um numero inteiro do usuario e imprima o dia da semana correspondente
 - sendo 1 segunda feira, e assim por diante
 */
public class LogicaProg24 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite (em numero) o dia da semana que gostaria:");
		int dia = teclado.nextInt();
		
		if (dia == 1) {
			System.out.println("Segunda");
		}else if (dia == 2) {
			System.out.println("Terca");
		}else if (dia == 3) {
			System.out.println("Quarta");
		}else if (dia == 4) {
			System.out.println("Quinta");
		}else if (dia == 5) {
			System.out.println("Sexta");
		}else if (dia == 6) {
			System.out.println("Sabado");
		}else if (dia == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Dia invalido");
		}
	}
}
