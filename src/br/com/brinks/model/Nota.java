package br.com.brinks.model;



public class Nota {
	
	
	public void verificaNota(float media) {
		if(media <5) {
			throw new NotaException("Nota insuficiente para passar de ano");
		}
		System.out.println("e passou de ano");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nota";
	}
	


	
}
