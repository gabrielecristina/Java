package listaJ;

import java.util.Scanner;

public class J9 {

	
	// Desenvolva um programa para realizar uma pesquisa de cursos universit�rios para uma 
	 //Universidade. Os cursos que estar�o na pesquisa s�o: Ci�ncia da Computa��o, Direito e Letras.
	
	 
	 //programa dever� receber o voto de cada entrevistado e ao final dever� apresentar a coloca��o, o 
	 //total de votos e o percentual de votos de cada curso.
	
	
	//Os poss�veis empates tamb�m dever�o ser 
	 //verificados. O programa dever� realizar a pesquisa enquanto houver a solicita��o de uma nova 
	 //entrada de dados atrav�s da vari�vel RESP.
	

	public static void main(String[] args) {
	
		Scanner leia=new Scanner (System.in);
		
		int resp = 0, vtCC = 0, vtDireto = 0, vtLetras = 0, totvotos = 0, empate = 0;
		float percCC = 0, percDireto = 0, percLetras = 0;
		
		while (resp != 4) {
			System.out.println("Vote em um filme: \n1- Ci�ncia da Computa��o \n2- Direito \n3- Letras \n4- Parar vota��o\"");
			resp=leia.nextInt();
			
			if (resp == 1) {
				vtCC++;
			}
			if (resp == 2) {
				vtDireto++;
			}
			if (resp == 3) {
				vtLetras++;
			}
			else if ((vtCC == vtDireto) && (vtCC == vtLetras ) && (vtDireto ==  vtLetras)) {
				empate++;
				System.out.println("Deu empate de Cursos ");
			}
			
			
			 if (vtCC < vtDireto ) {
				if (vtDireto <  vtLetras ) {
				System.out.println("Ordem dos cursos " + vtCC + "-" +  vtDireto + "-" + vtLetras  );
				}
				else if (vtCC < vtLetras) {
					System.out.println("Ordem dos cursos " + vtCC + "-" + vtLetras + "-" + vtDireto );
				}
				else {
					
					System.out.println ("Ordem dos cursos " + vtLetras + "-" + vtCC + "-" + vtDireto  );
				}
			}
			
			totvotos = vtCC + vtDireto + vtLetras;
			percCC = ((vtCC * 100)/totvotos);
			percDireto = ((vtDireto * 100)/totvotos);
			percLetras = ((vtLetras * 100)/totvotos);
					
			System.out.println("Total de votos " + totvotos);
			System.out.println("O curso de Ciencia da computa��o teve = " + percCC + " % de  Votos" );
			System.out.println("O curso de Direito teve = " + percDireto + " % de  Votos" );
			System.out.println("O curso de Letras teve = " + percLetras + " % de  Votos" );
			
			
		
		}
	}
}
