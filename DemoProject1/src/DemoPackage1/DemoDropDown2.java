package DemoPackage1;
import 	org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;

	/*  Simple-Select
	  	1. Launch the browser.
		2. Open "https://demoqa.com/select-menu".
		3. Select the Old Style Select Menu using the element id.
		4. Print all the options of the dropdown.
		5. Select 'Purple' using the index.
		6. After that, select 'Magenta' using visible text.
		7. Select an option using value.
		8. Close the browser */ 

public class DemoDropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch the browser.
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     
     //2. Open "https://demoqa.com/select-menu"
     driver.get("https://demoqa.com/select-menu");
     driver.manage().window().maximize();
     
     //3. Select the Old Style Select Menu using the element id.
     Select select= new Select(driver.findElement(By.id("oldSelectMenu")));
     
     //4. Print all the options of the dropdown.
     		//a. Get list of web elements
          		List<WebElement> lst=select.getOptions();
     		
          	//b. Looping through the options and printing dropdown options
          		System.out.println("The dropdown options are:");
          		for(WebElement options: lst)
          			System.out.println(options.getText());
     
     //5. Selecting the option as 'Purple'-- selectByIndex
             //  System.out.println("Select the Option by Index 4");
              //  select.selectByIndex(4);
              //  System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

    //6. Selecting the option as 'Magenta'-- selectByVisibleText
                //System.out.println("Select the Option by Text Magenta");
                //select.selectByVisibleText("Magenta");
               // System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

    //7. Selecting an option by its value
                //System.out.println("Select the Option by value 6");
               // select.selectByValue("6");
               // System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

               // driver.quit();
     
     
	}

}
