package DemoPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://dev.wandrstar.com/travel-insurance");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// 1. Insurance Coverage Type
		WebElement dropdown1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("insuranceCoverageType")));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("individual");
		
		// 2. Insurance Type
		WebElement dropdown2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("insuranceType")));
		Select select2=new Select(dropdown2);
		select2.selectByValue("travel");
		
		//3. Destination Country
		WebElement dropdown3= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("destinationCountry")));
		Select select3= new Select(dropdown3);
		select3.selectByValue("Central African Republic");
		
	}

}
