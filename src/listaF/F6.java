package listaF;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		double codigo, salario, porcemtagem, resultado;
		
	      Scanner leia=new Scanner (System.in);
	      
	      System.out.println("Digite o Código: ");
	      codigo=leia.nextDouble();

	      
	      System.out.println("Digite o Salario: ");
	      salario=leia.nextDouble();
	      
	      if(codigo == 1) {
	    	  porcemtagem = ((salario/100)*5);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Função Operador " + resultado);
	      }
	      
	      
	      if(codigo == 2) {
	    	  porcemtagem = ((salario/100)*10);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Função Programador " + resultado);
	      }
	      
	      if(codigo == 3) {
	    	  porcemtagem = ((salario/100)*15);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Função Analista " + resultado);
	      }
	      if(codigo == 3) {
	    	  porcemtagem = ((salario/100)*25);
	    	  resultado = salario+porcemtagem;
	    	  
	    	  System.out.println("Função Gerente " + resultado);
	      }
		}

	}


