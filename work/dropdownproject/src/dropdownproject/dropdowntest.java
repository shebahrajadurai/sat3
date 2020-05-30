package dropdownproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdowntest 
{
	
	 public static void main(String[] args) { 
			System.setProperty("webdriver.gecko.driver","/Users/shebahrajadurai/work/dropdownproject/geckodriver");
		    //String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		    WebDriver driver = new SafariDriver();
			driver.get("http://jsbin.com/osebed/2");

		//	Select drpCountry = new Select(driver.findElement(By.name("country")));
		//	drpCountry.selectByVisibleText("ANTARCTICA");

			//Selecting Items in a Multiple SELECT elements
		
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			fruits.selectByIndex(1);
	 }
	}
	
	
