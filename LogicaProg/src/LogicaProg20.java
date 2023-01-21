import java.util.Scanner;

/*
 Nessa aula sera rescrito o codigo da aula 18, onde as variaveis
 passarao a ser inseridas manualmente pelo teclado, nao seram mais
 dadas como valores fixos
 */

public class LogicaProg20 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = teclado.next();
		
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		if (idade <= 10) {
			
			System.out.println(nome +" participara da categoria Infantil");
			
		}else if (idade >= 11 && idade <= 15) {
			System.out.println(nome +" participara da categoria Juvenil");
			
		}else if (idade >= 16 && idade <= 19) {
			System.out.println(nome +" participara da categoria Pré-adulto");
			
		}else {
			System.out.println(nome +" participara da categoria Adulto");
		}
			
	}

}