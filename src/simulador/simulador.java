package simulador;


import java.util.Scanner;


public class simulador {

	public static void main(String[] args) {
	
	
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("Digite o valor do salrio: ");
		 double salario=sc.nextDouble();
		 
		 double margem=salario/3;
		 System.out.println("Valor da percela suportado = " + margem);
		 
		 System.out.println("Digite o valor do produto: ");
		 double valor=sc.nextDouble();
		 
		 System.out.println("Parcelar em quantas vezes sem juros? ");
		 int vezes=sc.nextInt();
		 
		 double parcela=valor/vezes;
		 System.out.println("A parcela do produto é = " + parcela);
		 
		 
		 if (vezes > 100) {
			 System.out.println("Erro! Número excessivo de Parcelas! ");
			 
		 }
		 else if (margem <parcela) {
			 System.out.println("Financiamento não autorizado!");
		 }
		 else {
			 System.out.println("Parabéns, seu crédito foi aprovado!");
		 }
	}

}
