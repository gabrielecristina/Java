import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hrInicio, hrFim, MinInicio, MinFinal;
		
		//int totHr =  hrInicio * 60 + MinInicio;
		//int totMin = hrFim * 60 + MinFinal;

		hrInicio = sc.nextInt();
		MinInicio = sc.nextInt();
		hrFim = sc.nextInt();
		MinFinal = sc.nextInt();

		if (hrInicio < hrFim && MinInicio < MinFinal) {


		} else {
		//	totHr =  (24 * 60 - hrInicio) + hrFim;
			//totMin =  totHr % 60;
		}
	//	System.out.println("O JOGO DUROU " + totHr + " HORA(S) E " + totMin + " MINUTO(S)");
		sc.close();

	}
}
