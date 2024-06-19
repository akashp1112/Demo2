package demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			
			verifylink(url);
		}

	}

	private static void verifylink(String url) {
				
		try {
			URL link=new URL(url);
			
			HttpURLConnection httpurlConnection=(HttpURLConnection) link.openConnection();
			
			httpurlConnection.setConnectTimeout(3000);
			httpurlConnection.connect();
			
			
			if(httpurlConnection.getResponseCode() == 200) {
				System.out.println(url+ "-"+ httpurlConnection.getResponseMessage());
				
				
			}
			else {
				System.out.println(url+ "-"+ httpurlConnection.getResponseMessage()+" is broken link");
			}
			}
		
		catch (Exception e) {
				System.out.println(url + " - " + "is a broken link");
				}
			
		}
		
	}


