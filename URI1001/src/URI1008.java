import java.util.Locale;
import java.util.Scanner;


public class URI1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int numFun, numHr;
		double vlrHr, salario;

		numFun = sc.nextInt();
		numHr = sc.nextInt();
		vlrHr = sc.nextDouble();

		salario = vlrHr * numHr;

		System.out.println("NÚMERO = " + numFun);
		System.out.printf("Salario = U$ %.2f%n", salario);
		
			sc.close();
	}
}


