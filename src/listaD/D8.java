package listaD;
import java.util.Scanner;
public class D8 {

	public static void main(String[] args) {
		
	
		int num1, num2,resultado;
		
        Scanner leia=new Scanner (System.in);
                
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();
        
        if(num1>num2) {
            resultado=num1/num2;
            System.out.println("Resultado da divisão: " + resultado);
        }
        
        if(num1<num2) {
            resultado=num2/num1;
            System.out.println("Resultado da divisão: " + resultado);

        }
       }
	}


