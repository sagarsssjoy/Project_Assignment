package Intervue;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Intervue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.intervue.io");
		
		// Maximize the browser window
        Driver.manage().window().maximize();
		
		// Login button
        WebElement loginButton = Driver.findElement(By.xpath("//span[text()='Login'][1]"));
        loginButton.click();
     
  
   // Get all window handles
      Set<String> handles = Driver.getWindowHandles();
      ArrayList<String> tabs = new ArrayList<>(handles);
      Driver.switchTo().window(tabs.get(1));
      
        //Login button 1
        WebElement loginButton1 = Driver.findElement(By.className("AccessAccount-ColoredButton-Text"));
         loginButton1.click();
         
         // Login Page 
         //Email
         Driver.findElement(By.id("login_email")).sendKeys("neha@intervue.io");
         
         //Password
         Driver.findElement(By.id("login_password")).sendKeys("Ps@neha@123");
         
         //Login with Email Button
         Driver.findElement(By.xpath("//button[@type='submit']")).click();
         
         Thread.sleep(1000);
         
         //search field
      // Driver.findElement(By.className("search_placeholder")).click();
        Driver.findElement(By.xpath("//span[text()='Search by candidate name, profile etc.']")).click();
        //Driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[1]/div/div[2]/div[1]/span/div[1]/span")).click();
       
  
      Driver.findElement(By.xpath("//input[@placeholder=\"Type what you want to search for\"]")).sendKeys("Hello");
      //Driver.findElement(By.className("SearchBox__StyledInput-ctnsh0-4 cPizCf")).sendKeys("Hello");
       
      Driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div/div[2]/div/div")).click();
       //Driver.findElement(By.className("SearchThrough__PlaceholderText-sc-8f4vh4-0 fEvpzS")).click();
       
       //Logout
       Driver.findElement(By.className("ant-dropdown-link ProfileHeader__StyedDropdownHoverLink-sc-1gwp6c1-3 cwhrSp")).click();
       WebElement dropdown = Driver.findElement(By.className("ant-dropdown-link ProfileHeader__StyedDropdownHoverLink-sc-1gwp6c1-3 cwhrSp"));
       Select select = new Select(dropdown);

    // Select by visible text
    //select.selectByVisibleText("Logout");
    
 // Select by index (starts from 0)
    select.selectByIndex(4);
        
     // Close browser
       Driver.quit();

	}

}
