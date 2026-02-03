package projetoJava1;
import java.util.Scanner;

public class program {

	void main() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo(a)!");
		System.out.println("Operações Disponíveis:");
		System.out.println("");
		System.out.println("(1) Real para Dólar;");
		System.out.println("(2) Celsius para Fahrenheit;");
		System.out.println("(3) Metro para Foot.");
		System.out.println("");
		System.out.println("Deseja continuar? (Sim ou Não)");
		
		String confirm = sc.next();
		
		if (confirm.equalsIgnoreCase("Sim")) {
			
			System.out.println("Obrigado por continuar conosco, por favor, digite o número da operação desejada.");
			int op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Digite a quantidade em reais:");
				double real = sc.nextDouble();
				double dolar = real / 5.16;
				System.out.println("Resultado: " + dolar);
				
				break;
			case 2:
				System.out.println("Digite a quantidade em graus:");
				double celsius = sc.nextDouble();
				double fahrenheit = (celsius * 1.8) + 32;
				System.out.println("Resultado: " + fahrenheit);
				break;
			case 3:
				System.out.println("Digite a quantidade em metros:");
				double meters = sc.nextDouble();
				double foot = meters * 3.2;
				System.out.println("Resultado aproximado: " + foot);
				break;
			}	
		} 
		
		else {
			System.out.println("Quando quiser ajuda, pode chamar!");
		}
		
		sc.close();

	}
}
