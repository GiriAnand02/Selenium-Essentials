import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		
		//Invoking browser
		//Chrome  ChromeDriver exten->Methods close get
		//Firefox-FirefoxDriver ->Methods close get
		//Safari - SafariDriver ->Methods close get
		
		//chromedriver.exe --> Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/OneDrive/Desktop/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		//webdriver.gecko.driver
		System.setProperty("webdriver.geckodriver.driver", "C:/Users/DELL/OneDrive/Desktop/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
  