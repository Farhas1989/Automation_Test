package Epic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsultana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize(); //can be used to maximize or minimize the browser window. 
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000); //Thread command helps in pausing the execution for a few seconds. Explicit wait: two types - Thread.sleep() & WebDriverWait  
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cookie Monster");
		Thread.sleep(4000);
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(3000);
		boolean search_result = driver.findElement(By.cssSelector(".a-color-state.a-text-bold")).isDisplayed();
		System.out.println(search_result);
		driver.findElement(By.linkText("Hasbro")).click(); 
		driver.findElement(By.linkText("Try Prime")).click();  
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().forward();
		//driver.wait(2000);//
		driver.quit();
		
		
		
		

	}

}
