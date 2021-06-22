package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner leitura=new Scanner (System.in);
		float c, f;
		
		System.out.println("Digite a temperatura em graus C:");
		c=leitura.nextFloat();
		
		f=((9*c+160)/5);
		
		System.out.println("A temperatura em fahrenheit é, "+ f);
		

	}

}
