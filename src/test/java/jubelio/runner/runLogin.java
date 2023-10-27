package jubelio.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/jubelio/features/login.feature",
        glue = {"jubelio.utilities", "jubelio.step_defenitions"},
        plugin = {"html:target/login_report.html"}
)
public class runLogin {}
