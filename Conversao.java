package desafios;

import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double soma, media;
		
		
		System.out.print("Digite o salario de Janeiro: ");
		String salario1 = entrada.nextLine();
		System.out.print("Digite o salario de Fevereiro: ");
		String salario2 = entrada.nextLine();
		System.out.print("Digite o salario de Março: ");
		String salario3 = entrada.nextLine();
		
		salario1 = salario1.replace(",", ".");
		salario2 = salario2.replace(",", ".");
		salario3 = salario3.replace(",", ".");
		
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		soma = valor1 + valor2 + valor3;
		System.out.printf("O valor da soma foi: %.2f", soma);
		
		media = soma / 3; 
		
		System.out.printf("%nO valor da média é: %.2f", media);
		
		
		
		entrada.close();
			
		
		
		
	}
}
