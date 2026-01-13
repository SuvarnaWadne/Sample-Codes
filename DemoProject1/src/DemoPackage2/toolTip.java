package DemoPackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class toolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement ageField = driver.findElement(By.id("age"));

		// Hover over the element
		actions.moveToElement(ageField).perform();

		// Locate the tooltip element (custom div)
		WebElement tooltip = driver.findElement(By.cssSelector(".ui-tooltip-content"));
		System.out.println("Tooltip text: " + tooltip.getText());

}
}
