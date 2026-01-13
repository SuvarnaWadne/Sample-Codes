package DemoPackage1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPostSignIn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://dev.wandrstar.com/");
		driver.manage().window().maximize();
		
		// Sign-Up Script
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement SignUpBtn= wait.until(ExpectedConditions.elementToBeClickable(By.className("signup-button")));
		SignUpBtn.click();
		
		WebElement FirstName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		FirstName.sendKeys("Wikscs");
		
		WebElement LastName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
		LastName.sendKeys("Wiloscs");
		
		WebElement Email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Email.sendKeys("wikywilsoscs@gmail.com");
		
		WebElement Password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		Password.sendKeys("wikywislsoscs@123");
		
		WebElement Confirmpwd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmPassword")));
		Confirmpwd.sendKeys("wikywislsoscs@123");
		
		WebElement CheckBox= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='name']")));
		CheckBox.click();
		
		WebElement SignUp= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.w-100")));
		SignUp.click();
			
		//Login Script (Post SignUp)
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("ssIFrame_google")));

		// Now the iframe is active, wait for the element to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("yourElementIdInsideIframe"))).click();

		// Switch back to main content
		driver.switchTo().defaultContent();
		
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("wikywilsoscs@gmail.com");
		
		WebElement PWD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		PWD.sendKeys("wikywislsoscs@123");
		
		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.w-100")));
		loginBtn.click();
	} 

}
