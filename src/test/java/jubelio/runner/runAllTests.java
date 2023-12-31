package jubelio.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/jubelio/features",
        glue = {"jubelio.utilities", "jubelio.step_defenitions"},
        plugin = {"html:target/HTML_report.html"}
)
public class runAllTests {}
