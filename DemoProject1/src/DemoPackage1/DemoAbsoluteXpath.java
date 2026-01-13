package DemoPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;



public class DemoAbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat.wandrstar.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement img = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[1]/div/a/div/img"))); 
		System.out.println("Logo images is displayed:" + img.isDisplayed());
			 
			}

}

