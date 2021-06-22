package listaA;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
	int a, b, troca;
	
	Scanner trocar=new Scanner (System.in);
	
	System.out.println("Digite o valor de A: " );
	a=trocar.nextInt();

	System.out.println("Digite o valor de B: " );
	b=trocar.nextInt();
	
	troca=a;
	a=b;
	b=troca;
	
	System.out.println("O Valor de A é = "+ a + " O Valor de B é = " + b);
	}

}
