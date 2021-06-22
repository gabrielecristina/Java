package listaF;
import java.util.Scanner;
public class F4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		float N1,N2,N3,N4, média, exame,Novamédia;
		
		System.out.println("Digite o valor da nota 1" );
		N1=leia.nextFloat();
		
		System.out.println("Digite o valor da nota 2" );
		N2=leia.nextFloat();
		
		System.out.println("Digite o valor da nota 3" );
		N3=leia.nextFloat();
		
		System.out.println("Digite o valor da nota 4" );
		N4=leia.nextFloat();
		
		média=(N1+N2+N3+N4/4);
		
		if(média>=7) {
			System.out.println("Aluno APROVADO e sua média foi de:"+ média+".");	
		}
		else {
			System.out.println("digite o valor do EXAME");	
			exame=leia.nextFloat();
		
			Novamédia=((média+exame)/2);
			if(Novamédia>=5) {
				System.out.println("Aluno APROVADO em exame com média"+ Novamédia + ".");	
		}
				else { System.out.println("Aluno Reprovado com média"+ Novamédia +".");
		}
	
	}

	}
}
