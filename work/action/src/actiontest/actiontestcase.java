package actiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.Alert;

public class actiontestcase{
	
public static  void main(String arg[]) throws InterruptedException
{

	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","/Users/shebahrajadurai/work/action/geckodriver");
	 driver= new FirefoxDriver();

    //Launch the Application Under Test (AUT)
     driver.get("http://demo.guru99.com/test/simple_context_menu.html");
     driver.manage().window().maximize();

//Double click the button to launch an alertbox "//button[text()='Double-Click Me To See Alert']//parent::div"
     //"//button[text()='Double-Click Me To See Alert']"
     System.out.println("window maximized");
     
    

	
Actions action = new Actions(driver);
WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

//Switch to the alert box and click on OK button

   Thread.sleep(500);
   action.doubleClick(link).perform();
   System.out.println("Double clicked");
     
Alert alert = driver.switchTo().alert();
System.out.println("Alert Text" +alert.getText());

alert.accept();
System.out.println("Allert accepted");

Assert.assertEquals("You double clicked me.. Thank You..", alert.getText());
//Closing the driver instance
driver.quit();;
     

}
}