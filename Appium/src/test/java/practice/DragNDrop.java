package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragNDrop {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Oppo");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "5.1.1");
		  dc.setCapability("UDID", "38c784c1");
		  //DC for Android 
		  dc.setCapability("appPackage", "io.appium.android.apis");
		  dc.setCapability("appActivity", ".ApiDemos");
		  
		// Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  WebElement views = driver.findElementByAccessibilityId("Views");
		  TapOnElement(views);
		  
		  WebElement DnD = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]"));
		  TapOnElement(DnD);
		  
		  WebElement src = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		  WebElement dest = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
		  
		  TouchAction ta = new TouchAction(driver);
		  ta.longPress(src).waitAction(2000).moveTo(dest).release().perform();
		  
	}

	private static void TapOnElement(WebElement element) 
	{
		TouchAction driver;
		driver.tap(1,element,500);
	
		
	}
}
		  
		  