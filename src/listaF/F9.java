package listaF;
import java.util.Scanner;
public class F9 {

	public static void main(String[] args) {
		double num;

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = leia.nextDouble();
		
		

		if (num % 5 ==0)   {
		
		System.out.println("O Numero nao é divisivel por 4 e 5. Apenas por 5 ");
		}
		else if  (num % 4 ==0) {
			System.out.println("O Numero nao é divisivel por 4 e 5. Apenas por 4 ");
			
		}
		
		else if ((num % 4 == 0) && (num % 5 == 0 )) {
			
			System.out.println(" O numero é divisivel por 4 e 5 ");
			}
		else {
			
			System.out.println(" O numero nao é divisivel por 4 e 5 ");
		}
		
		}
	}
