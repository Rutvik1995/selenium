package dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFaceBookDropDown 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();
        
        WebElement month_dropdown=driver.findElement(By.id("month"));
        Select month_dd = new Select(month_dropdown);
        WebElement selectedValue = month_dd.getFirstSelectedOption();
        System.out.println("After Selection selected values is "+selectedValue.getText());
        
        
        
        
        month_dd.selectByIndex(4);
        //System.out.println("After Selection selected values is "+selectedValue2.getText());
        Thread.sleep(3000);
        month_dd.selectByValue("10");
        //System.out.println("After Selection selected values is "+selectedValue2.getText());
        Thread.sleep(3000);
        month_dd.selectByVisibleText("Jan");
        //System.out.println("After Selection selected values is "+selectedValue2.getText());
        
       

	}

}
