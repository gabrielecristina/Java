package listaJ;

import java.util.Scanner;

public class J7 {

	public static void main(String[] args) {
		
				
		Scanner leia=new Scanner (System.in);
		
		int  totvotos = 0, resp = 0, vtmatrix = 0, vtSr =0, igual=0;
		
		
		while (resp != 3) {
			System.out.println("Vote em um filme: \n1- Matrix \n2- Senhor dos Anéis \n3- Parar votação");
			resp=leia.nextInt();
			
			if (resp == 1) {
			vtmatrix++;
			}
			else if (resp == 2) {
			vtSr++;	
			}
			else if (vtmatrix == vtSr ) {
				igual++;
				System.out.println("Empate = " + igual );
			}
			else if (vtmatrix > vtSr) {
				System.out.println("Filme vencedor Martix!!!!");
				
			}
			else if  (vtSr > vtmatrix) {
				System.out.println("Filme vencedor Senhor dos Aneis!!!!");
				
			}
			
			totvotos = vtmatrix + vtSr;
	
			System.out.println("Total de pessoas que votaram  = " + totvotos);
			System.out.println("Matrix teve a soma de  votos = " + vtmatrix);
			System.out.println("Senhor dos Aneis teve a soma de  votos = " + vtSr);
	
			
		}

	}

}
