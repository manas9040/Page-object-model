package pomutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMHome {
	public WebDriver driver;
	
	@FindBy(xpath=".//*[@id='txtUsername']")
	public WebElement username;
	@FindBy(xpath=".//*[@id='txtPassword']")
	public WebElement password;
	@FindBy(xpath=".//*[@id='btnLogin']")
	public WebElement login;

	public OrangeHRMHome(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterURL(String url  ){
	driver.get(url);	
	}
	
	
	public void login(String uname,String pwd){
		username.sendKeys(uname);
	password.sendKeys(pwd);
		login.click();

    }
	
	public  String title(){
    	 
    	 return driver.getTitle();
}
		
	}

