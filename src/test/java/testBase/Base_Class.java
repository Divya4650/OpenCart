package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Class {

	public WebDriver driver;
	public Logger logger; //for log4j
	public Properties p;
	
	@BeforeClass//(groups= {"Sanity","Regression","Master"})
	//@Parameters({"os","browser"})
	
	//public void setup(String os,String brows) throws IOException 
	public void setup() throws IOException 

	
	{
		//loading config.prop file
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
	 logger=LogManager.getLogger(this.getClass());
		
	 	
		driver=new ChromeDriver();
	/* switch(brows.toLowerCase()) 
	 {
	 case "chrome" : driver=new ChromeDriver(); break;
	 case "edge" : driver=new EdgeDriver(); break;
	 case "firefox" : driver=new FirefoxDriver(); break;
	 default : System.out.println("Invalid browser name.."); return;
	 }*/
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("url")); //reading url from properties file
		driver.manage().window().maximize();
	}
	
	@AfterClass //(groups= {"Sanity","Regression","Master"})
	public void close() {
		driver.quit();
	}
	
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}
	
	//to generate random strings
		public String randomstring() {
			String generatedString=RandomStringUtils.randomAlphabetic(5);
			return generatedString;
		}
		
		public String randomNumber() {
			String generatedNumber=RandomStringUtils.randomNumeric(10);
			return generatedNumber;
		}
		public String randomAlphaNumeric() {
			String generatedstring=RandomStringUtils.randomAlphabetic(3);
			String generatedNumber=RandomStringUtils.randomNumeric(3);
			return (generatedstring+"@"+generatedNumber);
		}
	
}
