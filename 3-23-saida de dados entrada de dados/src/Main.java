import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("ola"); //print n quenbra a linha, println quebra a linha
	
		int y = 32;
		double x = 10.584848;
		
		System.out.println(y);
		System.out.printf("%.2f%n", x); //printf é pra formatar
		//o "%n" na linha anterior quenra a linha
		//o %.2f é pra ter dois números pós virgula
		System.out.printf("%.4f%n", x);
		System.out.println(x);
		Locale.setDefault(Locale.US); //para converter o número formatado para ponto ao invés de virgula
		System.out.printf("%.4f%n", x);


		System.out.println("Resultado: = " + x + " metros!"); //concatenação java print ln
		System.out.printf("Resultado = %.2f metros%n", x); //%.2f é um marcador pra variavel que vem no final - concatenação com printf
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",  nome, idade, renda); //exemplo com várias variaveis
		//%f = valores com virgula, no caso, o .2 é pra fortmatar o que vem depois da virugla
		//%s = strings 
		//%d = inteiros 
		
		//exercicio 
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n%s, which price is $%.2f%n%s which price is $%.2f%n%nRecord: %d, code %d and gender %s %n%nMeasue with eight decimal places: %f%nRouded (three decimal places): %.3f%nUS decimal point: %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure, measure);
		
		
	}

}
