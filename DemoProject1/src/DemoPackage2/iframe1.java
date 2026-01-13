package DemoPackage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class iframe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		// Find all iframe elements
		List <WebElement> TotaliFrames = driver.findElements(By.tagName("iframe"));
		
		// Print number of iframes found
        System.out.println("Total number of iframes on this page: " +TotaliFrames.size());
        
        // Optional: Print iframe IDs or names
        for (WebElement iframe : TotaliFrames) {
            System.out.println("Iframe: " + iframe.getAttribute("id") + " | " + iframe.getAttribute("name"));
        }

        // Close browser
        driver.quit();
		
	}

}
