package listaJ;

import java.util.Scanner;

 
public class J3 {
		
	public static void main(String[] args)  {

		Scanner leia= new Scanner(System.in);
		
		
		 int genero, produto, produtoN = 0, produtoS = 0, generoS = 0, generoM =0 ;
		 char resp ='s';
		 double resultF = 0, resultM = 0, proc = 0;
		
		  
		while (resp == 's') {
		System.out.println("Digite o seu sexo:  1 - (F)  2 - (M): ");
		genero=leia.nextInt();
		
		System.out.println("Você gostou do produto apresentado? 1 - (sim)  2 - (não): ");
		produto=leia.nextInt();
		
		
		
		if (produto == 1 ) {
			System.out.println("Gostou do Produto! ");
			produtoS = produtoS + 1;
		}
			
			
		else if(produto == 2 ) {
				System.out.println("Não gostou do Produto!");
				produtoN = produtoN + 1;
	
		}
			
		else if (genero == 1) {	
		System.out.println("Sexo Feminino" );
		generoS = generoS + 1;
			
		}
		else if (genero == 2) {
		System.out.println("Sexo Masculino" );
		generoM = generoM + 1;
		
		}
		proc = (generoS + produtoS) /genero ;
		resultF = generoS + proc ;
		
		proc = (generoM + produtoN) /genero ;
		resultM = generoM + proc ;
		
		
	
		
		
		leia.nextLine();
		System.out.println("Deseja continuar Sim (s)  Não (n): ");
		resp=leia.nextLine().charAt(0);
		}

		
		System.out.println(" O número de pessoas que responderam sim " + produtoS);
		System.out.println(" O número de pessoas que responderam não " + produtoN);
		System.out.println(" A porcentagem de pessoas do sexo feminino que responderam sim : " + resultF);
		System.out.println(" A porcentagem de pessoas do sexo masculino que responderam não : " + resultM);
		
		
	}
}