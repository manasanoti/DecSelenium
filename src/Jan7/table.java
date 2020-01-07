package Jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/qedgetable.html");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.name("qedgetech"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=1;j<cols.size();j++)
			{

				//capture coloum text
				String celltext=cols.get(j).getText();
				System.out.print("\n"+celltext);
			}
			System.out.println();
			System.out.println("============");
		}
		driver.close();

	}

}
