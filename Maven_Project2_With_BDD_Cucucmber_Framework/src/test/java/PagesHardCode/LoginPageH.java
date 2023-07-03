package PagesHardCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageH
{
	WebDriver ldriver;
	
	public LoginPageH(WebDriver rdriver) 
	{
		this.ldriver=rdriver;
		//PageFactory.initElements(rdriver,this);
	}
	
	/*@FindBy(id="m_login_email")
	@FindBy(password="")
	//@CacheLookup*/  
	
	By username_textbox=By.xpath("/html/body");
	By password_textbox=By.xpath("//*[@id=\"m_login_password\"]");
	By login_button=By.name("login");
	//driver.getTitssle();
	
	
	
	
	public void setUserName(String username)
	{
		ldriver.findElement(username_textbox).sendKeys(username);
	}
	public void setPassword(String password)
	{
		ldriver.findElement(password_textbox).sendKeys(password);
		
	}
//	public void getTitle(String title)
//	{
//		
//	}
	public void clickLogin_Button()
	{
		ldriver.findElement(login_button).click();
		
	}
	
}

