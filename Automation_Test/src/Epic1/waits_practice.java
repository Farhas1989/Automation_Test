package Epic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsultana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*	driver.manage().window().maximize();
		driver.get("http://itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click(); 
		
		// create an object for wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		
		boolean message = driver.findElement(By.cssSelector("#results")).isDisplayed();
		if(message) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
		
		*/
		
		
		
/*		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		//switch focus to a frame using WebDriver
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.cssSelector("#draggable")).click();
		
	/*	boolean visible_or_not = driver.findElement(By.cssSelector("#draggable")).isDisplayed();
		
		if (visible_or_not) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}  
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable")); 
		act.dragAndDrop(source, target).build().perform();
		
		System.out.print("You dragged and dropped");  */
		
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)"); // if the element is on bottom.
		
		
//		Choose a from destination
		driver.findElement(By.id("travel_from")).sendKeys("Chicago");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("Rockford")));
		actions.click();
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	//	driver.findElement(By.id("travel_from")).sendKeys(Keys.ARROW_DOWN);
	//	driver.findElement(By.id("travel_from")).sendKeys(Keys.ENTER); 
		
	//  Choose the date April 23
		driver.findElement(By.cssSelector("#travel_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")){
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int list_size = dates.size();
		for(int i = 0; i <list_size; i++) {
			String text_of_day = dates.get(i).getText();
			if(text_of_day.equalsIgnoreCase("23")){
				dates.get(i).click();
				System.out.println("Selected April" + text_of_day);
				break;
			}
		}
		
	//	Choose a language
		
		driver.findElement(By.cssSelector("select[id='travel_language'] option[value='Urdu']")).click(); 
		
	//	Choose an To location
		
		driver.findElement(By.id("travel_to")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.id("travel_to")).sendKeys(Keys.ENTER); 		
			
	//	Pick an airline
		
		driver.findElement(By.cssSelector("select[id='travel_airline'] option[value='Turkish Airlines']")).click();
		Thread.sleep(1000);
		
	// Lets click search	
		
		driver.findElement(By.cssSelector("div[class='foot-right'] button[class='btn btn-primary']")).click();
	  
		driver.close();
		
		
		
		
		
		
		
		

	}

	
		
	}

