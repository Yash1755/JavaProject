package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp_site 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.crome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	}

}
