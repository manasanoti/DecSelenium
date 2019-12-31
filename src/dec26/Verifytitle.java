package dec26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String Exptitle="gmail";
		
		//get acttitle
		 String actitle=driver.getTitle();
		 
		 //verify actitle equals with exptitle
		 if (actitle.equalsIgnoreCase(Exptitle)) {
			 System.out.println("Title is Matching::"+actitle+"    "+Exptitle);
			
		}
		 else {
			System.out.println("Title is not Matching::"+actitle+"    "+Exptitle);
		}
		 Thread.sleep(5000);

	}

}
