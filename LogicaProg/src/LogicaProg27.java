/*
 exercicio sobre switch case:
 
Como gerente eu gostaria que meus usuarios pudessem
digitar o tipo da conta e que o sistema imprimisse
qual a porcentagem de juros que ira oferecer. Com
o intuito de agilizar o acesso as informacoes

os tipos de contas sao:
CONTA_POUPANCA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.01%

Caso a conta nao exista, imprima "CONTA INEXISTENTE"
 */

public class LogicaProg27 {
	public static void main(String[] args) {
		String conta = "CONTA_POUPANCA";
		switch (conta) {
			
		case "CONTA_POUPANCA":
			System.out.println("0.05%");
			break;
		case "CONTA_CORRENTE":
			System.out.println("0.02%");
			break;
		case "CONTA_INVESTIMENTO":
			System.out.println("0.01%");
			break;
		default:
			System.out.println("CONTA INEXISTENTE");
		}
				
	}
}
