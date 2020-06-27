package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homepage.Homepage;

public class StepDefination {
    Homepage page=new Homepage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        page.baseurl();
        page.search();
    }

    @When("^user fill up all details$")
    public void user_fill_up_all_details() throws Throwable {

    }

    @Then("^user should get temporary clubcard number$")
    public void user_should_get_temporary_clubcard_number() throws Throwable {

    }


}
