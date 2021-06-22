package listaI;
import java.util.Scanner;
public class I5 {

	
	// Desenvolva um programa para ler quatro notas de 10 alunos e calcular a média destas notas por 
	//aluno.
	
	public static void main(String[] args) {
	
		int nota1, nota2, nota3, nota4;
		int media, i, contAluno = 0;
		
		
	    Scanner leia=new Scanner (System.in);
	    
	    for (i = 0; i < 10; i ++ ) {
	    	contAluno++;
	    	
	    	System.out.println("Aluno " + contAluno + " Digite a primeira nota: ");
	    	nota1=leia.nextInt();
	    	
	    	
	    	System.out.println("Aluno " + contAluno + " Digite a segunda nota: ");
	    	nota2=leia.nextInt();
	    	
	    	
	    	System.out.println("Aluno " + contAluno + " Digite a terceira nota: ");
	    	nota3=leia.nextInt();
	    	
	    	System.out.println("Aluno " + contAluno + " Digite a quarta nota: ");
	    	nota4=leia.nextInt();
	    	
	    	media = (nota1 + nota2 + nota3 + nota4)/4;
	    	
	    	System.out.println(" A media do aluno" + contAluno + " é " + media  );
	    	
	    	
	    	
	    	}
	    	}
	    }
	     
	


