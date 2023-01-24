package stepDef;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("user is on Home Page")
	public void user_is_on_Home_Page(){
		homePage.navigateTo_HomePage();	
	}

	@When("he search for {string}")
	public void he_search_for(String product)  {
		homePage.perform_Search(product);
	}
	
}
