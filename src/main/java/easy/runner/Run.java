package easy.runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)			
@CucumberOptions(
		features="fazerBusca.feature",
		glue={"easy.Step"}
		)
public class Run {

}

