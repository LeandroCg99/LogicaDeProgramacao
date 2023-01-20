/*
 LogicaProg18 significa TorneioDeNatacao por conta do exercicio
 
 Eu como usuario gostaria de ter o nome e a idade de cada participante 
 de um torneio de natação, e que esse sistema impima da seguinte forma:
 
 Menor que 10 anos: <Nome> participara da categoria Infantil
 Entre 11 e 15 anos: <Nome> participara da categoria Juvenil
 Entre 16 e 19 anos: <Nome> participara da categoria Pré-adulto
 Acima de 20 anos: <Nome> participara da categoria Adulto
 
 Deve conter todas essas informação para uma rapida classificação de 
 todos os participantes.
 */

public class LogicaProg18 {

	public static void main(String[] args) {
		
		String nome = "Leandro";
		int idade = 19;
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
