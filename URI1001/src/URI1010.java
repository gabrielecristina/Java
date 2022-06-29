import java.util.Locale;
import java.util.Scanner;


public class URI1010 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int cod1, cod2, prod1, prod2;
		double vlr1, vlr2, pagar;

		cod1 = sc.nextInt();
		prod1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		prod2 = sc.nextInt();
		vlr2 = sc.nextDouble();
		
		pagar = vlr1 * prod1 + vlr2 * prod2 ;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
		
			sc.close();

	}

}
