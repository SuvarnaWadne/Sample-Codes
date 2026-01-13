package DemoPackage2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//1. Switch to Frame using Frame name
        driver.switchTo().frame("frame1");
        
        // 2. Identifying the heading in WebElement
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading")));
        
        // 3. Finding the text of the heading
        String frame1Text=heading.getText();
        
        // 4. Print the heading text
        System.out.println(frame1Text);
        
        // 5. closing the driver
        driver.close();
	
		}

}
