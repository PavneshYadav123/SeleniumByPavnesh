import java.io.BufferedInputStream;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class PDFReader extends Base{
	URL url;
	@BeforeClass
	void setup() {
		String urlName;
		driver.get("http://www.vandevenbv.nl/dynamics/modules/SFIL0200/view.php?fil_Id=5515");
		
	}	
	@Test
	public void getPDFData() throws IOException, InterruptedException {
		Thread.sleep(5000);		
		url=new URL(driver.getCurrentUrl());
		
		//System.out.println(driver.getCurrentUrl());
		
		BufferedInputStream fileToParse = new BufferedInputStream(
				url.openStream());
				 
			PDDocument doc = PDDocument.load(fileToParse);
			String text = new PDFTextStripper().getText(doc);
		 
		
		fileToParse.close();
		doc.close();
		System.out.println(text);
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
