package listaF;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		double codigo,salário,reajuste,SalárioNovo;

		System.out.println("Digite o codigo:");
		codigo= leia.nextInt();
		
		System.out.println("Digite o salário atual :");
		salário=leia.nextInt();
		
		if(codigo==1) {
			reajuste=((salário/100)*5);
			SalárioNovo=(salário + reajuste);
			System.out.println("salário é igual a: "+ SalárioNovo);
			}
		 if  (codigo==2) {
			reajuste=((salário/100)*10);
			SalárioNovo=(salário + reajuste);
		System.out.println("salário Novo  é igual a: "+ SalárioNovo);
			}
		 if  (codigo==3) {
			 reajuste=((salário/100)*15);
			SalárioNovo=(salário + reajuste);
			System.out.println("salário é igual a: "+ SalárioNovo);
			}
		     if  (codigo==4) {
			reajuste=((salário/100)*20);
			SalárioNovo=(salário + reajuste);
			System.out.println("salário é igual a: "+ SalárioNovo);
			}
		   if  (codigo==5) {
			reajuste=((salário/100)*25);
			SalárioNovo=(salário + reajuste);
			System.out.println("salário é igual a: "+ SalárioNovo);
			}
		     if  (codigo==6) {
			reajuste=((salário /100)*30);
			SalárioNovo=(salário + reajuste);
			System.out.println("salário é igual a: "+ SalárioNovo);
			}
		     else {
		    System.out.println("Codigo invalido tente novamente!");
		     }
	}
}



