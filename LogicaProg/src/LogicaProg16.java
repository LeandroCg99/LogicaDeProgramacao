/*
 LogicaProg16 significa ImparOuPar por conta do exercicio
 dado um determinado numero inteiro
 imprima se ele é impar ou par
 resto da divisao por 2 se for par sempre vai ser 0
 se nao vai ser impar
 */
public class LogicaProg16 {
	public static void main(String[] args) {
		// operadores aritméticos + - / * %
		int numero = 1;
		if ( (numero % 2) == 0) {
			//isso significa resto da divisao
			System.out.println("PAR: "+(numero % 2));				
		}else {
			System.out.println("IMPAR: "+(numero % 2));
		}
	}

}
