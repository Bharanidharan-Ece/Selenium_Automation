package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonlogin {
	WebDriver dr;
	public static void main(String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	dr.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	dr.manage().window().maximize();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("8825759189");
	dr.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	dr.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("289289289");
	dr.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	dr.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("OnePlus");
	dr.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	dr.get("https://www.amazon.com/OnePlus-Glacial-Unlocked-Android-Smartphone/dp/B08723759H/ref=sr_1_3?crid=11ON11UNNZ89G&keywords=OnePlus&qid=1653117997&sprefix=oneplus%2Caps%2C552&sr=8-3&th=1");
	dr.findElement(By.xpath("//input[@id=\"add-to-wishlist-button-submit\"]")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//*[text()=\"View Your List\"]")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//a [@onclick=\"$Nav.getNow('signInRedirect')('nav_em_hd_re_signin', '/gp/flex/sign-out.html?action=sign-out&path=%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin&signIn=1&useRedirectOnSuccess=1&ref_=nav_em_signout_0_1_1_39', 'nav_em_hd_clc_signin_0_1_1_39')\"]")).click();
	

	}
}