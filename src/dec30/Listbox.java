package dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//store month listbox into select class
		Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
		
		//store year listbox into select class
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		
		//store day listbox into select class
		Select daylistbox=new Select(driver.findElement(By.id("day")));
		
		boolean value1=monthlistbox.isMultiple();
		System.out.println(value1);
		boolean value2=yearlistbox.isMultiple();
		System.out.println(value2);
		boolean value3=daylistbox.isMultiple();
		System.out.println(value3);
		
		//select item from month listbox
		monthlistbox.selectByVisibleText("Feb");
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		//select item from year listbox
		yearlistbox.selectByVisibleText("1995");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		
		//select item from day listbox
		daylistbox.selectByVisibleText("8");
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		//monthlistbox.selectByValue("Mar");
		yearlistbox.selectByValue("1996");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		monthlistbox.selectByIndex(10);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		yearlistbox.selectByIndex(40);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		daylistbox.selectByIndex(20);
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.close();
		
				

	}

}
