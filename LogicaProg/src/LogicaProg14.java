/*
LogicaProg14 significa VerificaIdade por conta do exercicio
exercicio:
receba uma idade como entrada
se idade for maior que 18 imprima "Adulto"
Senao imprima "Ainda nao e Adulto"
  */
public class LogicaProg14 {
	public static void main(String[] args) {
		int idade = 15;
		//char letra = 'a' poderia ser usado, pq na vdd representa valor numerico
		// ==, !=, >, >=, <, <=
		if (idade > 18) {
			System.out.println("Adulto");
		}else {
			System.out.println("Ainda nao e Adulto");
		}
	}
}
