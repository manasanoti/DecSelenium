package jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/qedgetable.html");
		driver.manage().window().maximize();
		
		//access specific row and column data in a table
		String tabletext=driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
		System.out.println(tabletext);
		
		//store complete table into webelement
		WebElement table=driver.findElement(By.name("qedgetech"));
		
		//get collection of rows in table which are under tr tag
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			//get collection of coloumns in td tag
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row no::"+i+"  "+"coloumn no::"+cols.size());
					
		}
		driver.close();
		
	}

}
