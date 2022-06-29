import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a, b, c, maiorAB, maiorAC;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorAC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		

		System.out.println(maiorAC + " eh o maior.");

		sc.close();

	}
}
