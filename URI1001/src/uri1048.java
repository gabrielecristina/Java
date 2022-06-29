import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		double salarioAtual, percentual, novoSalario, reajuste;

		salarioAtual = sc.nextDouble();

		if (salarioAtual <= 400.0) {

			percentual = 15.0;
		} else if (salarioAtual <= 800.0) {
			percentual = 12.0;
		} else if (salarioAtual <= 1.200) {
			percentual = 10.0;
		} else if (salarioAtual <= 2000.00) {
			percentual = 7.0;
		} else {
			percentual = 4.0;
		}
		reajuste = salarioAtual * percentual / 100;
		novoSalario = salarioAtual + reajuste;

		System.out.printf("Novo salário: %.2f\n ", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n ", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);

		sc.close();
	}

}
