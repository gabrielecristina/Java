package listaI;

import java.util.Scanner;

public class I6 {
	
	//) Desenvolva um programa para ler a média de 20 alunos e calcular a quantidade de alunos que 
	//foram aprovados. Para um aluno ser aprovado a sua média deve ser maior ou igual a 6.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1, nota2, nota3, nota4;
		int media, i, contAluno = 0;
		
		
	    Scanner leia=new Scanner (System.in);
	    
	    for (i = 0; i < 20; i ++ ) {
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
	    	
		    	
		    	
		    
		    if(media >= 6) {
		    	
		    	System.out.println("Aluno Aptovados!" + media);
		    }
		    else {
		    	
		    	System.out.println("Aluno Reprovado " + media);
	    }
	    
	   }
	}
}
	    
	    
	     
	



	


