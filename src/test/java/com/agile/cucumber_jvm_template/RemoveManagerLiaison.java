package com.agile.cucumber_jvm_template;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/StoryRemoveManager.feature", glue = "" )
public class RemoveManagerLiaison {

}
