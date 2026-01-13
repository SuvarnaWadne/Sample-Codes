package POM1TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import POM1.LogoutPage;
import POM1.HomePage;
import POM1.LoginPage;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver= new ChromeDriver();
		        
		        driver.get("https://www.demoqa.com/books");

		        // Creating object of HomePage
		        HomePage home = new HomePage(driver);

		        // Creating object of LoginPage
		        LoginPage login = new LoginPage(driver);

		        // Creating object of LogoutPage
		        LogoutPage dashboard = new LogoutPage(driver);

		        // Click on Login button
		        home.clickLogin();

		        // Enter username & password
		        login.enterUsername("---Your Username---");
		        login.enterPassword("---Your Password---");

		        // Click on login button
		        login.clickLogin();
		        Thread.sleep(3000);

		        // Capture the page heading and print on console
		        System.out.println("The page heading is --- " + dashboard.getHeading());

		        // Click on Logout button
		        dashboard.clickLogout();

		        // Close browser
		        driver.quit();
	}

}
