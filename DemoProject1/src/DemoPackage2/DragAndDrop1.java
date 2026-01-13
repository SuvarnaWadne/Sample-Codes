package DemoPackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class DragAndDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		// 1. Action Class
		Actions action=new Actions(driver);
		WebElement from= driver.findElement(By.id("draggable"));
		WebElement to= driver.findElement(By.id("droppable"));
		
		// 2. Perform drag and drop
		
		//action.dragAndDrop(from, to).perform();
	    
		// 3. Perform Drag and Drop using Offset
		// Getting x and y offset to drop source object on target object location
		int xOffset1 = from.getLocation().getX();
		int yOffset1 =  from.getLocation().getY();
		
		//Secondly, get x and y offset for to object
		int xOffset = to.getLocation().getX();		
		int yOffset =  to.getLocation().getY();
		
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
		xOffset =(xOffset-xOffset1)+50;
		yOffset=(yOffset-yOffset1)+90;
		 action.dragAndDropBy(from, xOffset,yOffset).perform();
	
	}

}
