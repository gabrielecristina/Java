import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	
			int idade, ano, meses, dias, sobra;
	
			idade = sc.nextInt();
	
			ano = idade / 365;
			sobra = idade % 365;
			meses = sobra / 30;
			dias = sobra % 30;
	
			System.out.println(ano + " ano(s)");
			System.out.println(meses + " mês(es)"); 
			System.out.println( dias + " dia(s)");
	
			sc.close();
	}

}
