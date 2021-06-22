package listaJ;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x, r, cont = 1;
		
		while(cont<=5) {//ENQUANTO/WHILE - ABERTURA DA ESTRUTURA E CONDIÇÃO ENTRE PARENTESES
			System.out.println("Digite o número");//BLOCO DE COMANDOS
			x = entrada.nextInt();
			r = (x*3);
			System.out.println("Resultado " + r);
			cont = (cont+1);//CONTADOR - ESSENCIAL PARA O CONTROLE DA ESTRUTURA DE REPETIÇÃO

		}
	}
}
