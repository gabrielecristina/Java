import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hrInicio, hrFim, totHora;

		hrInicio = sc.nextInt();
		hrFim = sc.nextInt();

		if (hrInicio < hrFim) {
			totHora = hrFim - hrInicio;

		} else {
			totHora = 24 - hrInicio + hrFim;
		}

		System.out.println("O JOGO DUROU " + totHora + " HORA(S)");
		
		sc.close();
	}

}
