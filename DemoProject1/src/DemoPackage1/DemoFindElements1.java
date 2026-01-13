package DemoPackage1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoFindElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> list1= driver.findElements(By.tagName("input"));
		   if(list1.size()!= 0) 
		   {
			   System.out.println(list1.size() + " Elements found by TagName as input \n");
				
			   for(WebElement inputElement : list1) 
			   {
				   System.out.println(inputElement.getAttribute("placeholder"));
			   }
		
		   }
	}
}
