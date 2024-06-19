package demo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoIbibo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> radiobutton=driver.findElements(By.xpath("//div[@class='sc-12foipm-21 hoGsdQ']//ul//li//p"));
		
		for(WebElement i:radiobutton) {
			System.out.println(i.getText());
		}
		
		driver.findElement(By.xpath("//p[text()='Round-trip']")).click();
		
		driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']//div[2]")));
				
		
		driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']//div[2]//input")).sendKeys("pune");
		
		driver.findElement(By.xpath("//span[contains(text(),'Pune, India')]")).click();
		
	/*	List<WebElement> options=driver.findElements(By.xpath("//span[@class='autoCompleteSubTitle']"));
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("PNQ")) {
				
				option.click();
			}
		}*/
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("del");
		
		driver.findElement(By.xpath("//p[contains(text(),'Indira Gandhi International Airport')]")).click();
		
		
		List<WebElement> radio=driver.findElements(By.xpath("//div[@class='sc-12foipm-90 dwAjmT marginL10']//div[1]"));
		System.out.println(radio.size());
		
		for(WebElement o:radio) {
			System.out.println(o.getText());
			
			if(o.getText().equalsIgnoreCase("Senior Citizen")) {
				o.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
