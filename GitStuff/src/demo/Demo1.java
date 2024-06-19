package demo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		
		System.out.println("links present in footer :" +footerdriver.findElements(By.tagName("a")).size());
		
		
		WebElement coldriver=footerdriver.findElement(By.xpath("(//table//tr//td//ul)[4]"));
		int l=coldriver.findElements(By.tagName("a")).size();
		System.out.println(l);
		
		for(int i=1;i<l;i++) {
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}
		
	
		Set<String> allwindow=driver.getWindowHandles();
		Iterator<String> it=allwindow.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
