import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, media;

		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 7.0 ) {
			System.out.printf("Media :%.1f%n :" , media);
			System.out.println("Aluno aprovado");

		} 
		else if (media < 5.0 ) {
			System.out.printf("Media :%.1f%n :" , media);
			System.out.printf("Aluno reprovado");

		}
		else {
				System.out.printf("Aluno em exame");
				double notaExame = sc.nextDouble();
				System.out.printf("Nota em exame:%.1f%n", notaExame);
				double mediaFinal = (notaExame + media) / 2;
				if (mediaFinal >= 5.0) {
					System.out.println("Aluno aprovado.");
	
				} 
				else {
	
						System.out.printf("Aluno reprovado");
			}
				System.out.printf("Media final: %.1f%n", mediaFinal);
			
		}
		sc.close();

	}
}
