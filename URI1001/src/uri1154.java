import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int cont = 0;
		int soma = 0;
		double media;

		while (idade >= 0.0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}

		media = (double) soma / cont;
		System.out.printf("%.2f%n", media);

		sc.close();

	}

}
