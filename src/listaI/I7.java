package listaI;

import java.util.Scanner;

public class I7 {

	public static void main(String[] args) {
	
	//Desenvolva um programa para ler a idade de um conjunto de alunos (N alunos) de uma sala de 
	//aula e calcular a média das idades destes alunos.

		int idade, i, contAluno = 0, media, alunos;
		
		
	    Scanner leia=new Scanner (System.in);
	    
	    for (i = 0; i < 4; i ++ ) {
	    	contAluno++;
	    	
	    	System.out.println("Idade Aluno " + contAluno + " Digite sua idade: ");
	    	idade=leia.nextInt();
	    	
	    	media = idade/4;
	    	
	    	System.out.println(" A media da idade dos alunos" + contAluno + " é " + media  );
	    }

	
	}
}


