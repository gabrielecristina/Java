import java.util.Locale;
import java.util.Scanner;

public class uri1045 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (a * a == b * b + c * c) {
				System.out.println("TRIANGULO RETANGULO");

			} else if (a * a > b * b + c * c) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (a == b || a == c || b == c) {
				System.out.println(" TRIANGULO ISOSCELES");

			}
		}

		sc.close();
	}
}