package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {	
		int codigo;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Digite o código de Departamento: ");
		codigo=leia.nextInt();
		
		
		if(codigo == 1) {
			System.out.println("Departamento Expedição: ");
		}
		
		if(codigo == 2) {
			System.out.println("Departamento Recursos Humanos: ");
			
		}
		
		if(codigo == 3) {
			System.out.println("Departamenro Logística: ");
		}
		
		if(codigo == 4) {
			System.out.println("Departamenro Contabilidade: ");
		}
			
			
	}


	
}
	
