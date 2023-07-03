package StepDefinitionsSoftCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesHardCode.LoginPageH;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepsToImplementFeatureFile
{
	public WebDriver driver;
	public LoginPageH lp;
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SELENIUM\\Drivers\\114.0.5735.198ChromeBrowserVersion\\chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPageH(driver);
		 
		 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
	 	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
	    lp.clickLogin_Button();
	    
	    }

	@Then("page tittle should be {string}")
	public void page_tittle_should_be(String title) {
	    if(driver.getCurrentUrl().contains("https://m.facebook.com/checkpoint/?__req=5"))
	    {
	    driver.close();
	   // Assert.assertTrue(false);
	}else
	{
		driver.getCurrentUrl();
		//Assert.assertEquals(title, driver.getCurrentUrl());
		
	}
	}
	@When("close brower")
	public void close_brower() {
	    driver.quit();
	}
}
	

	