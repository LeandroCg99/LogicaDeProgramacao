import java.util.Scanner;

/*
 Como usuario eu gostaria de ter um menu 
 visual que seja navegavel atraves de
 numeros.
 
 O menu deve ser exibido da seguinte forma:
 1.Calcular imposto
 2.Depositar salario
 3.Sair
 
 O menu deve ficar disponivel enquanto
 eu nao digitar o numero 3. Dessa forma
 o sistema ficara em execução, evitando
 ter que ser reiniciado a cada operação.
 */
public class LogicaProg30 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite alguma das opcoes abaixo:");
		System.out.println("1. Calcular imposto");
		System.out.println("2. Depositar salario");
		System.out.println("3. Sair");
		int opcao = teclado.nextInt();
		switch (opcao) {
		
		case 1:
			System.out.println("Selecionada a opcao 1");
			break;
		case 2:
			System.out.println("Selecionada a opcao 2");
			break;
		case 3:
			System.out.println("Selecionada a opcao 3, encerrando programa");
			break;
		
		}
	}
}
