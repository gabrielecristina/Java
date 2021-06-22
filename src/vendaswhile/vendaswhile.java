package vendaswhile;

import java.util.Scanner;

public class vendaswhile {

	public static void main(String[] args) {
		
		char resp ='s';
	
		Scanner sc =new Scanner (System.in);
		
		while (resp == 's')	{
			System.out.println("Digite o  valor a cadastar: ");
			double produto=sc.nextDouble();
			
			
			sc.nextLine();
			System.out.println("Deseja continuar a cadastrar os produtos? s -- sim  n --- nao ");
			resp=sc.nextLine().charAt(0);
			
		
		}
		System.out.println("Fim do Programa");
	
	
	}
	
}


