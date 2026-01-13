package DemoPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHotelBooking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.wandrstar.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));	
		WebElement Hotel= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Hotels")));
		Hotel.click();
		
		  
		//Get current URL
        String url= driver.getCurrentUrl();
        System.out.println("Current Url is:"+ url);
		
		}

}
