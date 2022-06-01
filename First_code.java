package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_code {
	
	WebDriver dr;
	public void invokeBrowser()
	{
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		String email = "zoho@gmail.com";
		String pwd = "Zoho@123";
		String pwd1 = "123@Zoho";
		
		dr.get("http://localhost:8080/ZohoLogin/home.jsp");
		dr.get("http://localhost:8080/ZohoLogin/sign_IN.jsp");
		//dr.findElement(By.linkText("Click Here to Sign_Up")).click();
		//Thread.sleep(200);
		//
		//entering the fields
		
		dr.findElement(By.name("uname")).sendKeys("ZohoTest");
		dr.findElement(By.name("uemail")).sendKeys(email);
		dr.findElement(By.name("upwd")).sendKeys(pwd);
		dr.findElement(By.id("password2")).sendKeys(pwd);
		dr.findElement(By.name("unumber")).sendKeys("8825759189");
		dr.findElement(By.name("dob")).sendKeys("09281999");
		dr.findElement(By.xpath("//input[@id='cb' and @type='checkbox']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@name='Signup' and @type='submit']")).click();
		dr.findElement(By.linkText("Click here to Sign_IN")).click();
		Thread.sleep(3000);
		dr.findElement(By.name("uname")).sendKeys("zoho@gmail.com");
		dr.findElement(By.name("upwd")).sendKeys(pwd);
		dr.findElement(By.xpath("//input[@type='checkbox']")).click();
		dr.findElement(By.name("login")).click();
		dr.findElement(By.linkText("Change Password")).click();
		dr.findElement(By.xpath("//input[@type='email' and @name='uemail']")).sendKeys("zoho@gmail.com");
		dr.findElement(By.xpath("//input[@type='Password' and @name='upwd']")).sendKeys(pwd1);
		//dr.findElement(By.xpath("//input[@type='submit' ]")).click();
		WebElement element = dr.findElement(By.xpath("//input[@type='submit' ]"));//Enter ID for the element. You can use Name, xpath, cssSelector whatever you like
		element.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		element.sendKeys(Keys.ENTER);
		dr.findElement(By.name("uname")).sendKeys("zoho@gmail.com");
		dr.findElement(By.name("upwd")).sendKeys(pwd1);
		dr.findElement(By.xpath("//input[@type='checkbox']")).click();
		dr.findElement(By.name("login")).click();
		dr.findElement(By.xpath("//input[@type='submit' and @name='profile']")).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText("Back to Home Page")).click();
		Thread.sleep(3000);
		dr.findElement(By.linkText("Sign out")).click();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

public static void main(String[]args) {
	
	First_code obj = new First_code();
	obj.invokeBrowser();
	
}

}