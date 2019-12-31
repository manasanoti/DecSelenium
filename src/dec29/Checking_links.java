package dec29;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_links {

	public static void main(String[] args) throws Throwable {
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("http://facebook.com/");
	 driver.manage().window().maximize();
	 
	 //get collections of links in page which are stored under htmal tag a
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("no of linksare::"+links.size());
	Thread.sleep(5000);
	for(int i=0;i<links.size();i++)
	{
		//get each link text
		String linkname=links.get(i).getText();
		
		//get each link url
		String linkurl=links.get(i).getAttribute("href");
		System.out.println(linkname+"\n"+linkurl);
	}
	Thread.sleep(5000);
	driver.close();
		
		

	}

}
