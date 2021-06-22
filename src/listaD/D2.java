package listaD;
import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
	int n1;
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n1=num.nextInt();
		
		
		
		if(n1 < 100) {
			System.out.println("O Numero é menor que  100: "+ n1);
			
		}
		
		if(n1 > 100) {
			System.out.println("O Numero é maior que  100: "+ n1);
			
		}
		

		if(n1 == 100) {
			System.out.println("O Numero é igual a 100: " +n1);
			
		}
		
	}
	

}
