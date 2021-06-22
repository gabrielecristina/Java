package listaF;
import java.util.Scanner;
public class F10 {

	public static void main(String[] args) {
	
		Scanner leia= new Scanner(System.in);
		 int n;
		 int maior=0;
		 int menor=Integer.MAX_VALUE;
		 
		 for(int i=0; i<5; i=i+1) {
		System.out.println("digite N"+(i+1)+":");	 
		n=leia.nextInt();
		if(n>maior) {
			maior=n;
}
		if(n<menor) {
		menor=n;	
		}
 }
	System.out.println("maior:" + maior);
	System.out.println( "menor:" + menor);
	leia.close();
}
}
