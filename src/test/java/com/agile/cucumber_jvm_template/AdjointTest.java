package com.agile.cucumber_jvm_template;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test ManagerTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class AdjointTest
{
    private Restaurant restaura1;
    private Adjoint manager1;
    private Adjoint manager;
    private Adjoint manager2;
    private Restaurant restaura2;
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    

    /**
     * Constructeur de la classe-test ManagerTest
     */
    public AdjointTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        restaura1 = new Restaurant();
        manager1 = new Adjoint(restaura1,"Cook");
        manager1.setVille();
        manager= new Adjoint();
        manager2= new Adjoint(restaura1,"Co");
        restaura2= new Restaurant("Buffalo", "Bordeaux");
        
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    @Test
    public void testJunit() {
    	assertTrue(!false);
    }
    /// Tester les getters
    @Test
    public void testGetNom()
    {
        assertEquals(manager.getNom(),"John");
    }
    @Test
    public void testGetVille()
    {
        assertEquals(manager.getVille(),"Toulouse");
    }
    @Test
    public void testGetRestaurant() {
    	assertEquals(manager.getRestaurant(), null);
    }
    
    /// Tester le constructeur 
    @Test
    public void testConstructeur() {
    	assertEquals(manager1.getNom(),"Cook");
    	assertEquals(manager1.getVille(),"Paris");
    	assertEquals(manager1.getRestaurant(),restaura1);
    }
    //Tester les setter
    @Test
    public void testSetNom() {
    	manager1.setNom("Ramsay");
    	assertEquals("Ramsay",manager1.getNom());
    }
    @Test
    public void testSetRestaurant() {
    	manager.setRestaurant(restaura1);
    	assertEquals(manager.getRestaurant(),restaura1);
    	assertEquals(manager.getVille(),"Paris");
    }
    @Test
    public void testEquald() {
    	assertTrue(manager.equals(manager));
    	assertTrue(!manager.equals(null));
    	assertTrue(!manager1.equals(manager));
    	assertTrue(!manager1.equals(manager2));
    	manager2.setRestaurant(restaura2);
    	assertTrue(!manager1.equals(manager2));
    }
    
    
}

