import java.util.Scanner;

/*
 Eu como usuario gostaria de imprimir todos os 
 numeros impares de 0 ate o valor digitado 
 */
public class LogicaProg29 {
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("Digite o numero impar desejado");
		int numImpar = numeros.nextInt();
		int i = 0;
		while (i <= numImpar) {
			
			if (i % 2 != 0) {
				System.out.println("i = "+ i);
			}
			i = i + 1;
		}

	}
}
