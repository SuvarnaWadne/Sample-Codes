package DemoPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBrowserCommands1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup(); // For ChromeDriver
		    WebDriver driver = new ChromeDriver();    // Create WebDriver instance for Chrome
		   //WebDriverManager.firefoxdriver().setup(); // For Firefox 
	       //WebDriver driver = new FirefoxDriver();   // Create WebDriver instance for FF
		     //WebDriverManager.iedriver().setup();    // For Internet Explorer
			 //WebDriver driver = new InternetExplorerDriver(); // Create WebDriver instance for IE
	        
		    // Open Browser
		    driver.get("https://dev.wandrstar.com/");
	        driver.manage().window().maximize();
	        
	        //Get Title 
	        String Title= driver.getTitle();
	        System.out.println("The title is:"+ Title);
	        int titlelength= driver.getTitle().length();
	        System.out.println("Title Length is:"+ titlelength);
	        
	       
	        //Get current URL
	        String url= driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ url);
	        
	        //Get Source Code
	       // String sourceCode= driver.getPageSource();
	       // System.out.println("Source Code:"+ sourceCode);
	        
	        // Close all Browsers
	        driver.quit();
	}

}
