import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//---------------------------------------
		
		//SCANNER PARA STRING
//		Scanner sc = new Scanner(System.in); //sc nome do scanner e o restante é como tem que abrir o scanner
//		String x;
//		x = sc.next(); //vai permitir que o user digite uma palavra e o programa receba
//		System.out.println(x);
//		sc.close();
		
		//----------------------------------------
		
		//SCANNER PARA INT
		
//		Scanner sc = new Scanner(System.in); 
//		int x;
//		x = sc.nextInt(); 
//		System.out.println(x);
//		sc.close();
		
		////----------------------------------------
		
		//SCANNER PARA DOUBLE
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in); 
//		double x;
//		x = sc.nextDouble(); 
//		System.out.printf("o valor é: %.2f", x);
//		sc.close()

		//----------------------------------------
		
		//SCANNER PARA CHAR
		
//		Scanner sc = new Scanner(System.in); 
//		char x;
//		x = sc.next().charAt(0); //esse charat vai pegar a primeira caractere do texto 
//		System.out.println(x);
//		sc.close();
		
		////----------------------------------------
		
		//LER VÁRIOS DADOS NA MESMA LINHA
		
//		Scanner sc = new Scanner(System.in); 
//		String x;
//		int y;
//		double z; 
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		sc.close();
		
		////----------------------------------------
		
		//ler um texto até a quebra de linha
		
		Scanner sc = new Scanner(System.in); 
		
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine(); //esse cara tá aqui para consumir o enter dps do nextInt, o nextLine consome esse enter
		s1 = sc.nextLine(); //para ler uma linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
