package moteur;


public enum TypeMoteur {

	DIESEL("Moteur DIESEL "),
	ESSENCE("Moteur ESSENCE "),
	HYBRIDE("Moteur HYBRIDE "),
	ELECTRIQUE("Moteur ELECTRIQUE ");
	
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

