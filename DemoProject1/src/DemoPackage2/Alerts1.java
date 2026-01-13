package DemoPackage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Alerts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// 1. Simple Alerts
		WebElement button1 = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button1);
		Alert simpleAlert= driver.switchTo().alert();
		simpleAlert.accept();

		// 2. Prompt Alerts
		WebElement button2 = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button2);
		Alert promptAlert= driver.switchTo().alert();
		String alertText1= promptAlert.getText();
		System.out.println("Prompt Alert Text is: "+ alertText1);
		promptAlert.sendKeys("Suvarna");
		promptAlert.accept();
		
		// 3. Confirmation Alerts
		WebElement button3 = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button3);
		Alert confirmationAlert= driver.switchTo().alert();
		String alertText2= confirmationAlert.getText();
		System.out.println("Confirmation alert is: " +alertText2 );
		confirmationAlert.accept();
		
	}

}
