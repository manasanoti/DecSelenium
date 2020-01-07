package Jan7;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class table4 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://content.icicidirect.com");
driver.manage().window().maximize();	
driver.findElement(By.xpath("//*[@id='liMarket']/a")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='LiMarketStats']/a")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='hrfDSP']")).click();
Thread.sleep(4000);

//get collection alphabets
List<WebElement> alphabets = driver.findElement(By.id("dvNseBseRndr"))
 .findElements(By.tagName("a"));
for (int a = 0; a < alphabets.size(); a++) {
	
	//get every alphabets id value
WebElement ele = alphabets.get(a);
String linkLetter = (String) ele.getAttribute("id");

 System.out.println(linkLetter); //-- printing all link id's
if (!linkLetter.equals("")) {
driver.findElement(By.id(linkLetter)).click();
}
Thread.sleep(5000);

// store table into WebElement
WebElement table = driver.findElement(By.id("gridSource"));

// get rows collection using List<WebElement>
List<WebElement> rows = table.findElements(By.tagName("tr"));
System.out.println("toral rows are... " + rows.size());

// iterating rows
for (WebElement eachrow : rows) {
	
// get columns collection using List<WebElement>
List<WebElement> cols = eachrow.findElements(By.tagName("td"));

// iterate columns to fetch 'each cell' value

for (WebElement eachcell : cols) {
if (eachcell.getText().isEmpty()) {
	
// click on 'next' link in table footer
driver.findElement(By.xpath("//*[@class='table-page:next']")).click();
}
System.out.print("\t" + eachcell.getText());
}
System.out.println();
System.out.println("---------------------------------------------------------------------------------------------------");
}
Thread.sleep(6000);
}
driver.quit();
}
}
