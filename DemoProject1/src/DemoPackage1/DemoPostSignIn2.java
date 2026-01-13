package DemoPackage1;
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.netty.handler.timeout.TimeoutException;
public class DemoPostSignIn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://dev.wandrstar.com/");
		driver.manage().window().maximize();
		
		// Sign-Up Script
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Click the "Sign Up" button
		// Click the "Sign Up" button
		WebElement signUpBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("signup-button")));
		signUpBtn.click();

		// Fill the signup form
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("Wikscstt");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName"))).sendKeys("Wiloscstt");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("wikywilsoscstt@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("wikywislsoscstt@123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmPassword"))).sendKeys("wikywislsoscstt@123");

		// Click the "Terms & Conditions" checkbox label (adjust XPath if needed)
		WebElement CheckBox= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='name']")));
		CheckBox.click();

		// Click the Sign Up submit button
		WebElement signUpSubmit = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.w-100")));
		signUpSubmit.click();


		// ========== LOGIN FLOW (post signup) ========== //

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("ssIFrame_google")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("yourElementIdInsideIframe"))).click();
		driver.switchTo().defaultContent();

		// Enter email and password
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("wikywilsoscstt@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("wikywislsoscstt@123");

		// Click the Login button
		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.w-100")));
		loginBtn.click();
	}

}
