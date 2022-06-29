import java.util.Scanner;

public class uri1034 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, disel = 0;
		int codigo = sc.nextInt();

		while (codigo != 4) {
	
				if (codigo == 1) {
					alcool = alcool + 1;
	
				} else if (codigo == 2) {
					gasolina = gasolina + 1;
	
				} else if (codigo == 3) {
					disel = disel + 1;
	
				}
				codigo = sc.nextInt();
			}
			System.out.println("MUITO OBRIGADO");
			System.out.println("Álcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + disel);
	
			sc.close();

	}

}
