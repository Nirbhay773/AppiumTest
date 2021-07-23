package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Apidemo {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  
		  
		  DesiredCapabilities dc = new DesiredCapabilities();
		  
		  dc.setCapability("deviceName", "Android Emulator");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "5.1.1");
		  dc.setCapability("UDID", "emulator-38c784c1");
		   
		  dc.setCapability("appPackage", "io.appium.android.apis");
		  dc.setCapability("appActivity", ".ApiDemos");
		  
		  
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElementByAccessibilityId("Views").click();
		  
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\'Controls']")).click();
		  
		  driver.findElementByAccessibilityId("2. Dark Theme").click();
		  
		  driver.findElementById("io.appium.android.apis:id/edit").sendKeys("SDET17");
		  
		  driver.findElementByAccessibilityId("Checkbox 1").click();
		  
		  driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
		  
		 

		 }

}
