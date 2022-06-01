package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gmail_automation {
	
	public static void main(String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.setExperimentalOption("debuggerAddress", "localhost:9222");
	WebDriver dr =new ChromeDriver(op);
	dr.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
	Thread.sleep(5000);
	dr.findElement(By.xpath("//*[text()=\"Compose\"]")).click();
	dr.findElement(By.xpath("//textarea[@name='to']")).sendKeys("puresocialconnect@zohomail.in");
	dr.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Automation Gmail using Selenium");
	dr.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("This mail is for Testing Purpose using Selenium");
	dr.findElement(By.xpath("//div[@class=\"a1 aaA aMZ\"]")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("E:\\AutoIT\\Upload_file.exe");
	Thread.sleep(5000);
	dr.findElement(By.xpath("//*[text()='Send']")).click();
	

}
}