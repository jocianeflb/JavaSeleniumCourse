import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		//This is one example of dynamic dropdown, need to select one value to load options for other dropdwon 
		System.getProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		WebElement staticDropdown1 = driver.findElement(By.className("red-arrow-btn"));
		staticDropdown1.click();
		
		//a[@value='BLR']
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		//a[@value='MAA']
		//Identified by index - There are 2 equal element on screen
		//driver.findElement(By.xpath("(//a[@value='MAA')[2]")).click();
		//Copy full xpath
		//driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[7]/a")).click();
		
		//Unique identifier by Xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		

	}

}
