package com.ex7.app;

public class Diplome {
	
	private String titre; 
	private String mention; 
	private int anobtenu; 
	
	
	//constructeur par default
	public Diplome() {
		
	}
	
	public Diplome(String titre,String mention , int anobtenu) {
		this.titre = titre;
		this.mention = mention;
		this.anobtenu = anobtenu ; 
	}
 
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	public int getAnobtenu() {
		return anobtenu;
	}

	public void setAnobtenu(int anobtenu) {
		this.anobtenu = anobtenu;
	}
	
	public void afficherDiplome() {
		System.out.println("Le titre du diplome est : "+this.getTitre()+" , pris avec une mention :"+this.getMention()+"Et la note est :"+this.anobtenu);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Diplome d1 = new Diplome();
		Diplome d2 = new Diplome("Master", "TRES BIEN", 18);
		
		d1.setTitre("TS");
		d1.setMention("BIEN");
		d1.setAnobtenu(12);
		
		d1.afficherDiplome();
		d2.afficherDiplome();
		
		System.out.print(d2.getMention());
		
		

	}

}
