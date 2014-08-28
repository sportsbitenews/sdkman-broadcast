import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@Cucumber.Options(
	format=["pretty", "html:build/reports/cucumber"],
	strict=true,
	features=["features"],
	glue=["src/funtest/steps"],
	tags=["~@manual", "~@review"]
)
class RunCukesTest {}
