import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement usernameField = driver.findElement(By.id("inputUsername"));
		usernameField.click();
		usernameField.sendKeys("rahul");
		
		WebElement passwordField = driver.findElement(By.name("inputPassword"));
		//Using TagName: 
		//WebElement passwordField = driver.findElement(By.tagName("Input[placeholder='Password']")); ???
		passwordField.click();
		passwordField.sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		//Get error message - incorrect password/username
		WebElement error = driver.findElement(By.cssSelector("p.error"));
		System.out.println("Error: " + error.getText());
;		
		//driver.close();
		//driver.quit();

	}

}
