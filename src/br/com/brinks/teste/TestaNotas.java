package br.com.brinks.teste;

import java.util.Scanner;

import br.com.brinks.model.*;

public class TestaNotas {

	public static void main(String[] args) {
		String nomes[] = new String [2];
		float notas[][] = new float [2][2];
		float media[] = new float[2];
		
		
		Nota n = new Nota();
		Scanner leia = new Scanner(System.in);
		
		for(int contnome = 0; contnome <2;contnome++) {
			System.out.println("Digite o nome:");
			nomes[contnome] = leia.next();
			
			for(int contnota =0; contnota <2; contnota++) {
				System.out.println("Digite a " +(contnota+1)+ "º nota"+"\n");
				notas[contnome][contnota] = leia.nextFloat();
				
				media[contnome] += notas[contnome][contnota];
			}
			media[contnome]=(media[contnome]/2);
		
		}
		
		for(int contnome = 0; contnome <2;contnome++) {
			System.out.println("O aluno: "+nomes[contnome]+ " teve média: "+media[contnome]);
			try {
				n.verificaNota(media[contnome]);
			}catch(NotaException ex) {
				System.out.println("Exception: "+ex.getMessage());
			}
			
		}
	}

}
