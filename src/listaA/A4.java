package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
	
	double volume, altura, raio;
	
	Scanner leia=new Scanner(System.in);
	
	System.out.println("Digite o raio da lata: ");
	raio=leia.nextFloat();
	System.out.println("Digite a altura: ");
	altura=leia.nextFloat();
	
	volume = (3.14159*raio*raio*altura);
	
	System.out.println("O volume da lata de oléo é de, " + volume);
	
	}

}
