package Epic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice_locators_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsultana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	/*	driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Username");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@id='Login']")).click();    */
		
		
	/*	Thread.sleep(4000);
		driver.findElement(By.cssSelector("#username")).sendKeys("TestUser1");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("TestPassword");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		String text_from_ac = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String error = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(text_from_ac == error);
		
		if(text_from_ac == error) {
			System.out.println("true");
		}    */
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Partial Link')]"));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[contains(@id,'lastname')]")).sendKeys("User");
		driver.findElement(By.cssSelector("#buttonwithclass")).click();
	//	boolean radio_button_male = driver.findElement(By.cssSelector("#sex-0")).isEnabled();
	//	System.out.println(radio_button_male == true);
	//	WebElement radio_button_male = driver.findElement(By.cssSelector("#sex-0"));
		WebElement radio_bttn_female = driver.findElement(By.xpath("//input[@value='Female']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio_bttn_female).click().perform();
		System.out.println("Radio button female is selected");  
		
	/*	boolean radio_bttn_exp = driver.findElement(By.cssSelector("form[class='form-horizontal'] div[class='control-group'] input[id='exp-0']")).isEnabled();
		System.out.println(radio_bttn_exp != false);
		
		driver.findElement(By.xpath("//form[@class='form-horizontal']/div[@class='control-group']/input[@id='exp-0']")).isDisplayed(); */
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
