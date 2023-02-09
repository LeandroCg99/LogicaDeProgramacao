import java.util.Scanner;

/*
 exercício: Cadastro de login
 Eu, como administrador do sistema, gostaria de permitir
 que os próprios usuários cadastrem o nome usuário (login)
 no sistema para agilizar o processo de migração do sistema.
 
 O usuário não pode deixar o login null "", ou criar um usuário
 com login "admin ou "administrador". Se o valor inserido 
 for válido, o sistema deverá exibir uma mensagem: 
 "<nome do usuário> cadastrado com sucesso"
 Senão, o sistema deverá mostrar o erro "Usuário inválido".
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
