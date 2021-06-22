package Vendas;

import java.util.Scanner;

public class vendas {

	public static void main(String[] args) {
		
		
		int i, qtdVendas, qtdprodutosvendidos, codcor, totprodutos = 0, totazul=0, totacinza =0, totabranco=0;
		double totalvenda, vendastot = 0.0;
		
		Scanner sc=new  Scanner (System.in);
		
		System.out.println("Digite a quantidade de vendas no periodo: ");
		qtdVendas=sc.nextInt();	
		
		
		System.out.println("");
		System.out.println("----------------");
		
		for (i = 1; i <= qtdVendas; i ++){
			System.out.println("Informe a quantidade de produtos venda: # "+ i);
			qtdprodutosvendidos=sc.nextInt();
			
			System.out.println("Digite o total da venda: ");
			totalvenda=sc.nextDouble();
			
			System.out.println("Digite a cor 1 (azul)  2 (branco) 3 (cinza)");
			codcor=sc.nextInt();
			
			
			if (codcor == 1) {
				totazul=totazul+1;	
			}
			
			if (codcor == 2) {
				totabranco=totabranco+1;	
			}
			
			if (codcor == 3) {
				totacinza=totacinza+1;	
			}
		
			
			totprodutos=totprodutos+qtdprodutosvendidos;
			vendastot=vendastot+totalvenda;
			
		}
		
		
		
		System.out.println("O total de produtos vendidos  é de : " + totprodutos);
		System.out.println("Soma em R$ de todas as venda: " + vendastot);
		System.out.println("Total de vendas com a cor azul " + totazul);
		System.out.println("Total de vendas com a cor branca " + totabranco);
		System.out.println("Total de vendas com a cor cinza " + totacinza);
		
		

	}
	


}
