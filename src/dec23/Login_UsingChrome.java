package dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_UsingChrome {

	public static void main(String[] args) throws Throwable {
		
	//creating instance object
		WebDriver driver=new ChromeDriver();
		
	//Launch url in browser
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		
	//Enter username and password
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
	//suspend from executing for 5 seconds
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}
