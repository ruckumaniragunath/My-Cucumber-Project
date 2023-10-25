package pageObjects;

import org.openqa.selenium.By;

public class SOverFlow {

	public By stackOverFlow_Logo() {return By.xpath("(//span[text()='Stack Overflow'])[1]");	}
	
	public By stackOverFlow_About() {return By.xpath("(//a[text()='About'])[1]");	}
	public By HeaderMenu_Products() {return By.xpath("(//a[contains(.,'Products')])[1]");	}
	public By HeaderMenu_ForTeams() {return By.xpath("//a[text()='For Teams']");	}
	public By HeaderMenu_SearchBox() {return By.xpath("//input[@name='q']");	}
	public By HeaderMenu_LogIn() {return By.xpath("//a[text()='Log in']");	}
	public By HeaderMenu_SignUp() {return By.xpath("(//a[text()='Sign up'])[2]");	}
		
	
	

}
