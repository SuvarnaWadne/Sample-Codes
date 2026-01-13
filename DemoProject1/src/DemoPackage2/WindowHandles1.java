package DemoPackage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class WindowHandles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		// 1. Click on "New Tab" Button- Use JavaScript to click the button
			WebElement button1 = driver.findElement(By.id("tabButton"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button1);
			
		// 2. Click on "New Window" Button- Use JavaScript to click the button		
			WebElement button2 = driver.findElement(By.id("windowButton"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button2);
			
		// 3. Click on "New Window Message" Button-Use JavaScript to click the button		
			WebElement button3 = driver.findElement(By.id("messageWindowButton"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button3);
			System.out.println("Text is:" + button3.getText());
			
			driver.quit();
			
	}

}
