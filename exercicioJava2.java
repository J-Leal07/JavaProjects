package projetoJava1;
import java.util.Scanner;

// Exercício proposto pelo ChatGPT (Exercício completo imagem "ex2" da pasta exercíciosJava)

public class exercicioJava2 {
	void main() {
		
		final String Yellow = "\u001B[33m";
		final String Cyan = "\u001B[36m";
		final String Green = "\u001B[32m";
		final String Reset = "\u001B[0m";
		
		int energiaRobo = 100;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O robô atualmente possui " + Green + "100 de energia" + Reset +", digite qualquer número para executar uma ação.");
		System.out.println(Yellow + "Caso o número digitado for 0, o processo é finalizado." + Reset);
		
		System.out.println("Digite um número para iniciar:");
		int acao = sc.nextInt();
		
		while (acao != 0) {
			if (acao > 0 && acao % 2 == 0) {
				energiaRobo = energiaRobo - 10;
			} else if (acao > 0 && acao % 2 != 0) {
				energiaRobo = energiaRobo - 5;
			} else if (acao < 0 && acao % 2 == 0) {
				energiaRobo = energiaRobo + 8;
			} else if (acao < 0 && acao % 2 != 0) {
				energiaRobo = energiaRobo + 4;
			}
			
			System.out.println(Cyan + energiaRobo + Reset);			
			
			if (energiaRobo >= 120) {
				energiaRobo = 120;
				break;
			} else if (energiaRobo <= 0) {
				energiaRobo = 0;
				break;
			}
			
			acao = sc.nextInt();
			
		}
		
		System.out.println(Yellow + "Energia final do robô: " + energiaRobo + Reset);

		if (energiaRobo >= 80) {
			System.out.println("Robô operou normalmente.");
		} else if (energiaRobo >= 40 && energiaRobo <= 79) {
			System.out.println("Robô operou com esforço.");
		} else if (energiaRobo < 40) {
			System.out.println("Robô precisa de manutenção.");
		}
		
		sc.close();
	}
}
