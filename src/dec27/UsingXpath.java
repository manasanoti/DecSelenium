package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin1");
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().contains("dash")) {
			System.out.println("Login success");
			
		}
		else {
			
			//get error message
			String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(message+"  "+"Login Fail");
		}
		Thread.sleep(5000);
		driver.close();

	}

}
