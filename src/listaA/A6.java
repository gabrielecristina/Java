package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		
		double ht, vh, pd, sb, sl, td;
		
		Scanner salario=new Scanner (System.in);
		
		System.out.println("Digite suas horas trabalhadas no mês: " );
		ht=salario.nextFloat();
		System.out.println("Digite o valor da sua hora trabalhadas R$ " );
		vh=salario.nextFloat();
		System.out.println("Digite o valor de desconto R$" );
		pd=salario.nextFloat();
		
		sb=ht*vh;
		
		System.out.println("O salario bruto é R$ " + sb);
		 td=((pd/100)*sb);
		 
		 System.out.println("Teve um desconto de R$ " + td);
		 sl=(sb-td);
		 
		 System.out.println("O Salario liquido é de R$ "+ sl);
		  
	}

}
