package practice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TouchscreenActivity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC
		dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "oppo");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "5.1.1");
		dc.setCapability("UDID", "38c784c1");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		

		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver=new AndroidDriver(url,dc);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Vertical Swipe
		driver.swipe(500, 377, 500, 1100, 500);

		//Horizontal Swipe
		driver.swipe(100, 400, 550, 400, 1000);

		//Inclined Swipe
		driver.swipe(100, 700, 400, 450, 1000);
		
		Dimension size= driver.manage().window().getSize();
		
		int ht = size.getHeight();
		
		int wd= size.getWidth();
		
		System.out.println("Height or length of Phone is ="+ht);
		
		System.out.println("Width of Phone is ="+wd);
		
		  //Vertical Swipe
		  driver.swipe( wd/2, (int) (ht*0.25), wd/2, (int) (ht*0.80), 1000);

		  // Horizontal swipe
		  driver.swipe((int)(wd*.20), ht/2, (int ) (wd*.80),ht/2, 1000);

	}
}



