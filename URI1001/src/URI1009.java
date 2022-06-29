import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeVendedor;
		double salario, totVendas, total;
		double porcentagem = 15.0 / 100.0;

		nomeVendedor = sc.next();
		salario = sc.nextDouble();
		totVendas = sc.nextDouble();

		total = salario + totVendas * porcentagem;

		System.out.printf("TOTAL = R$ %.2f%n ",total);

		sc.close();

	}

}
