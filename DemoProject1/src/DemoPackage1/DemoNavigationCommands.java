package DemoPackage1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DemoNavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		// 1. Launch new Browser
		WebDriver driver= new ChromeDriver();
		
		// 2. Open https://dev.wandrstar.com/  website
		driver.get("https://dev.wandrstar.com/");
		driver.manage().window().maximize();
		
		// 3. Refresh the page
		driver.navigate().refresh();
		
		// 4. Click on Sign-Up button
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement signUpBtn= wait.until(ExpectedConditions.elementToBeClickable(By.className("signup-button")));
		signUpBtn.click();
		String signUpURL1= driver.getCurrentUrl();
		System.out.println("SignUp URL is1:"+ signUpURL1);
		
		// 5. Navigate to 
	
		driver.navigate().to("https://dev.wandrstar.com/");
		String signUpURL2= driver.getCurrentUrl();
		System.out.println("SignUp URL is2:"+ signUpURL2);
		
	    // 6. Navigate Back
		driver.navigate().back();
		String signUpURL3= driver.getCurrentUrl();
		System.out.println("SignUp URL is3:"+ signUpURL3);
		
		// 7. Navigate forward
		driver.navigate().forward();
		String mainURL= driver.getCurrentUrl();
		System.out.println("SignUp URL is4:"+mainURL);

	}

}
