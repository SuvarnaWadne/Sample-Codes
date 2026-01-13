package DemoPackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/slider/");
		driver.manage().window().maximize();
		
		// 1. Action Class
		Actions action=new Actions(driver);
		
		WebElement slider= driver.findElement(By.xpath("//input[@type='range']"));
		
		//Move mouse to x offset 50 i.e. in horizontal direction
		action.moveToElement(slider,50,0).perform();
    	slider.click();
	}

}
