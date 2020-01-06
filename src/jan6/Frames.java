package jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		//click on login
		driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
		Thread.sleep(5000);
		
		//get collection of frames
		List<WebElement>Oframes=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+Oframes.size());
		driver.switchTo().frame(0);
		
		//click on login in frame
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("manasanoti30796@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("M@nasa30");
		Thread.sleep(5000);
		
		//click on login
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button/span")).click();
		Thread.sleep(5000);
		
		//comeout from frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//click on close
		
		driver.findElement(By.partialLinkText("X")).click();
		Thread.sleep(5000);
		
		//click on Metro
		driver.findElement(By.linkText("Metro")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}