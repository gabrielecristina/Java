package listaF;
import java.util.Scanner;
public class F4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		float N1,N2,N3,N4, m�dia, exame,Novam�dia;
		
		System.out.println("Digite o valor da nota 1" );
		N1=leia.nextFloat();
		
		System.out.println("Digite o valor da nota 2" );
		N2=leia.nextFloat();
		
		System.out.println("Digite o valor da nota 3" );
		N3=leia.nextFloat();
		
		System.out.println("Digite o valor da nota 4" );
		N4=leia.nextFloat();
		
		m�dia=(N1+N2+N3+N4/4);
		
		if(m�dia>=7) {
			System.out.println("Aluno APROVADO e sua m�dia foi de:"+ m�dia+".");	
		}
		else {
			System.out.println("digite o valor do EXAME");	
			exame=leia.nextFloat();
		
			Novam�dia=((m�dia+exame)/2);
			if(Novam�dia>=5) {
				System.out.println("Aluno APROVADO em exame com m�dia"+ Novam�dia + ".");	
		}
				else { System.out.println("Aluno Reprovado com m�dia"+ Novam�dia +".");
		}
	
	}

	}
}
