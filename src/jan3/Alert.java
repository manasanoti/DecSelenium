package jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on login button with out filling login details
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		
		//get alert message
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
		
		//conform alert message
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//enter invalid password
		driver.findElement(By.id("email")).sendKeys("manasa.noti@facebook.com");
		driver.findElement(By.id("pass")).sendKeys("admin1");
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();

		

	}

}
