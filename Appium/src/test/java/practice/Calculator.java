package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  
		  
		 DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Android Emulator");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "5.1.1");
		  dc.setCapability("UDID", "emulator-38c784c1");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.android.calculator2");
		  dc.setCapability("appActivity", ".Calculator");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("com.android.calculator2:id/digit7")).click();
		  Thread.sleep(1000);
		  
		  
		  driver.findElement(By.id("com.android.calculator2:id/digit7")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("com.android.calculator2:id/plus")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("com.android.calculator2:id/digit3")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("com.android.calculator2:id/equal")).click();
		  Thread.sleep(1000);
		  String result=driver.findElement(By.id("com.android.calculator2:id/equal")).getText();
		  Thread.sleep(1000);
		  System.out.println(result);
		  
		 

		 }

		}