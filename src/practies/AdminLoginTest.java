package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest {

	
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		String actText=driver.findElement(By.id("welcome")).getText();
		System.out.println(actText);
		if (actText.contains("Admin"))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}

	}

}
