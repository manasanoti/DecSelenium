package Jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.name("datatable"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=1;j<cols.size();j++)
			{
				String celltext=cols.get(j).getText();
				System.out.print("\n"+celltext);
			}
			System.out.println();
			System.out.println("================================================");
		}
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
