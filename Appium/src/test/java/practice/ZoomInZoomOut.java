package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInZoomOut {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  
		  
		  DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Oppo");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "5.1.1");
		  dc.setCapability("UDID", "38c784c1");
		  
		  //DC for Android 
		  dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		  dc.setCapability("appActivity", ".MainActivity");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		  
		  WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		  
		  driver.zoom(img);
		  Thread.sleep(3000);
		  
		  driver.pinch(img);
	}
}
		  
		  