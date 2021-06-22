package exercicio46;

import java.util.Scanner;

public class exercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Scanner sc=new Scanner (System.in);
			
			System.out.println("Digite o nome do funcionario: ");
			String nome=sc.nextLine();
			
			System.out.println("Digite o salrio do funcionario: ");
			double salario=sc.nextDouble();
			
			
			sc.nextLine();
			System.out.println("Digite a categoria do funcionario: ");
			char categoria=sc.nextLine().charAt(0);
			
			
			
			if (categoria =='a' ||  categoria == 'c' || categoria == 'f' || categoria == 'h')  {
				double porcentagem = ((salario/100)*10);
				System.out.println("Reajuste de 10%  R$" + porcentagem);
					
			}
			
			
			if (categoria =='b' ||  categoria == 'd' || categoria == 'e' || categoria == 'i'|| categoria == 'j'|| categoria == 't')  {
				double porcentagem = ((salario/100)*15);
				System.out.println("Reajuste de 15% R$"+ porcentagem);
			}
			
			
			if (categoria =='b' ||  categoria == 'k' || categoria == 'r')  {
				double porcentagem = ((salario/100)*25);
				System.out.println("Reajuste de 25% R$" + porcentagem);
			}
			
			
			if (categoria =='l' ||  categoria == 'm' || categoria == 'n' || categoria == 'o'|| categoria == 'p'|| categoria == 'q'|| categoria == 's')  {
				double porcentagem = ((salario/100)*35);
				System.out.println("Reajuste de 35% R$"+ porcentagem);
				
			}
			
			
			if (categoria =='u' ||  categoria == 'v' || categoria == 'x' || categoria == 'y'|| categoria == 'w'|| categoria == 'z')  {
				double porcentagem = ((salario/100)*50);
				System.out.println("Reajuste de 50% R$"+ porcentagem);
				
			}
			
				
			}
	}
				
				
	


