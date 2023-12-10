package hookStepRunner;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomClasses.LandAndHomePOM;

public class LandAndHomePageStepDef {
	LandAndHomePOM lhp=new LandAndHomePOM(DriverFactory.getDriver());
	
	@Given("User is at AutomationExercise landing page")
	public void user_is_at_automation_exercise_landing_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	
	}

	@Then("Title should contains the {string}")
	public void title_should_contains_the(String string) {
		String title = lhp.getTitle();
		boolean isPresent = title.contains("Automation");
		Assert.assertTrue(isPresent);
		System.out.println(title);
	 
	}

	@Then("User should able to see Cart link enabled")
	public void user_should_able_to_see_cart_link_enabled() {
		boolean isenabled=lhp.cartlink();
		Assert.assertTrue(isenabled);
		 
	
	}

	@When("User should click on login link")
	public void user_should_click_on_login_link() {
		lhp.LoginMeth();
		 
	 
	}

	@When("User should enter username as {string}")
	public void user_should_enter_username_as(String username) {
		lhp.EnterEmail(username);
		 
	  
	}

	@When("User should enter password as {string}")
	public void user_should_enter_password_as(String password) {
		lhp.Password(password);
		 
	
	}

	@When("User should click on Login button")
	public void user_should_click_on_login_button() {
		lhp.LoginButton();
		
	 
	}

	@Then("User should able to see Features Items")
	public void user_should_able_to_see_features_items() {
		 boolean FItems=lhp.Features_item();
		 Assert.assertTrue(FItems);
		 
	
	}

}
