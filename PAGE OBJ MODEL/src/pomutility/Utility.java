package pomutility;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void capturescreenshot(WebDriver driver,String screenshootname) throws Exception{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./Screenshoot/"+screenshootname+".png"));
		System.out.println("screenshoot taken");
		
		
	}
}
