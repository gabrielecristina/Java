import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r, a;
		double n = 3.14159;

		r = sc.nextDouble();
		a =  n * r * r;
		 System.out.printf("A=%.4f%n", a);
		sc.close();
	}

}

