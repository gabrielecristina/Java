import java.util.Locale;
import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int distancia, tempo;
		
		distancia = sc.nextInt();
		
		tempo =  2 * distancia;
		
		System.out.println(tempo + " minutos");
		
			sc.close();
	}

}
