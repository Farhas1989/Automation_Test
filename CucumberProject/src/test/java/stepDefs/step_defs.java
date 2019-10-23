package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class step_defs {

    @Given("^a user has navigate to google\\.com$")
    public void a_user_has_navigate_to_googlecom() throws Throwable {
        System.out.println("a user has navigate to google.com");
    }
    
    @Given("^I user has navigate to google\\.com$")
    public void I_user_has_navigate_to_googlecom() throws Throwable {
        System.out.println("hello world");
    }

    @And("^I sign up as a new user$")
    public void i_sign_up_as_a_new_user(DataTable data) throws Throwable {
    	
    	//create a list of strings
    	List<List<String>> object = data.raw();
    	//from the list get that data from the first row, first column
    	System.out.println(object.get(0).get(4));
        
    }
    
//    @Then("^search results are displayed$")
//    public void search_results_are_displayed() throws Throwable {
//        throw new PendingException();
//    }
//
//    @And("^a user login using a username and passowrd$")
//    public void a_user_login_using_a_username_and_passowrd() throws Throwable {
//        throw new PendingException();
//    }
//
//    @And("^a user clicks Enter$")
//    public void a_user_clicks_enter() throws Throwable {
//        throw new PendingException();
//    }

}