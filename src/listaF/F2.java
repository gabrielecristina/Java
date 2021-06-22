package listaF;
import java.util.Scanner;
public class F2 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int idade;
		System.out.println("digite a idade da criança");
		idade=leia.nextInt();
		
		if((idade==6)||(idade==7)||(idade==8)) {
			System.out.println("Categoria dente de leite");	
		}
		 else if ((idade==9)||(idade==10)||(idade==11)) {
		System.out.println("Categoria pré-mirim");	
		}
		 else if ((idade==12)||(idade==13)) {
				System.out.println("Categoria mirim ");	
				}
		 else if ((idade==14)||(idade==15)) {
				System.out.println("Categoria infantil");	
				}
		 else if ((idade==16)||(idade==17)) {
				System.out.println("Categoria juvenil");	
				}
		 else if ((idade==18)||(idade==19)||(idade==20)) {
				System.out.println("Categoria junior");	
				}
		 else {
				System.out.println("codigo inválido!");
		}
	}
}

