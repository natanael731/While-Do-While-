package EstruturasCondicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verifique se o número é par ou ímpar!");
		
		while (true) {
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		if (n%2 == 0 && n != 0) {
		}else if (n % 2 != n ) {
		System.out.println("Número ímpar");
			
		}else if (n == 0) {
	    System.out.println("O número é igual a zero");
	    sc.close();
	    break;
	    
			
			
		
		
		}
	}

}
	
}
