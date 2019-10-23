package Epic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		System.out.println("hello world!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsultana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
	}

}
