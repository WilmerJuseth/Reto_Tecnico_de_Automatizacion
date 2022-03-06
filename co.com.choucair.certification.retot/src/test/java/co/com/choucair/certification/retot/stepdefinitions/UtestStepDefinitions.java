package co.com.choucair.certification.retot.stepdefinitions;

import co.com.choucair.certification.retot.model.UtestData;
import co.com.choucair.certification.retot.tasks.OpenUpUtest;
import co.com.choucair.certification.retot.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Jose wants to be able to access tester jobs$")
    public void thatJoseWantsToBeAbleToAccessTesterJobs() {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenUpUtest.thePage());
    }


    @When("^he fills in the form for the creation of a new user$")
    public void heFillsInTheFormForTheCreationOfANewUser(List<UtestData> data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(data.get(0).getFirts_name()
                ,data.get(0).getLast_name()
                ,data.get(0).getEmail()));
    }

    @Then("^access the Utest platform$")
    public void accessTheUtestPlatform() {

    }

}
