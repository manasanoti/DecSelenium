package dec20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Data_Types {
public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","‪‪‪D:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://flipkart.com");
		driver.close();
		
		
	}
	

}
