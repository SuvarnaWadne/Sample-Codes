package DemoPackage1;
import 	org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.By;

	/* 	Multi-Select 
	  	1. Launch the browser. 
		2. Open "https://demoqa.com/select-menu".
		3. Select the Standard Multi-Select using the element id.
		4. Verifying that the element is multi-select.
		5. Select 'Opel' using the index and deselect the same using index.
		6. Select 'Saab' using value and deselect the same using value.
		7. Deselect all the options.
		8. Close the browser. */


public class DemoDropDown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        //3. Selecting the multi-select element by locating its id
        Select select = new Select(driver.findElement(By.id("cars")));

        //Get the list of all the options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();

        for(WebElement option: options)
            System.out.println(option.getText());

        //4. Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else eit
        if(select.isMultiple()){

            //5. Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);

            //6. Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");

            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();

            for(WebElement selectedOption: selectedOptions)
                System.out.println(selectedOption.getText());


            //7. Deselect the value "Audi" by Index
            System.out.println("DeSelect option Audi by Index");
            select.deselectByIndex(3);

            //Deselect the value "Opel" by visible text
            System.out.println("Select option Opel by Text");
            select.deselectByVisibleText("Opel");

            //Validate that both the values are deselected
            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
                System.out.println(selectedOptionAfterDeselect.getText());

            //8. Deselect all values
            select.deselectAll();
        }

        driver.quit();
	}

}
