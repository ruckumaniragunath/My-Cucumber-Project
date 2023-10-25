package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SOverFlow;
import common.Reusable;

public class Stackoverflow {

	WebDriver driver;
	Action AC;
	Reusable REU;


	SOverFlow SOF;


	@Given("User launch Stackoverflow application")
	public void user_launch_stackoverflow_application() {
		
		REU = new Reusable();
		driver = REU.createDriverInstance(REU.getGlobalData("browser"));
		driver.get(REU.getGlobalData("url"));

		System.out.println("User successfully launched stackoverflow application");
		AC = new Action(driver);  //calling Action class constructor by passing active driver instance.(Action.java)
		SOF = new SOverFlow();
	}

	@When("User validate Stackoverflow logo in primary menu")
	public void user_validate_stackoverflow_logo_in_primary_menu() {

		//Assert.assertTrue(driver.findElement(By.xpath("(//span[text()='Stack Overflow'])[1]")).isDisplayed());
		Assert.assertTrue(AC.clickForElementPresence(SOF.stackOverFlow_Logo()));


	}

	@When("User validate Stackoverflow About in primary menu")
	public void user_validate_stackoverflow_about_in_primary_menu() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='About'])[1]")).isDisplayed());

	}

	@When("User validate Stackoverflow Products in primary menu")
	public void user_validate_stackoverflow_products_in_primary_menu() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[contains(.,'Products')])[1]")).isDisplayed());
	}

	@When("User validate Stackoverflow For Teams in primary menu")
	public void user_validate_stackoverflow_for_teams_in_primary_menu() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='For Teams']")).isDisplayed());

	}

	@When("User validate Stackoverflow Search box in primary menu")
	public void user_validate_stackoverflow_search_box_in_primary_menu() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed());

	}

	@When("User validate Stackoverflow Log in in primary menu")
	public void user_validate_stackoverflow_log_in_in_primary_menu() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log in']")).isDisplayed());

	}

	@When("User validate Stackoverflow Sign up in primary menu")
	public void user_validate_stackoverflow_sign_up_in_primary_menu() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='Sign up'])[2]")).isDisplayed());

	}

	@Then("User close the application")
	public void user_close_the_application() {
		driver.quit();
	}
	
	@Before(order=3)
	public void middleLayerSetup() {
		System.out.println("Middle layer setup");
		
	}

}
