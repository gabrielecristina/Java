package listaD;
import java.util.Scanner;
public class D7 {

	public static void main(String[] args) {
		int n1;
		
		   Scanner entre=new Scanner (System.in);
		   
		   
		   System.out.println("Digite um numero: ");
		   n1=entre.nextInt();
		   
		   
		   if(n1 < 5) {
			   System.out.println(" O Numero digitado � menor que 5: " + n1);
		   }
		   
		   if(n1 == 5) {
			   System.out.println(" O Numero digitado � menor que 5: " + n1);
		   }
		   
		   
		   
		   if(n1 > 10) {
			   System.out.println(" O Numero digitado � maior que 10: " + n1);
		   }
		   
		   if(n1 == 10) {
			   System.out.println(" O Numero digitado � maior que 10: " + n1);
		   
		   }
		   
		   
		   
		   if(n1 > 5) {
			   System.out.println(" O Numero digitado est� entre o numero 5 e o numero 10: " + n1);
		   
		   }
	}
}
