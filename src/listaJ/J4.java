package listaJ;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
	
		Scanner leia=new Scanner (System.in);
		
		int resp =0, sexo, totH, totM, totMEng = 0, totMPsic = 0,  totMulheresMed =0 , totHadmc =0;
		float percPessoasMed, PercMulMed , totMed = 0, totP = 0, percH = 0;
		
		while (resp !=5) {
		System.out.println("Escolha seu curso: \n1 - Eng da computação \n2 - ADM \n3 - Medicina \n4 Psicologia \n5 - Sair");
		resp=leia.nextInt();
		
		if(resp !=5) {
		totP++;
		System.out.println("Informe seu sexo \n1 - Masculino \n2 Feminino");
		sexo=leia.nextInt();
		
		
		if ((sexo == 1) && (resp == 1)) {
			totMEng++;
				}
		else if ((sexo == 2) && (resp == 1)) {
			totMPsic++;
				}
		
		else if ((sexo == 1) && (resp == 2)) {
			totHadmc++;
				}
		else if (resp == 3) {
			totMed++;
			if (sexo == 2) {
			totMulheresMed++;
			}
		
				}
			}	
		}
		percPessoasMed = ((totMed * 100)/totP);
		percH = (( totHadmc * 100)/totP);
		System.out.println("Total de pessoas " +totP );
		System.out.println("Total de homens no curso Eng computação " + totMEng);
		System.out.println("Mulheres no curso de psicologia " + totMPsic);
		System.out.println("Pessoas medicna " +percPessoasMed  + "%");
		System.out.println("Total homens em ADM = " + percH + "%" );
	}
}

	

