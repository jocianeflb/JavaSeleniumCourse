import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeIntroduction {

	public static void main(String[] args) throws InterruptedException {
		// Invoking 
		//Chrome - ChromeDriver -> Methods
		//Create drivers/ folder and add the browser drivers (exe) to be used
		System.getProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Invoking 
		//Firefox - FirefoxDriver -> Methods
		//Using GeckoDriver
		//System.getProperty("webdriver.gecko.driver", "src\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		// Invoking 
		//Edge - EdgeDriver -> Methods
		//System.getProperty("webdriver.edge.driver", "src\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();

		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();	
		driver.quit();
	}
}
