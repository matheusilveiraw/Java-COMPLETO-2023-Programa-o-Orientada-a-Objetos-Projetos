
public class Main {

	public static void main(String[] args) {
//		int x = 5;
//		
//		if(x > 10) {
//			System.out.println("X maior a 10");
//		} else if(x == 10) {
//			System.out.println("X igual a 10");
//		} else {
//			System.out.println("X menor que 10");
//		}
		
		//um exercicio que tinha 

		int tempoConsumido = 103;
		int valorPagar;
		
		if(tempoConsumido > 100) { 
			valorPagar =  50 + (tempoConsumido - 100) * 2; 
			System.out.println(valorPagar);
		} else {
			System.out.println("50");
		}		
		
		int diaSemana = 1;
		
		switch(diaSemana) {
			case 1: 
				System.out.println("Domingo");
			break;
			case 2: 
				System.out.println("Segunda");
			break;
			case 3: 
				System.out.println("Terça");
			break;
			case 4: 
				System.out.println("Quarta");
			break;
			case 5: 
				System.out.println("Quinta");
			break;
			case 6: 
				System.out.println("Sexta");
			break;
			case 7: 
				System.out.println("Sabado");
			break;
		}
		
	}

}
