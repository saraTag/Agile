package com.agile.cucumber_jvm_template;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class testStoryRestaurant {
  Restaurant r;
  
  @Given("^un restaurant existe$")
  public void given() throws Throwable {
	  r=new Restaurant();
  }

@When("^le manager change le nom du restaurant$")
public void le_manager_change_le_nom_du_restaurant() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	r.setNom("KFC");
    //throw new PendingException();
}

@Then("^le nom du restaurant doit être automatiquement mis a jour$")
public void le_nom_du_restaurant_doit_être_automatiquement_mis_a_jour() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertEquals(r.getNom(),"KFC");
   // throw new PendingException();
}

@Given("^le manager souhaite creer un restaurant$")
public void le_manager_souhaite_creer_un_restaurant() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	r=new Restaurant();
   //throw new PendingException();
}

@When("^le manager affecte un nom au restaurant$")
public void le_manager_affecte_un_nom_au_restaurant() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^le restaurant doit être créé avec le nom demandé$")
public void le_restaurant_doit_être_créé_avec_le_nom_demandé() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertEquals(r.getNom(),"FoodChéri");
    //throw new PendingException();
}


}
