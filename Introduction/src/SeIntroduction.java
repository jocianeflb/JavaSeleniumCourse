import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		//Chrome - ChromeDriver -> Methods
		//Crete drivers/ and add the browser drivers (exe) to be used
		System.getProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
