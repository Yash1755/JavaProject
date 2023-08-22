package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSite {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32//ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.close();
		
	}

}
