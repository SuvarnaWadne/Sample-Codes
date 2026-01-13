package DemoPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.lang.Thread;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCheckbox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		// 1.Locate and select a checkbox in Selenium using the ID locator
			//WebElement hobbie1 = driver.findElement(By.id("hobbies-checkbox-1"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie1); //Forces a JavaScript-based click on an element when Selenium's .click() fails
		
		// 2. Locate and select a checkbox in Selenium using the XPath locator 
			//WebElement hobbie1 = driver.findElement(By.xpath("//label[text()='Sports']"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie1);
		
		//WebElement hobbie2 = driver.findElement(By.xpath("//label[text()='Reading']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie2);
		
		// 3. Locate and select a checkbox in Selenium using the CSS Selector locator
			//WebElement hobbie1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie1);
	
			//WebElement hobbie2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie2);
			
			//WebElement hobbie3 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie3);
			
		// Perform validations on a CheckBox
			// 1. isSelected() method to validate if the CheckBox is selected
				WebElement hobbie1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
				boolean isSelected = hobbie1.isSelected();
					if(isSelected == false) {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie1);
						hobbie1.click();
							}
			
			// 2. isDisplayed() method to validate if the CheckBox is displayed
				WebElement hobbie2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
				boolean isDisplyed = hobbie1.isDisplayed();
					if(isDisplyed == true) {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie2);
						hobbie2.click();
							}
			
			// 3. isEnabled() method to validate if the CheckBox is enabled
				WebElement hobbie3 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
				boolean isEnabled = hobbie1.isEnabled();
					if(isEnabled == true) {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbie3);
						hobbie3.click();
							}
				
			}
	}

