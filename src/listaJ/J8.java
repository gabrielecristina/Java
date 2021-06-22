package listaJ;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
		
		
		Scanner leia=new Scanner (System.in);
		
		int resp = 0,  empate=0, desempate = 0;
		float percvotos = 0, vtFujiro=0, vtTakaro=0, totVotos = 0, percvotosF = 0;
		
		while (resp !=3) {
			System.out.println("Qual gerente você quer votar? \n1- Fujiro NaKombi \n2- Takaro Né \n3- Encerra votação"  );
			resp=leia.nextInt();
			
			if (resp == 1) {
				vtFujiro++;
			}
			else if (resp == 2){
				vtTakaro++;
			}
		
			
			else if (vtFujiro > vtTakaro) {
				System.out.println("Novo gerente Fujiro NaKombi! ");
			}
			else if ( vtTakaro > vtFujiro) {
				System.out.println("Novo gerente Takaro Né! ");
			}
			
			else if (vtFujiro == vtTakaro){
				empate++;
				System.out.println(" Deu Empate = " + empate );
			if (vtFujiro == vtTakaro){
				desempate++;
				System.out.println("Vote novamente para desempatar");
				resp=leia.nextInt();
				}
			}
			
			
			totVotos = vtTakaro + vtFujiro;
			percvotos = (vtTakaro * 100)/totVotos;
			percvotosF = (vtFujiro * 100)/totVotos;
			
			System.out.println("Total de votos = " + totVotos );
			System.out.println("Votos em % Fujiro NaKombi = " + vtFujiro + "%" );
			System.out.println("Votos em % Takaro Né = " + percvotos + "%" );
			
			
			
			
		}
	}

}
