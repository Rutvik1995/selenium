package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test_webapp {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mdbootstrap.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("navbar-static-login")).click();
		
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("abc12@gmail.com");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("rutvik");
        driver.findElement(By.cssSelector("#password")).sendKeys("sacstate500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/button")).click();
        	
       
        String msg=driver.findElement(By.xpath("//*[@id=\"login\"]/p")).getText();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
        
        
        System.out.println("Done");
        if(msg.matches("Wrong username or password."))
        {
        	 Thread.sleep(500);
        	 driver.findElement(By.linkText("Register")).click();
        	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
        	 driver.findElement(By.id("signonname")).sendKeys("Testing case");
			 driver.findElement(By.id("signonusername")).sendKeys("testa_b_c");
			 driver.findElement(By.id("email")).sendKeys("testa_b_c@gmail.com");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@id=\'signonpassword\']")).sendKeys("SelTest1234");
			 driver.findElement(By.id("password2")).sendKeys("SelTest1234");
			 driver.findElement(By.xpath("//*[@id=\'AJAXAuthRegisterBtn\']")).click();
	
		
        }
		
        System.out.println("After If");
		
		
		
		
		//Testing The Profile of the user
		
		driver.findElement(By.id("navbar-account")).click();
		driver.findElement(By.id("navbar-static-profile")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)");
		
		
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/a")).click();
        Thread.sleep(5000);
        
        
        
      
       // Testing on checkbox
 
         
       System.out.println("hhh");
        driver.findElement(By.id("mdb_main_search")).sendKeys("forms");
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
       
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/form/div[2]/ul/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"introduction\"]/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        System.out.println("Before ");
        WebElement element=  driver.findElement(By.id("defaultUnchecked"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        System.out.println("After ");
        
        
        
        
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/a")).click();
        Thread.sleep(5000);
        
        
        
      
       
       // Testing the radio button
         
       System.out.println("hhh");
        driver.findElement(By.id("mdb_main_search")).sendKeys("radio");
        driver.manage().timeouts().implicitlyWait(850, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/form/div[2]/ul/li/a")).click();
        driver.manage().timeouts().implicitlyWait(750, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,1700)");
        driver.manage().timeouts().implicitlyWait(750, TimeUnit.SECONDS);
      
        System.out.println("Before ");
        driver.manage().timeouts().implicitlyWait(750, TimeUnit.SECONDS);Thread.sleep(4000);
        
        System.out.println("Sfter scroll");
       
        WebElement element2=  driver.findElement(By.id("defaultGroupExample1"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(element2).click().perform();
      
        System.out.println("After ");
        
        
        
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/a")).click();
        Thread.sleep(5000);
        
        
        
      
       // Testing on Dropdown
 
         
       System.out.println("hhh");
        driver.findElement(By.id("mdb_main_search")).sendKeys("dropdown");
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
      
        driver.findElement(By.xpath("//*[@id=\"slide-out\"]/ul/li[2]/form/div[2]/ul/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(750, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,1000)");
       
        driver.findElement(By.xpath("//*[@id=\"example\"]/section[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(750, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"example\"]/section[1]/div/div[1]/a[2]")).click();
        
        
        
        
        
        
        
        
        
        driver.findElement(By.id("navbar-account")).click();
		driver.findElement(By.id("navbar-static-profile")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        
        driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[2]/div[1]/button")).click();
        
       
         
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
          driver.findElement(By.id("project_name")).sendKeys("CSC 234 Testing ");
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
          driver.findElement(By.id("project_url")).sendKeys("https://github.com/");
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
          driver.findElement(By.id("project_image")).sendKeys("https://mindmajix.com/blogs/images/top-20-hybrid-mobile-app-frameworks.png");
          System.out.println("In sysytem");
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
          driver.findElement(By.id("project_description")).sendKeys("This is repository is just for practice and learning java base test selenium web browser automation test tool  ");
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//*[@id=\"submit-project\"]")).click();
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        
	}

}

