package listaD;
import java.util.Scanner;
public class D5 {

	public static void main(String[] args) {
	int a, b, c;

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digita o primeiro numero: ");
		a=leia.nextInt();
		
		
		System.out.println("Digita o segundo numero: ");
		b=leia.nextInt();
		
		
		System.out.println("Digita o terceiro numero: ");
		c=leia.nextInt();
		
		
		if(a < b) {	
		
			if(b < c) {
				System.out.println("A ordem crescente �: " + a + "-" + b + "-"+ c);
			}
	
			else if(a < c) {
				System.out.println("A ordem crescente �: " + a + "-" + c + "-"+ b);
				
			}
			else {
				System.out.println("A ordem crescente �: " + c + "-" + a + "-"+ b);
			}
		}
		else if (b < c ) {
			if (a< c) {
			
				System.out.println("A ordem crescente �: " + b + "-" + a + "-"+ c);
			
		}
			else {
				System.out.println("A ordem crescente �: " + b + "-" + c + "-"+ a);
			}
		}
		else {
			System.out.println("A ordem crescente �: " + c + "-" + b + "-"+ a);
		}
	}	
}