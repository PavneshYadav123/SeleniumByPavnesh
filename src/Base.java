import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver;
	@BeforeTest
	public void initDriver(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavnesh.yadav\\Desktop\\Jar\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	@AfterTest
	void teardown()
	{
		driver.close();
	}

}
