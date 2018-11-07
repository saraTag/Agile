package com.agile.cucumber_jvm_template;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestTest {
    
	
	private  Restaurant restaurant,restaurant1,restaurant2;
	private Adjoint adjoint1,adjoint2;
	
	@Before
	public void setUp() throws Exception {
	
	
	
	restaurant = new Restaurant();
	restaurant1=new Restaurant("Buffalo","Paris");
    restaurant2=new Restaurant("Dominos","Neuilly");
    adjoint1 = new Adjoint(restaurant1,"Sara");	
	adjoint2 = new Adjoint(restaurant2,"Megan");
    
    }

	@After
	public void tearDown() throws Exception {
	}
     
	
	//tester les getters du restaurant 
	@Test
	public void testGetNom() {
		assertEquals("FoodChéri",restaurant.getNom());
	}
	
	@Test
	public void testGetVille() {
		assertEquals("Paris",restaurant.getVille());
	
	}
	  
	
	// Tester les constructeurs 
	@Test
	public void testConstructeur(){
		assertEquals("Buffalo",restaurant1.getNom());
		assertEquals("Paris",restaurant1.getVille());
	}

	
	//tester les setters 
	@Test
	public void testSetNom() {
		
		restaurant1.setNom("Buff");    
		assertEquals("Buff",restaurant1.getNom());
		
	}
	
	@Test	
    public void testSetVille() {
		
		restaurant1.setVille("Marseille");    
		assertEquals("Marseille",restaurant1.getVille());
		
	}
	
 
	
	//Tester la relation bidirectionnelle
	
	@Test
	public void testAddManager() {
		restaurant1.addManager(adjoint1);
		assertEquals(1,restaurant1.getManagers().size());
		assertEquals(adjoint1,restaurant1.getManagers().get(0));
	}
	
	@Test
	public void testRemoveManager() {
		restaurant1.addManager(adjoint1);
		restaurant1.removeManager(adjoint1);
		assertEquals(0,restaurant1.getManagers().size());
	}
	/**

	private void Association() {
		m1.setRestaurant(r1,r2);
	    r1.setNomManager(m1);
	    r2.setNomManager(m1);
	}
	@Test
	public void testAssociation() {
		
		Association();
	    
	    assertEquals(2,m1.getRestaurant());
	    assertEquals(m1,r1.getNomManager());
	    assertEquals(m1,r2.getNomManager());
		
	
	}

	**/
	//Tester les fonctions simples
	@Test
	public void testNombreManager() {
		assertEquals(0,restaurant1.NombreManagerRestaurant());	
	}
	
	 @Test 
	    public void testGetManager() {
	    	restaurant1.addManager(adjoint1);
	        restaurant1.addManager(adjoint2);
	      
	     assertEquals("Sara,Megan,",restaurant1.getManager());
	    }
		
	 @Test
	 public void testAfficher() {
		 assertEquals(restaurant1.Afficher(),"Restaurant Buffalo de la ville Paris");
	 }
	 @Test
	 public void testEquals() {
	    	assertTrue(restaurant.equals(restaurant));
	    	assertTrue(!restaurant.equals(null));
	    	assertTrue(!restaurant.equals(restaurant1));
	    	assertTrue(!restaurant2.equals(restaurant1));
	    	restaurant1.setNom("FoodChéri");
	    	/*assertTrue(!manager1.equals(manager2));
	    	restaurant2.setRestaurant(restaura2);
	    	assertTrue(!manager1.equals(manager2));*/
	 }
	
	
}