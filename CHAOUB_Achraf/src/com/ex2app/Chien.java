package com.ex2app;

public class Chien {

	private String nom;
	
	public Chien(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom ;
	}
	
	public void aboyer() {
	}
	public void manger() {
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean mangeR = false ;
		boolean aboyeR= false;
		boolean mangeM = false ;
		boolean aboyeM= false;
		
		Chien c1 = new Chien("REX");
		
		Chien c2 = new Chien("MAX");
		
		
		c1.aboyer();
		c1.manger();
		mangeR = true;
		aboyeR = true;
		
		c2.aboyer();
		c2.manger();
		aboyeM = true;
		mangeM  =true;
		
		if(c1.getNom() == "REX") {
			if((mangeR) && (aboyeR)) {
				System.out.println(" [Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !!\r\n"
						+ "WWWWOARF !! - Je mange de la viande] ");
				
			}
		}
		
			
		if(c2.getNom() == "MAX") {
			if((mangeM) && (aboyeM)) {
				System.out.println("[Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je\r\n"
						+ "mange du poisson] ");
				
			}
		}

	}

}
