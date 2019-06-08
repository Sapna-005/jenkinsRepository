package mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlueStone_GoldCoin_1 
{
	public static WebDriver driver;
	@Test
	public static void verifyProduct() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Selenium_Project\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.get("https://www.bluestone.com");
	    String xpath="//div[@class='container']/nav/ul/li[@id='goldCoins']/a";
		WebElement goldcoin = driver.findElement(By.xpath(xpath));
		
		Thread.sleep(2000);
		
		Actions action= new Actions(driver);
		action.moveToElement(goldcoin).perform();

		WebElement coin = driver.findElement(By.xpath("//span[text()='1 gram']"));
		String cointext = coin.getText();
		
		System.out.println(cointext);
		coin.click();
		
		WebElement img = driver.findElement(By.xpath("//div[@id='wrap']/a/img"));
		String actvalue = img.getAttribute("alt");
		String expvalue="1 gram 24 KT Gold Coin";
		
		if (actvalue.equals(expvalue)) 
		{
			System.out.println(" Validated");
		}else
			System.out.println(" Invalid ");
		
		driver.close();
		
}
}
