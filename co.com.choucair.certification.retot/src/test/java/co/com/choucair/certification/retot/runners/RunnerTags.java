package co.com.choucair.certification.retot.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/creation_of_new_user.feature",
        tags="@storiesUtest",
        glue="co.com.choucair.certification.retot",
        snippets =SnippetType.CAMELCASE)

public class RunnerTags {
}
