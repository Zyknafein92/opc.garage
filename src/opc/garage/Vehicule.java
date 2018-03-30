package opc.garage;

import java.util.ArrayList;
import option.*;
import vehicule.Marque;

import java.util.List;



public abstract class Vehicule extends Garage implements Option {

	protected double prix;
	protected String nom;
	protected List<Option> options =  new ArrayList<Option>();
	protected Marque nomMarque;
	protected double prixT;


	// Constructeur - 

	public Vehicule(){
		this.prix = 0.00;
		this.nom = "Inconnu";
		this.nomMarque = null;
		this.options = new ArrayList<Option>();
	}

	public Vehicule(Double pPrix, String pNom,Marque pNomMarque,List<Option> pOptions ){

		this.prix = pPrix;
		this.nom = pNom;
		this.nomMarque = pNomMarque;   
		this.options =  new ArrayList<Option>(pOptions);
	}


	// Getters

	public double getPrix() {
		return prix;
	}
	public String getNom() {
		return nom;
	}
	public List<Option> getOptions() {
		return options;
	}
	public Marque getMarque() {
		return nomMarque;
	}
	public Marque getNomMarque() {
		return nomMarque;
	}

	public double getPrixT() {
		return prixT;
	}


	// Setters


	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public void AddOptions(List<Option> options) {
		this.options = options;
	}

	
	public void setPrixT(double prixT) {
		this.prixT = prixT;
	}



	// String (a revoir)
	public String toString()
	{
		String str="  + Voiture "+getMarque()+" : "+getNom()
		+" "+toString() +"("+getPrix()+"€) "
		+ " [ ";
		return str;

	}
// Méthode de calcul tt a faire
}
