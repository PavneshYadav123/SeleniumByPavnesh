import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class ScreenShot extends Base{

	@BeforeClass
	void setup() {
		driver.get("http://www.qaclickacademy.com/");	
	}
	
	@Test
	public void getScreenShot() throws IOException
	
	{
		
		TakesScreenshot screenShot=((TakesScreenshot) driver);
		File screenShotFile=screenShot.getScreenshotAs(OutputType.FILE);
		File screenShotDest=new File("D:\\Diploma.jpg");
		FileUtils.copyFile(screenShotFile,screenShotDest);
	}
	
	
	
}
