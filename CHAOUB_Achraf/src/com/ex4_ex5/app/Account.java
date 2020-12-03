package com.ex4_ex5.app;



public class Account {
	
	private String nom;
	private String adresse;
	private double solde;public Account (String nom,String adresse,double solde) {
		this.nom  = nom;
		this.adresse = adresse ;
		this.solde = solde;
	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void afficherInfos() {
		System.out.println(this.getNom().toUpperCase()+" habite à ("+this.getAdresse()+") - infos solde "+this.getSolde()+"DHS");
	}
	
	public double calculerInterer(double tauxInteret) {
		
		return this.getSolde()+(this.getSolde() * (tauxInteret/100));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tauxInteret = 7;
		
		Account a1 = new Account("achraf chaoub", "safi", 5000);
		Account a2 = new Account("xxxxxx yyyyyyy", "fes", 1233.78);
		Account a3 = new Account("yyyyyyy xxxxxxx", "salé", 4335.149);
		
		// affchage normale sans interets
		
		a1.afficherInfos();
		a2.afficherInfos();
		a3.afficherInfos();
		
		
		//afficher infos apres Interets
		
		a1.setSolde(a1.calculerInterer(tauxInteret));
		System.out.println("Infos après Interets ");
		a1.afficherInfos();
		

	}

}
