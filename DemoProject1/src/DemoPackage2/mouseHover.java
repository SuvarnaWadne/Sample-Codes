package DemoPackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class mouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		
		// 1. Action Class
		Actions action=new Actions(driver);
		
		// 2. Main menu
		WebElement mainMenu= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(mainMenu).perform();
		
		// 3. Sub-menu
		WebElement subMenu= driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		action.moveToElement(subMenu).perform();
		
		// 4. Sub-Sub Menu
		WebElement subSubMenu= driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		subSubMenu.click();
		
	}

}
