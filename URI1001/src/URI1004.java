import java.util.Scanner;

public class URI1004 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, PROD;

		a = leia.nextInt();
		b = leia.nextInt();
		PROD = a * b;
		System.out.println("PROD = " + PROD);
		
		leia.close();
	}

}
