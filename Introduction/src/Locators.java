import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
		//WebElement error = driver.findElement(By.cssSelector("p.error"));
		WebElement error = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p"));
		System.out.println("Error: " + error.getText());
		
		WebElement forgotPassLink = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println("Forgot password link text: " + forgotPassLink.getText());
		forgotPassLink.click();
		
		//Copy outerHTML
		//<input type="text" placeholder="Name">
		//XPATH //Tagname[@atribute='value']
		WebElement forgPassName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		forgPassName.sendKeys("John");
		
		//WebElement forgEmail = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		//or Use Selector Hub to help to find element by Xpath
		WebElement forgEmail = driver.findElement(By.xpath("//input[@type='text'][2]"));
		//input[@placeholder='Email'] or copy relative Xpath from Select hub
		forgEmail.sendKeys("john@rsa.com");
		
		WebElement phoneNumber = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]"));
		phoneNumber.sendKeys("9864353253");
		
		//Expect button to be clickable
		WebElement resetLoginButton = driver.findElement(By.cssSelector(".reset-pwd-btn"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(resetLoginButton)).click();
		
		WebElement infoMsg = driver.findElement(By.xpath("//p[@class='infoMsg']"));
		System.out.println("Message: " + infoMsg.getText());
		//p[@class='infoMsg']
		
		//button[@class='reset-pwd-btn']
		
		//*[@id="container"]/div[1]/form/p
		
		//driver.close();
		//driver.quit();

	}

}
