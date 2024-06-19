package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Select dd=new Select(driver.findElement(By.id("dropdown-class-example")));
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByValue("option3");
		Thread.sleep(2000);
		dd.selectByVisibleText("Option1");
	}

}
