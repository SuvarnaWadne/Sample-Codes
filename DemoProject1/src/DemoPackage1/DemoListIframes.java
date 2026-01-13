package DemoPackage1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoListIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open the target URL
            driver.get("https://dev.wandrstar.com/");
            driver.manage().window().maximize();

            // Optional wait to ensure all elements are loaded
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

            // Find all iframe elements
            Thread.sleep(5000);
            List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
            System.out.println("Total iframes found: " + iframes.size());

            // Print details of each iframe
            for (WebElement iframe : iframes) {
                System.out.println("-----------");
                System.out.println(" - ID: " + iframe.getAttribute("id"));
                System.out.println(" - Name: " + iframe.getAttribute("name"));
                System.out.println(" - Src: " + iframe.getAttribute("src"));
                System.out.println(" - Displayed: " + iframe.isDisplayed());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Optional: Close the browser
            driver.quit();
        }
	}

}
