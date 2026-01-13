package DemoPackage3;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSceenshotAs {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demoqa.com");
				
				 // Locate the web element
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
				
				// capture screenshot with getScreenshotAs() of the WebElement class
		        File f = logo.getScreenshotAs(OutputType.FILE);
		        
		        FileUtils.copyFile(f, new File("D:\\SampleProjects\\DemoProject1\\wandrLogo.png"));
		        
		        driver.close();

	}

}
