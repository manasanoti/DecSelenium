package dec26;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		String strprotocol="https://";
		String stractprotocol=driver.getCurrentUrl();
		if (stractprotocol.startsWith(strprotocol)) {
			System.out.println("Url is secured::"+stractprotocol+"    "+strprotocol);
			
			
		}
		else {
			System.out.println("Url is unsecured::"+stractprotocol+"   "+strprotocol);
		}
		

	}

}
