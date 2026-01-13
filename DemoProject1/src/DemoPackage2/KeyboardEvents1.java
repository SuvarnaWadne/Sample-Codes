package DemoPackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class KeyboardEvents1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		

		WebElement fullname= driver.findElement(By.id("userName"));
		fullname.sendKeys("Suvarna")
;		
		WebElement email= driver.findElement(By.id("userEmail"));
		email.sendKeys("abcd@gmail.com");
		
		WebElement currentAdd= driver.findElement(By.id("currentAddress"));
		currentAdd.sendKeys("Lane 123, Tower A");
		
		 // Copy the Current Address
		currentAdd.sendKeys(Keys.CONTROL);
		currentAdd.sendKeys("A");
		currentAdd.sendKeys(Keys.CONTROL);
		currentAdd.sendKeys("C");
		
		 //Press the TAB Key to Switch Focus to Permanent Address
		currentAdd.sendKeys(Keys.TAB);
		
		//Paste the Address in the Permanent Address field
		WebElement permanentAdd= driver.findElement(By.id("permanentAddress"));
		permanentAdd.sendKeys(Keys.CONTROL);
		permanentAdd.sendKeys("V");
		
		// Submit the form
		WebElement submitBtn= driver.findElement(By.id("submit"));
		submitBtn.submit();
		

	}

}
