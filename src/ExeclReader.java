import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExeclReader extends Base {

	@BeforeClass
	void setup() {
		
		driver.get("http://www.qaclickacademy.com/");
		
	}
	@Test
	public void getExeclData() throws FileNotFoundException
	{
		FileInputStream fis =new FileInputStream("D:\\Download\\tests-example.xls");
		
		
	}
}
