package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\com\\featurefile\\Gmail.feature"},
		glue= {"com.stepdefinition"},
		monochrome = true,
		tags="@Everything",
		stepNotifications= true		
)
public class RunnerClass 
{
	
}
	

	
	


