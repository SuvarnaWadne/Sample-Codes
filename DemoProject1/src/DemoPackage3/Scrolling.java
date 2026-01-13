package DemoPackage3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://dev.wandrstar.com/");
	        driver.manage().window().maximize();

	        // Scroll down by 500 pixels
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");

	        // Optional wait
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Scroll to a specific element
	        WebElement element = driver.findElement(By.name("name"));
	        js.executeScript("arguments[0].scrollIntoView(true);", element);

	        // Close the browser
	        //driver.quit();

	}

}
