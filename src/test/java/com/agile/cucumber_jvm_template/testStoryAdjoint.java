package com.agile.cucumber_jvm_template;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStoryAdjoint {
	Adjoint a ;
	Restaurant rest = new Restaurant();
	Restaurant rest2;
	
	@Given("^un nouveau manager est créé$")
	public void un_nouveau_manager_est_créé() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		a = new Adjoint();
	    //throw new PendingException();
	}

	@When("^un restaurant lui est affecté$")
	public void un_restaurant_lui_est_affecté() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		a.setRestaurant(rest);
	    //throw new PendingException();
	}

	@Then("^le restaurant du manager est celui demandé$")
	public void le_restaurant_du_manager_est_celui_demandé() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(a.getRestaurant(),rest);
		//throw new PendingException();
	}

	@Then("^la ville de l'adjoint correspond à la ville du restaurant correspondant$")
	public void la_ville_de_l_adjoint_correspond_à_la_ville_du_restaurant_correspondant() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(a.getVille(),rest.getVille());
	    //throw new PendingException();
	}

	@Given("^un manager change d'affectation$")
	public void un_manager_change_d_affectation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		a = new Adjoint();
		rest2 = new Restaurant("Quick","Bourg la reine");
		//throw new PendingException();
	}

	@When("^on change le restaurant du manager$")
	public void on_change_le_restaurant_du_manager() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println(a.getNom()+"je suis là"+a.getVille());
		a.setRestaurant(rest2);
		System.out.println("coucou");
		
	    //throw new PendingException();
	}

	@Then("^le nouveau restaurant du manager est enregistré et validé$")
	public void le_nouveau_restaurant_du_manager_est_enregistré_et_validé() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(a.getRestaurant(),rest2);
		//throw new PendingException();
	}

	@Then("^la ville du manager est modifiée$")
	public void la_ville_du_manager_est_modifiée() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(a.getVille(),rest2.getVille());
		//throw new PendingException();
	}


}
