import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.icu.text.SimpleDateFormat;

public class MultipleScreenShot extends Base {
	
	@BeforeClass
	void setup() {
		driver.get("http://www.qaclickacademy.com/");	
	}
	@Test
	 public void passScreenCapture() throws IOException
    {
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,  new File("D:\\Pavnesh_old\\"+sdf.format(d)+".png"));      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)
    }

	 public void FailScreenCapture() throws IOException
	    {
	        Date d = new Date();
	        System.out.println(d.toString());

	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile,  new File("D:\\Pavnesh_old\\"+sdf.format(d)+".png"));      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)
	    }

	
}
