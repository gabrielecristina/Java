import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codId, quantidade;
		codId = sc.nextInt();
		quantidade = sc.nextInt();
		double preco;

		if (codId == 1) {

			preco = quantidade * 4.0;
			System.out.printf("Total: R$ %.2f%n", preco);

		} else if (codId == 2) {
			preco = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%n", preco);

		} else if (codId == 3) {
			preco = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f%n", preco);

		} else if (codId == 4) {
			preco = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f%n", preco);

		} else {
			preco = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%n", preco);

		}

		sc.close();
	}
}
