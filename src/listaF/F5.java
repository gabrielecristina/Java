package listaF;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		double codigo,sal�rio,reajuste,Sal�rioNovo;

		System.out.println("Digite o codigo:");
		codigo= leia.nextInt();
		
		System.out.println("Digite o sal�rio atual :");
		sal�rio=leia.nextInt();
		
		if(codigo==1) {
			reajuste=((sal�rio/100)*5);
			Sal�rioNovo=(sal�rio + reajuste);
			System.out.println("sal�rio � igual a: "+ Sal�rioNovo);
			}
		 if  (codigo==2) {
			reajuste=((sal�rio/100)*10);
			Sal�rioNovo=(sal�rio + reajuste);
		System.out.println("sal�rio Novo  � igual a: "+ Sal�rioNovo);
			}
		 if  (codigo==3) {
			 reajuste=((sal�rio/100)*15);
			Sal�rioNovo=(sal�rio + reajuste);
			System.out.println("sal�rio � igual a: "+ Sal�rioNovo);
			}
		     if  (codigo==4) {
			reajuste=((sal�rio/100)*20);
			Sal�rioNovo=(sal�rio + reajuste);
			System.out.println("sal�rio � igual a: "+ Sal�rioNovo);
			}
		   if  (codigo==5) {
			reajuste=((sal�rio/100)*25);
			Sal�rioNovo=(sal�rio + reajuste);
			System.out.println("sal�rio � igual a: "+ Sal�rioNovo);
			}
		     if  (codigo==6) {
			reajuste=((sal�rio /100)*30);
			Sal�rioNovo=(sal�rio + reajuste);
			System.out.println("sal�rio � igual a: "+ Sal�rioNovo);
			}
		     else {
		    System.out.println("Codigo invalido tente novamente!");
		     }
	}
}



