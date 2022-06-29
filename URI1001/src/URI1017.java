import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
			int hr, km; 
		double litros;
		
		hr = sc.nextInt();
		km =  sc.nextInt();
		
		litros =  (double) hr * km / 12.0;
		
		System.out.printf("%.3f%n", litros);
		
		 sc.close();

	}

}
