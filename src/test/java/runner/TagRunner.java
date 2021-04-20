package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//",
		glue= {"stepdef"},
		monochrome=true,
			/*	tags= {"RegresionTest"}*/
		
	/*	,tags= {"RegresionTest","@SmokeTest"}*/ //And Condition
	//	,tags= {"RegresionTest,@SmokeTest"}// OR condition
		
		//~ symbol-->if we dont want to execute any scenario we can use tild symbol
	
		/*	,tags= {"RegresionTest","~@SmokeTest"}*/
		
		//From specific feature,selecting scenarios
		//tags={"@FunctionalTest","@SmokeTest"}
		
		// if we want to run scenarios without any tags
		tags={"@FunctionalTest","not @SmokeTest","not@RegressionTest"}

		
		)
		
public class TagRunner {
	

}
