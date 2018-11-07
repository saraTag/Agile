package com.agile.cucumber_jvm_template;





/**
 * Décrivez votre classe Manager ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Adjoint 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
   
    private String nom;
    private String ville;
    private Restaurant restaurant;
    
    
    public Adjoint() {
    	nom = "John";
    	ville = "Toulouse";
    	restaurant= null;
    }
    /**
     * Constructeur d'objets de classe Manager
     */
    
    public Adjoint(Restaurant r, String nom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.restaurant = r;
        ville=r.getVille();
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
    public String getNom() {
    	return this.nom;
    }
    
    public String getVille() {
    	return this.ville;
    }
    
    public Restaurant getRestaurant() {
    	return restaurant;
    }
    
    public void setVille() {
    	ville = restaurant.getVille();
    }
    
    public void setNom(String nomManager) {
    	this.nom=nomManager;
    }
    
    
    public void setRestaurant(Restaurant rest ) {
	   restaurant = rest ;
	   ville=restaurant.getVille();
   }
    
    
   public void removeRestaurant() {
	   restaurant = null;
	   ville = "";
   }
   @Override
   public boolean equals (Object o) {
	   if (o instanceof Adjoint) {
		   return ((Adjoint) o).getNom()== nom &&((Adjoint) o).getVille()== ville;
	   }
	   return false;
   }
    
   
        
     
    
    
}