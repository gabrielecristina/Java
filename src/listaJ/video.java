package listaJ;
import java.util.Scanner;

public class video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia= new Scanner(System.in);
		char resp='s';
		int codDP;
		int totInfo=0, totCtb=0, totMrk=0;
		int TFE=0;
		double TFP=0.0;
		double salario=0.0, salarioTot=0.0;
		double SGI=0.0,SGC=0.0,SGM=0.0;
		System.out.println("-------------------------------------");
		System.out.println("Sistema de cadastro V.2.0");
		System.out.println("-------------------------------------");
		System.out.println("-----------------Tela de código----------------");
		System.out.println("1-Informática");
		System.out.println("2-Contabilidade");
		System.out.println("3-Marketing");
		System.out.println("-----------------------------------------------");
		while (resp=='s') {
		System.out.println("Digite o codigo do departamento");
		codDP=leia.nextInt();
		System.out.println("Digite o salário do funcionário: ");
		salario=leia.nextDouble();

		if(codDP==1) {
		salarioTot=salario+(salario*0.1);
		System.out.println("O valor reajustado foi de R$:" + salarioTot);
		SGI=SGI+salarioTot;
		totInfo=totInfo+1;
		}
		else if(codDP==2) {
		salarioTot=salario+(salario*0.15);
		System.out.println("O valor reajustado foi de R$:" + salarioTot);
		SGC=SGC+salarioTot;
		totCtb=totCtb+1;
		}
		else if(codDP==3) {
		salarioTot=salario+(salario*0.2);
		System.out.println("O valor reajustado foi de R$:" + salarioTot);
		SGM=SGM+salarioTot;
		totMrk=totMrk+1;
		}
		TFE=totInfo+totCtb+totMrk;
		TFP=SGI+SGC+SGM;
		leia.nextLine();
		System.out.println("Deseja continuar? Sim (s) Não (n): ");
		resp=leia.nextLine().charAt(0);
		}
		System.out.println("--------------Relátorio DPTO de Informática--------------");
		System.out.println("Total de funcionários da informática: " + totInfo);
		System.out.println("Soma dos salários do Dpto de informatica: R$"+SGI);
		System.out.println("-----------------------------------------------------");
		System.out.println("---------Relátorio do DPTO de Contábilidade--------------");
		System.out.println("Total de funcionários da informática: " + totCtb);
		System.out.println("Soma dos salários do Dpto de Contábilidade: R$"+SGC);
		System.out.println("-----------------------------------------------------");
		System.out.println("---------Relátorio do DPTO de Marketing--------------");
		System.out.println("Total de funcionários da Marketing: " + totMrk);
		System.out.println("Soma dos salários do Dpto de informatica: R$"+SGM);
		System.out.println("-----------------------------------------------------");
		System.out.println("---------Relátorio da Folha de pagamento --------------");
		System.out.println("Total de funciónarios é: " + TFE);
		System.out.println("Total da folha de pagamento é: "+ TFP);
		System.out.println("----------------------------------------- --------------");
		leia.close();
		}

}
	


