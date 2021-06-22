package listaF;
import java.util.Scanner;
public class F3 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner leia= new Scanner(System.in);
			double N1,N2,N3,N4,soma, média;
			
			System.out.println("digite o valor N1");
			N1=leia.nextDouble();
			
			System.out.println("digite o valor N2");
			N2=leia.nextDouble();
			
			System.out.println("digite o valor N3");
			N3=leia.nextDouble();
			
			System.out.println("digite o valor N4");
			N4=leia.nextDouble();
			
			soma=(N1+N2+N3+N4);
			média=(soma/4);
			
			if(média>=5) {
			System.out.println("Aluno APROVADO e sua média foi de:"+ média);	
			}
			else {
				System.out.println("Aluno REPROVADO e sua média foi de:"+ média);	
				}
		}
	}

