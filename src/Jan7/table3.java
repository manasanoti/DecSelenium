package Jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Markets")).click();
		driver.findElement(By.linkText("Market Stats")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Daily Share Pric")).click();
		WebElement table=driver.findElement(By.id("gridSource"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		
		for(WebElement each:rows)
		{
			List<WebElement>cols=each.findElements(By.tagName("td"));
			for(WebElement eachcell:cols)
			{
				if(eachcell.getText().isEmpty())
				{
					
					//click on next in footer
					driver.findElement(By.xpath("//a[@id='alphabetA']")).click();
				}
				System.out.print("\n"+eachcell.getText());
			}
			System.out.println();
			System.out.println("=====================================");
		}
		driver.close();

	}

}
