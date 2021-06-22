package listaF;
import java.util.Scanner;
public class F7 {

	public static void main(String[] args) {
	
		Scanner leia= new Scanner(System.in);
		float X, Y,Z;
		
		System.out.println("Digite o valor de X" );
		X=leia.nextFloat();
		
		System.out.println("Digite o valor de Y" );
		Y=leia.nextFloat();
		
		System.out.println("Digite o valor de Z" );
		Z=leia.nextFloat();
		
		if((X<0)||(Y<0)||(Z<0)){
		System.out.println("Os valores não podem formar um triangulo");
			}
		else if((X==Y)&&(X==Z)&&(Y==Z)){
	System.out.println("Os valores podem formar um triangulo equilátero");
	}
		else if((X==Y)||(X==Z)||(Y==Z)){
	System.out.println("Os valores podem formar um triangulo isósceles");
	}
		else if((X!=Y)&&(X!=Y)&&(Y!=Z)){
	System.out.println("Os valores podem formar um triangulo Escaleno");
}
}
}
