package org.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Sel {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\hemad\\eclipse-workspace\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://x.com/i/flow/login?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='text']"));		
		email.sendKeys("hemathiraviyam168@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//div[@class='css-146c3p1 r-bcqeeo r-qvutc0 r-37j5jr r-q4m81j r-a023e6 r-rjixqe r-b88u0q r-1awozwy r-6koalj r-18u37iz r-16y2uox r-1777fci'])[3]")).click();
		Thread.sleep(2000);
		
				
		WebElement username = driver.findElement(By.xpath("//input[@name='text']"));
		username.sendKeys("HemaDivya353982");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='css-146c3p1 r-bcqeeo r-qvutc0 r-37j5jr r-q4m81j r-a023e6 r-rjixqe r-b88u0q r-1awozwy r-6koalj r-18u37iz r-16y2uox r-1777fci'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("Hemarvi@168");
	    Thread.sleep(4000);
	 
	    WebElement log = driver.findElement(By.xpath("//span[text()='Log in']"));
	    log.click();
	    Thread.sleep(5000);
	    
	    WebElement noti = driver.findElement(By.xpath("(//div[@class='css-175oi2r r-sdzlij r-dnmrzs r-1awozwy r-18u37iz r-1777fci r-xyw6el r-o7ynqc r-6416eg'])[3]"));
	    noti.click();
	    Thread.sleep(3000);
	    
	  //  JavascriptExecutor l = (JavascriptExecutor) driver;
	    //  l .executeScript("window.scrollBy(0,10000)");
	      // Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//span[text()='(Arvind $)']")).click();
	       Thread.sleep(4000);
	       
	       WebElement sc = driver.findElement(By.xpath("(//div[@class='css-175oi2r'])[15]"));
	       File ss = sc.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(ss, new File("screenshot.png"));
	       Thread.sleep(4000);
	       
	       JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("window.scrollBy(0,100)");
	       Thread.sleep(2000);
	       
	       WebElement reply = driver.findElement(By.xpath("(//button[@class='css-175oi2r r-1777fci r-bt1l66 r-bztko3 r-lrvibr r-1loqt21 r-1ny4l3l'])[2]"));
	       reply.click();
	       Thread.sleep(3000);
	       
	       
	  
	 
	    //   String imgPath = System.getProperty("user.dir");
	      // sendKeys(imgPath+"\\file\\screenshot.png")
	       
	       
	      driver.findElement(By.xpath( "//input[@type='file']/parent::div/parent::div")).click();
	      
	      Robot rb = new Robot();
	      rb.delay(2000);
	      StringSelection s = new StringSelection("C:\\Users\\hemad\\eclipse-workspace\\Selenium\\file\\screenshot.png");
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_V);
	      rb.delay(2000);
	      rb.keyRelease(KeyEvent.VK_CONTROL);
	      rb.keyRelease(KeyEvent.VK_V);
	      rb.keyPress(KeyEvent.VK_ENTER);
	      rb.keyRelease(KeyEvent.VK_ENTER);
	     
          Thread.sleep(4000);
          
    	  
	       driver.findElement(By.xpath("//span[text()='Reply']")).click();
	       
	       Thread.sleep(3000);
	       
	    driver.quit();
		
	    
	    
	    //ssh-dss AAAAB3NzaC1kc3MAAACBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAAAAFQCXYFCPFSMLzLKSuYKi64QL8Fgc9QAAAIEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoAAACBAKClt8GAj/ubwRytkFhTRxFF2DYFS2vgD/+pvgpISMSQ8yTP7nkGZsiVYyEXqoWK46a5Eq4nvACISR3/pLjuRmiPTbW9dv18Dz/k13mzHClmhvYpsxKgx8SsheCn+YKnZXhvDyNcoaETokmlMcMPdT8MNIloEelNGIjYUvlzpUoa DSA-1024

		
		
		

	}

}
