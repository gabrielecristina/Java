import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int distancia;
		double totCombustivel, tot;

		distancia = sc.nextInt();
		totCombustivel = sc.nextDouble();

		tot = distancia / totCombustivel;

		System.out.printf("%.3f km/l%n" , tot);

			sc.close();
	}
}
