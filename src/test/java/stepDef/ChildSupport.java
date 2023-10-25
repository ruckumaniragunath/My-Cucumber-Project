package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ChildSupport {
	
	WebDriver driver;




@Given("User launch ChildSupport application with url as {string}")
public void user_launch_child_support_application_with_url_as(String url) {
	driver = new ChromeDriver();
	driver.get(url);
   
}

@When("User validate ChildSupport logo in primary menu")
public void user_validate_child_support_logo_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='header-organization-banner']//img")).isDisplayed());
   
}

@When("User validate page title as {string}")
public void user_validate_page_title_as(String title) {
	Assert.assertEquals(driver.getTitle(), title);
}

@When("User validate ChildSupport OurAgency in primary menu")
public void user_validate_child_support_our_agency_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Our Agency']")).isDisplayed());
   
}

@When("User validate ChildSupport Services We Offer in primary menu")
public void user_validate_child_support_services_we_offer_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Services We Offer']")).isDisplayed());
   
}

@When("User validate ChildSupport Quick Links in primary menu")
public void user_validate_child_support_quick_links_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Quick Links']")).isDisplayed());
	
   
}

@When("User validate Stackoverflow How To in primary menu")
public void user_validate_stackoverflow_how_to_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='How To...']")).isDisplayed());
	
    
}

@When("User validate ChildSupport Forms&Info in primary menu")
public void user_validate_child_support_forms_info_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Forms & Info']")).isDisplayed());
	
   
}

@When("User validate ChildSupport Employers in primary menu")
public void user_validate_child_support_employers_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Employers']")).isDisplayed());
   
}

@When("User validate ChildSupport Search in primary menu")
public void user_validate_child_support_search_in_primary_menu() {
	Assert.assertTrue(driver.findElement(By.xpath("//li[@id='nav-item-search']/button/span")).isDisplayed());
   
}

@Then("User close ChildSupport application")
public void user_close_child_support_application() {
	driver.quit();
   
}

}






















