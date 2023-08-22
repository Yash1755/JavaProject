package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32//ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
     	// driver.close();
		
		driver.findElement(By.id("name")).sendKeys("Helloo"); 	// main web page
	
		
		// IQ : total number of frames
		
		List<WebElement>iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are: "+ iframes.size());
		
		
		//Switch to frame 3
		driver.switchTo().frame("frm3"); // by using ID
		
//		WebElement frame3 = driver.findElement(By.id("frm3"));
//		driver.switchTo().frame(frame3);
		
		//Switch to frame 1
		driver.switchTo().frame("frm1"); // by using Id (child frame)
		
		// perform operation on frame 1
		Select course = new Select(driver.findElement(By.id("selectnav1")));
		course.selectByVisibleText("Tutorials");
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("")).sendKeys("ParentFrame"); // frame 3
		
		driver.switchTo().defaultContent(); // for go to first page use default content
		driver.findElement(By.id("name")).sendKeys("Main page");
		
		
		
	}

}

	
	
	

