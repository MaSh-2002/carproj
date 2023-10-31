package carpro;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
  
 
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "uses_cases", 
         glue = "carpro")

public class Testing {

}
