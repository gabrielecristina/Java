package DesafioProgramacao;
import java.util.Scanner;


public class Desafio {

 

    public static void main(String[] args) {
       
        Scanner leia= new Scanner(System.in);
        int Qtdpessoas=0,i,dose1total=0,dose2total=0;
        int  pessoasNV=0, N, doses;
        double MediaDidadePnV=0.0, MedidaDidadeP1D=0.0, MedidaDidadeP2D=0.0;
        int idade=0;
    
        System.out.println("Digite a quantidade de pessoas entrevistdas");    
        Qtdpessoas=leia.nextInt();
        for(i=1; i<=Qtdpessoas; i++) {
        System.out.println("Digite a idade das pessoas entrevistdas");    
       idade=leia.nextInt();
       System.out.println("Voce foi vacinado?");
       System.out.println("digite 1-para sim ou 2-para não");
       N=leia.nextInt();
       if(N==2) {
      System.out.println("Não foi vacinado!");
      pessoasNV=pessoasNV+i;
      MediaDidadePnV=(pessoasNV+idade)/MediaDidadePnV;
       }
       
       else {
        if(N==1) {    
        System.out.println("quantas dose? 1-para uma dose ou 2- para duas dose?");
        doses=leia.nextInt();
        if(doses==1) {
        System.out.println("Foi aplicado uma dose");
        dose1total=dose1total+N;
        // MedidaDidadeP1D=(dose1total+idade;
        }
        if(doses==2) {
            System.out.println("Foi aplicado duas dose");
             //dose2total=dose2total+N;
             
             
             
            // MedidaDidadeP2D=N/idade;
             
         
             
             //MediaDidadePnV=(pessoasNV+idade)/MediaDidadePnV;
        }    
    
    }    
       
     
       }
        }
        
      System.out.println("Quantidade de pessoas que receberam a 1 dose foi de "+dose1total);
      System.out.println("Quantidade de pessoas que receberam a 2 dose foi de "+dose2total);
      System.out.println("A média de idade das pessoa que tomaram só a 1 dose é :"+ dose1total + idade + ".");
      System.out.println("A média de idade das pessoa que tomaram só a 2 dose é :"+ MedidaDidadeP2D);
      System.out.println("Quantidade de pessoas que não tomaram vacina:"+ pessoasNV);
      
     
      System.out.println("A média de idade das pessoa que  não tomaram a vacina é :"+ MediaDidadePnV);
    }
}


 
		

	
	

		

		

	 	
	


