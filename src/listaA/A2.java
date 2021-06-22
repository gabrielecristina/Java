package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		
	double area, lado1, lado2;
	
	Scanner calcula=new Scanner (System.in);
	
	System.out.println("Digite o lado 1: ");
	lado1=calcula.nextDouble();
	
	System.out.println("Digite o lado 2: ");
	lado2=calcula.nextDouble();
	area=lado1*lado2;
	
	System.out.println("A area deste retângulo é de : " + area);
	
	}

}
