package listaD;
import java.util.Scanner;
public class D4 {

	public static void main(String[] args) {
		double n1, n2 ;
		Scanner valor=new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");	
		n1=valor.nextDouble();
		
		
		System.out.println("Digite o segundo valor: ");	
		n2=valor.nextDouble();
		
		if(n1 > n2) {
			
			System.out.println("\"A diferen�a do maior pelo menor �   : " + (n1 - n2));
	}
	
		if(n2 > n1) {
			
			System.out.println("A diferen�a do maior pelo menor �  : " + (n2 - n1));
			
		
		}	
		
	
	}
}
	
