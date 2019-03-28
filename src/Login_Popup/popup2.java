package Login_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/jquery/modals/forms/");
        
        
        Thread.sleep(5000);
        
       // driver.switchTo().alert().dismiss();
       // Thread.sleep(7000);
       // driver.findElement(By.xpath("//*[@id=\"previewModal\"]/div/div/div[3]/a")).click();
       // Thread.sleep(5000);
      //*[@id="previewModal"]/div/div/div[1]/button
        
       // driver.findElement(By.xpath("")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("navbar-static-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("abc12@gmail.com");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("rutvik");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sacstate500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/button")).click();
        	
        Thread.sleep(7000);
        driver.findElement(By.id("navbar-account")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("navbar-static-profile")).click();
        Thread.sleep(9000);
        System.out.println("In excecutiomn");
        driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[2]/div[1]/button")).click();
      
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"submit-project\"]")).click();
       
	}

}
