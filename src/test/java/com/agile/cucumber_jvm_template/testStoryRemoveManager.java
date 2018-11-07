package com.agile.cucumber_jvm_template;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStoryRemoveManager {
	
	Restaurant rest ;
	Adjoint a;
	
	@Given("^un manager travaille dans un restaurant$")
	public void un_manager_travaille_dans_un_restaurant() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rest = new Restaurant ();
		a = new Adjoint ();
		rest.addManager(a);
		a.setRestaurant(rest);
	    //throw new PendingException();
	}

	@When("^on supprime le manager du restaurant$")
	public void on_supprime_le_manager_du_restaurant() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rest.removeManager(a);
	    a.removeRestaurant();
		//throw new PendingException();
	}

	@Then("^valider que le manager n'apparait plus dans la liste des adjoints du rerstaurant$")
	public void valider_que_le_manager_n_apparait_plus_dans_la_liste_des_adjoints_du_rerstaurant() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(a.getRestaurant(),null);
		assertEquals(rest.getManagers().contains(a),false);
	    //throw new PendingException();
		
	}

}
