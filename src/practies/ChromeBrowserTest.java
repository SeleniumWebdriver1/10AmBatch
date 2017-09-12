package practies;



import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\admin\\Downloads\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

driver.get("Http://Facebook.com");
	}

}
