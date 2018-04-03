package moteur;



public enum TypeMoteur {

	DIESEL("Diesel"),
	ESSENCE("Essence"),
	HYBRIDE("Hybride"),
	ELECTRIQUE("Electrique");
	
	public String type = "";
	
	
	private String typeMoteur;
    
    TypeMoteur(String typeMoteur)
    {
        this.typeMoteur = typeMoteur;
    }
     
    public String toString()
    {
        return typeMoteur;
	}
	 
}

