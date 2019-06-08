package mavendemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlueStone_10 {
	 public static WebDriver driver;
		@Test
		public static void verifyProduct() throws Exception
		{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\Selenium_Project\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    driver.get("https://www.bluestone.com");
		    
		    
		  String xpath="//div[@class='container']/nav[@class='wh-navbar']/ul//li[@class='menuparent offers-menuparent pull-right']/a";
	        WebElement offers = driver.findElement(By.xpath(xpath));
	        
	        Actions action= new Actions(driver);
	        
	        action.moveToElement(offers).perform();
	        Thread.sleep(2000);
	        
	      WebElement offer = driver.findElement(By.xpath("//span[text()='Flat 10% Off']"));
	      
	      String offertext = offer.getText();
	      offer.click();
	      
	      
	      Thread.sleep(2000);
	      
	      
	     List<WebElement> filterText = driver.findElements(By.xpath("//span[@class='orange-color']"));
	     
	     for (WebElement text : filterText) 
	     {
	    	 String filteredtext = text.getText();
	         
	        // Assert.assertEquals(offertext, filteredtext);
		}
	      
	     driver.close(); 
	}
}
