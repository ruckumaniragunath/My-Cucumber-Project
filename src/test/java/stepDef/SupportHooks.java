package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class SupportHooks {
	
	@Given("Create driver instance and launch the url")
	public void create_driver_instance_and_launch_the_url() {
	    System.out.println("This is background steps");
	}
	
	@Before(order=0)  //
	public void dataBaseSetup() {
		System.out.println("Doing database setup");
		
	}
	
	@Before(order=1)
	public void apiSetup() {
		System.out.println("Doing api setup");
		
	}
	@After(order=0)
	public void closingDatabaseSetup() {
		System.out.println("Closing database setup");
	}

}
