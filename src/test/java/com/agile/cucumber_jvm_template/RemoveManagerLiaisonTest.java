package com.agile.cucumber_jvm_template;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/StoryRemoveManager.feature", glue = "" )
public class RemoveManagerLiaisonTest {

}
