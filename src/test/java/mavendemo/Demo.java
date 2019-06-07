package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
@Test
public static void openBrowser()
{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\Selenium_Project\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.seleniumhq.org/");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
	System.out.println(driver.getTitle());
	
	driver.close();
}
}
