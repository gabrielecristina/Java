package listaI;

import java.util.Scanner;

public class I4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		int n;
		int contador=0;
		System.out.println("tabuada/n/n");
		System.out.println("digite o numero da tabuada");
		n=leia.nextInt();
		
		for(contador=0;contador<=10;contador++) {
			System.out.println(  contador + "X" + n + "="+ contador*n);	
		}
	}

}