package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Frams.feature", 
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		glue = {"stepDefen","hooks.corg","pageObj"},
		monochrome = true,
		plugin = {"pretty",
				"html:target/login.html",
				"json:target/login.json",
				"junit: target/login.xml"
				}
		)


public class FrameRunner {

}
