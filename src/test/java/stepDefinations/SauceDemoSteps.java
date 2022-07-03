package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class SauceDemoSteps {

	@Given("load url")
	public void load_url() {
		System.out.println("load url");
	}

	@Then("open hame page")
	public void open_hame_page() {
		System.out.println("open hame page");
	}

	@Then("oen to login page")
	public void oen_to_login_page() {
		System.out.println("oen to login page");
	}
	
	@Then("print line")
	public void print_line() {
	   System.out.println("\n*************************************************\n");
	}


	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("User is on NetBanking landing page");
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String userName, String password) {
		System.out.println("User Name : " + userName + "\n Password: " + password);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		System.out.println("Home page is populated");
	}

	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String Validataion) {
		System.out.println("validation : " + Validataion);

	}

	@When("User login into application with with folling details")
	public void user_login_into_application_with_with_folling_details(DataTable dataTable) {

		List<List<String>> list = dataTable.asLists();
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(0).get(1));
		System.out.println(list.get(0).get(2));
		System.out.println(list.get(0).get(3));
		System.out.println(list.get(0).get(4));

	}

	@When("User login in to application with username {string} and password {string}")
	public void user_login_in_to_application_with_username_and_password(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password:" + password);
	}

}
