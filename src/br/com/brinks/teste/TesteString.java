package br.com.brinks.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura";//objeto literal
		
		String vazio = "   Gabriel de sene";
		
		//.trim tira os espaços de uma String do começo e do final
		String outroVazio = vazio.trim();
		System.out.println(outroVazio);
		
		//isEmpty serve para devolver se a String está vazia, retorno em boolean
		System.out.println(vazio.isEmpty());
		
		
		
		//String outro = new String("Alura");
		
		//nome.replace, o replace substitui uma letra por outra
		//nome.replace("A", "a");
		//transforma tudo em letras minúsculas
		//String nome2 = nome.toUpperCase()
		//nome2 = nome.toLowerCase()
		//System.out.println(nome2)
		
		
		
		//mostra quantos caracteres tem
		//System.out.println(nome.length());
		
		for(int i=0; i <nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		//substring, vc digita a posição que quer começar
		//ex se sua palavra é alura, e vc digita 1, vai começar pelo "l"
		//ou seja, ficará lura o resultado da String
		System.out.println(nome.substring(1));
		
		//char é apenas 1 caracter;
		//.charAt(posição) é usado para mostrar o caracter de posição que quer pelo número na palavra;
		char c = nome.charAt(3);
		
		//mostra qual posição está o caracter desejado
		int pos = nome.indexOf("r");
		
//		String nome3 = nome.toUpperCase();
//		System.out.println(nome3);
//		System.out.println(c);
		System.out.println(pos);
		
		//transforma em letras maiúsculas;
		
		//nome.toUpperCase();
		
		
		//System.out.println(nome);
				

	}

}
