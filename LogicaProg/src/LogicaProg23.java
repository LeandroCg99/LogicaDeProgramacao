import java.util.Scanner;

/*
 exercício: 
 Como secretário de alistamento militar, para que eu 
 possa agilizar o processo de cadastramento, eu
 gostaria que meu sistema aceitasse os seguintes
 parâmetros:
 
 -Sexo, sendo válido apenas M ou F + idade.
 
 -Se o sexo for Masculino e a idade for maior ou igual
 a 18, o sistema deve imprimir "Alistamento Obrigatório"
 
 -Se o sexo for Masculino e a idade for menor que 18,
 o sistema deve imprimir "Alistamento Obrigatório"
 
 -Se o sexo for Feminino e a idade for maior ou igual a 18, 
 o sistema deve perguntar se "deseja se alistar".
 
 -Se o sexo for Feminino e a idade for menor que 18, 
 o sistema deve imprimir "alistamento não permitido".
 
 
 */
public class LogicaProg23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Sendo somente Masculino ou Feminino, digite seu genero:");
        String genero = teclado.next();
        
        if (genero.equalsIgnoreCase("feminino") || genero.equalsIgnoreCase("masculino")) {
        	System.out.println("O genero digitado foi: "+ genero +". Agora especifique sua idade:");
        }
        
        int idade = teclado.nextInt();
        if (genero.equalsIgnoreCase("feminino") && idade <= 17) {
        	System.out.println("Alistamento nao permitido!");
        	
        }else if (genero.equalsIgnoreCase("feminino") && idade >=18) {
        	System.out.println("Deseja se alistar?");
        	String alistar = teclado.next();
        	System.out.println("Resposta registrada!");
        	
        }else if (genero.equalsIgnoreCase("masculino") && idade >= 1) {
        	System.out.println("Alistamento obrigatorio!");
        }  
    }
}
