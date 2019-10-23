package Epic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsultana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		/*driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		System.out.println(driver.getTitle());
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();*/
		
		driver.close();  //what's the difference between driver.close(); & driver.quit(); or are they the same thing? 
		
		
		/* LOCATORS: 
		 * 
		 */
		
		
		//driver.get("https://amazon.com");
		
		//driver.findElement(By:id()).isDisplayed();
		
		/*driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("fsultana");
		driver.findElement(By.id("password")).sendKeys("password123");*/
		
		
	}

}
