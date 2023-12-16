package carpro;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "use_cases", // Path to your feature files
    glue = "carpro" // Package where your step definitions are located
)
public class Testing {
}