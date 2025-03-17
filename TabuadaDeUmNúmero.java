package EstruturasCondicionais;

import java.util.Scanner;

public class TabuadaDeUmNúmero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Tabuada!");

        // Loop principal que pede o número e calcula a tabuada
        do {
            System.out.print("Digite um número (0 para sair): ");
            int numero = sc.nextInt();

            if (numero == 0) break;  // Sai do programa se o número for 0

            // Exibe a tabuada do número
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja calcular outra tabuada? (s para sim): ");
        } while (sc.next().equalsIgnoreCase("s"));

        sc.close();  // Fecha o Scanner
        System.out.println("Saindo...");
    }
}
