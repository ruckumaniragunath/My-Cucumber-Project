package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	
	public WebDriver driver = null;
	
	public Action(WebDriver driver) {   //this.driver is current class level driver which is initialized by null. But we are making it active by passing the driver instance by parameter. This active driver instance is coming from setDef file.
		this.driver = driver;  //current driver = parameterized driver
	}
	
	public void click_And_wait(By by) {
		try {
			driver.findElement(by).click();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");
		}
		
	}
	
	public boolean clickForElementPresence(By by) {
		boolean flag = false;
	
		try {
			driver.findElement(by).isDisplayed();
			flag = true;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not present");
		}
		return flag;
	
	}

}

