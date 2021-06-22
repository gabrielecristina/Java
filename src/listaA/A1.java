package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, med;
		
		Scanner leitura=new Scanner (System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1=leitura.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2=leitura.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3=leitura.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		nota4=leitura.nextFloat();
		
		med=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A media das 4 notas é de: " + med);
		

	}

}
