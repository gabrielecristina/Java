package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		
	float litros, tempo, velocidade, kilometros, distancia;	
		
	Scanner carro=new Scanner (System.in);
	
	System.out.println("Digite o tempo de viagem " );
	tempo=carro.nextFloat();
	
	System.out.println("Digite a velocidade media " );
	velocidade=carro.nextFloat();
	
	System.out.println("Quantos kilimetros seu veiculo percorreu com cada litro" );
	kilometros=carro.nextFloat();
	
	distancia=tempo*velocidade;
	System.out.println("Distancia percorrida " + distancia);
	
	litros=(distancia/kilometros);
	
	System.out.println("Litros gastos " + litros);

	}

}
