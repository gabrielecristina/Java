package listaF;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		double codigo, salario, porcemtagem, resultado;
		
	      Scanner leia=new Scanner (System.in);
	      
	      System.out.println("Digite o C�digo: ");
	      codigo=leia.nextDouble();

	      
	      System.out.println("Digite o Salario: ");
	      salario=leia.nextDouble();
	      
	      if(codigo == 1) {
	    	  porcemtagem = ((salario/100)*5);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Fun��o Operador " + resultado);
	      }
	      
	      
	      if(codigo == 2) {
	    	  porcemtagem = ((salario/100)*10);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Fun��o Programador " + resultado);
	      }
	      
	      if(codigo == 3) {
	    	  porcemtagem = ((salario/100)*15);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Fun��o Analista " + resultado);
	      }
	      if(codigo == 3) {
	    	  porcemtagem = ((salario/100)*25);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Fun��o Gerente " + resultado);
	      }
		}

	}


