package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
	double precobruto, desconto, precovista;
		
	Scanner leitura=new Scanner(System.in);
	
	System.out.println("Digite o preço dos produto: ");
	precobruto=leitura.nextDouble();
	
	desconto = ((precobruto/100)*10);
	precovista = (precobruto- desconto);
	
	System.out.println("Valor Bruto R$ "+precobruto+"O Desconto foi de, R$ " + desconto + "O valor a vista ficou R$ "+ precovista);
	
	}

}
