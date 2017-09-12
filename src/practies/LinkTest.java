package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LinkTest 
{
		public static void main(String[] args)
	{
			
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("Http://google.co.in");
			driver.manage().window().maximize();	
	if (driver.findElement(By.linkText("Gmail")).isDisplayed())
	{
		System.out.println("App Launch Successfully");
	}else
	{
		System.out.println("App Launch Fail");
	}
			
		
	}

}
