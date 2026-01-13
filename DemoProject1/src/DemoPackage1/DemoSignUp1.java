package DemoPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSignUp1 {

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
		FirstName.sendKeys("Jhon");
		
		WebElement LastName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
		LastName.sendKeys("Doe");
		
		WebElement Email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Email.sendKeys("johndoe@gmail.com");
		
		WebElement Password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		Password.sendKeys("johndoe@123");
		
		WebElement Confirmpwd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmPassword")));
		Confirmpwd.sendKeys("johndoe@123");
		
		WebElement CheckBox= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='name']")));
		CheckBox.click();
		
		WebElement SignUp= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.w-100")));
		SignUp.click();
		
	}

}
