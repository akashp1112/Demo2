package demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerdriver=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		
		int links=footerdriver.findElements(By.tagName("a")).size();
		
		System.out.println(links);
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table//tbody//tr//td[1]/ul"));
		
		int i=columndriver.findElements(By.tagName("a")).size();
		
		System.out.println(i);
		
		for(int j=1;j<i;j++) {
			columndriver.findElements(By.tagName("a")).get(j).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		
		Set<String> ids=driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator();
		String s="Apache JMeter - Apache JMeter™";
		
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
