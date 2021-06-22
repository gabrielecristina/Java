package listaI;

import java.util.Scanner;

public class I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		char letra;
		for(letra='a'; letra<='z';letra++) {
		System.out.println(letra);	
		}
		System.out.println(" ");
		for(letra='z'; letra>='a';letra--) {
			System.out.println(letra);	
			}
	}

}