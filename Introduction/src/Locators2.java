import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		String name = "rahul";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement usernameField = driver.findElement(By.id("inputUsername"));
		usernameField.click();
		usernameField.sendKeys(name);
		
		WebElement passwordField = driver.findElement(By.name("inputPassword"));
		//Using TagName: 
		//WebElement passwordField = driver.findElement(By.tagName("Input[placeholder='Password']")); ???
		passwordField.click();
		passwordField.sendKeys(password);
		WebElement loginButton = driver.findElement(By.className("signInBtn"));
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement successMessageField = driver.findElement(By.tagName("p"));
		Assert.assertEquals(successMessageField.getText(), "You are successfully logged in.");
		WebElement headerMessage = driver.findElement(By.cssSelector("div[class=login-container] h2"));
		Assert.assertEquals(headerMessage.getText(), "Hello " + name +",");
		
		//Find by text on element
		WebElement logOutButton = driver.findElement(By.xpath("//button[text()='Log Out']"));
		logOutButton.click();
		
		System.out.println("Selenium script executed successfully!");
		driver.quit();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement forgotPassLink = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println("Forgot password link text: " + forgotPassLink.getText());
		forgotPassLink.click();
		Thread.sleep(1000);
		//Expect button to be clickable
		WebElement resetLoginButton = driver.findElement(By.cssSelector(".reset-pwd-btn"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.elementToBeClickable(resetLoginButton)).click();
		String infoMsg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println("Message: " + infoMsg);
		String password = infoMsg.split("'")[1];
		System.out.println("Password: " + password);
		return password;
	}

}
