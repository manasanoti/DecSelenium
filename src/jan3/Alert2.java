package jan3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///F:/promp.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on me button
		driver.findElement(By.xpath("//button[contains(text(),'Click on me')]")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		
		//get alert message
		String alertmessage=alert.getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
		
		//send username into alert textbox
		alert.sendKeys("manasa");
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		
		//get alert text in webpage
		String message=driver.findElement(By.id(alertmessage)).getText();
		System.out.println(message);
		Thread.sleep(5000);
		driver.close();
		
		
		
		 
		
	}

}
