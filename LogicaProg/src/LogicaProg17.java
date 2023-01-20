/*
 AULA SOBRE OPERADORES LOGICOS, sendo eles:
 &&, || e !
 LogicaProg17 significa ImpostoDeRenda por conta da dinamica do exercicio
 */
public class LogicaProg17 {
	public static void main(String[] args) {
		double salario = 3840D;
		if (salario <= 1903.98) {
			System.out.println("ISENTO");
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("7.5% " + (salario *0.075));
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("15% " + (salario * 0.15));
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("22.5% " + (salario * 0.225));
		} else {
			System.out.println("27.5% " + (salario * 0.275));
		}
	}	
}
