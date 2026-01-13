package DemoPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRadioButton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://wandrstar.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement radio2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='tripType' and @value='2']")));
		radio2.click();
		
		//WebElement radio1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='tripType' and @value='1']")));
		//radio1.click();
		
		// 1. Verify that if the Radio Button is selected using isSelected() method
		
		if(radio2.isSelected()) {
			System.out.println("Round Trip Button is selected");
		} else
				System.out.println("Round Trip button is not selected");
			
		
		//2. Verify that if the Radio Button is displayed using isDisplayed() method
		
		if(radio2.isDisplayed()) {
			System.out.println("Round Trip Button is displayed");
		} else
				System.out.println("Round Trip button is not displayed");
		
		
		//3. Verify that if the Radio Button is enabled using isEnabled() method
		
		if(radio2.isEnabled()) {
			System.out.println("Round Trip Button is Enabled");
		} else
				System.out.println("Round Trip button is not Enabled");
	
	
	}

}
