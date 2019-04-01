package Login_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popup2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/jquery/modals/forms/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        Thread.sleep(2000);
        
        System.out.println("inn");
       // driver.switchTo().alert().dismiss();
       // Thread.sleep(7000);
       // driver.findElement(By.xpath("//*[@id=\"previewModal\"]/div/div/div[3]/a")).click();
       // Thread.sleep(5000);
      //*[@id="previewModal"]/div/div/div[1]/button
        
       // driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("navbar-static-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("abc12@gmail.com");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("rutvik");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sacstate500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/button")).click();
        	
        Thread.sleep(5000);
        driver.findElement(By.id("navbar-account")).click();
        Thread.sleep(6100);
        driver.findElement(By.id("navbar-static-profile")).click();
        Thread.sleep(5000);
//        System.out.println("In excecutiomn");
        driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[2]/div[1]/button")).click();
      
      //*[@id="profile"]/div/div[2]/div[1]/button
        
      //*[@id="profile"]/div/div[2]/div[1]/button
       
        Thread.sleep(5000);
        driver.findElement(By.id("project_name")).sendKeys("CSC 234 Testing ");
        Thread.sleep(5000);
        driver.findElement(By.id("project_url")).sendKeys("https://github.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("project_image")).sendKeys("https://mindmajix.com/blogs/images/top-20-hybrid-mobile-app-frameworks.png");
        System.out.println("In sysytem");
        Thread.sleep(5000);
        driver.findElement(By.id("project_description")).sendKeys("This is repository is just for practice and learning java base test selenium web browser automation test tool  ");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"submit-project\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/a")).click();
        Thread.sleep(5000);
        
        
        
      
       
       // Thread.sleep(3000);
         
       System.out.println("hhh");
        driver.findElement(By.id("mdb_main_search")).sendKeys("forms");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/form/div[2]/ul/li[1]/a")).click();
        Thread.sleep(9000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"introduction\"]/ul/li[2]/a")).click();
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(4000);
        System.out.println("Before ");
        WebElement element=  driver.findElement(By.id("defaultUnchecked"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        System.out.println("After ");
       
        
        
       // driver.findElement(By.xpath("//*[@id=\"menu-item-59025\"]/a")).click();
        Thread.sleep(5000);
       // driver.findElement(By.id("link-menu-item-59026")).click();
       
       // Thread.sleep(3000);
        //driver.findElement(By.id("link-menu-item-59026")).click();
        
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/a")).click();
        Thread.sleep(5000);
        
        
        
      
       
       // Thread.sleep(3000);
         
       System.out.println("hhh");
        driver.findElement(By.id("mdb_main_search")).sendKeys("radio");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/form/div[2]/ul/li/a")).click();
        Thread.sleep(9000);
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(4000);
      
        System.out.println("Before ");
        
        Thread.sleep(4000);
        
        System.out.println("Sfter scroll");
       
        WebElement element2=  driver.findElement(By.id("defaultUnchecked"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(element2).click().perform();
      
        System.out.println("After ");
        
        
	}

}
