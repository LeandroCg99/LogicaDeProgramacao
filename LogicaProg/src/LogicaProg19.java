import java.util.Scanner;

/*
 Aula sobre receber/ler dados do teclado
 */
        //teclado.next();
		// .next é uma varivel tipo string
public class LogicaProg19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = teclado.next();
		
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitada foi: "+ idade);

	}

}
