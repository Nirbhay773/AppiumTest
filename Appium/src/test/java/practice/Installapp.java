package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Installapp {
	
	public static void main(String[] args) throws MalformedURLException {
		  
		  
		  DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Oppo");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "5.1.1");
		  dc.setCapability("UDID", "38c784c1");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.androidsample.generalstore");
		  dc.setCapability("appActivity", ".SplashActivity");
		  
		  //installing the Generalstore App
		  dc.setCapability("app", "C:\\Users\\LENOVO\\Desktop\\Appium app\\General-Store.apk");
		  
		  
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
		  
		 

		 }

}
