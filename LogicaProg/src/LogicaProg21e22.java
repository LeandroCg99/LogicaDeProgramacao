import java.util.Scanner;

/*
 exerc�cio: Cadastro de login
 Eu, como administrador do sistema, gostaria de permitir
 que os pr�prios usu�rios cadastrem o nome usu�rio (login)
 no sistema para agilizar o processo de migra��o do sistema.
 
 O usu�rio n�o pode deixar o login null "", ou criar um usu�rio
 com login "admin ou "administrador". Se o valor inserido 
 for v�lido, o sistema dever� exibir uma mensagem: 
 "<nome do usu�rio> cadastrado com sucesso"
 Sen�o, o sistema dever� mostrar o erro "Usu�rio inv�lido".
 */
public class LogicaProg21e22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = input.next();
		
		if(nome.equalsIgnoreCase("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
			System.out.println("Usuario invalido");
			
		}else {
			System.out.println(nome + " cadastrado com sucesso");
		}
		
	}
	
}
