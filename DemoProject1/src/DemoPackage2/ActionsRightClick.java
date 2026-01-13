package DemoPackage2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class ActionsRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		// 1. Action Class
		Actions action=new Actions(driver);
		
		// 2. Retrieve WebElement to perform right click
		 WebElement ele1= driver.findElement(By.id("rightClickBtn"));
		 
		//Right Click the button to display Context Menu&nbsp
		 
		 action.contextClick(ele1).perform();
		 
		 // 3. Retrieve WebElement to perform Double Click Action
		 
		 WebElement ele2= driver.findElement(By.id("doubleClickBtn"));
		// Double click
		 action.doubleClick(ele2).perform();
		  
	}
	

}
