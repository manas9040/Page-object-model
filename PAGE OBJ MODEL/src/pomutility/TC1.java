package pomutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

public class TC1 
{
	public OrangeHRMHome org;
	 WebDriver driver;
	 
	 @Test
public void openbrowser() throws Exception{
	driver=new FirefoxDriver();
	
	org=PageFactory.initElements(driver,OrangeHRMHome.class );
	org.enterURL("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	//Utility.capturescreenshot(driver,"browserstarted");
	
	/*TakesScreenshot ts = (TakesScreenshot)driver;
	File scrfile=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File("./Screenshot/orangehrm.png"));
	System.out.println("screenshoot taken");*/
	
	
	System.out.println(org.title());
	driver.manage().window().maximize();
	Thread.sleep(5000);
	org.login("Admin","admin123");
	Utility.capturescreenshot(driver,"loginpage");
	
	
	}

}
