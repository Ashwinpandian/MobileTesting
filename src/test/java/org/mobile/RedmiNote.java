package org.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class RedmiNote {
	
	public static AndroidDriver driver ;
	@Test
	public void redmi() throws MalformedURLException {
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ashwe\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();
        
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        
		UiAutomator2Options options=new UiAutomator2Options();
		options.setCapability("platformName","Android");
		options.setCapability("platformVersion","10");
		//adb devices 
		options.setCapability("udid","c7326a7c");
		options.setCapability("deviceName","ash");				
		//adb shell pm list packages
		options.setCapability("appPackage","com.ubercab");
		// adb shell
		//dumpsys window displays | grep -E mCurrentFocus
		options.setCapability("appActivity","com.ubercab.presidio.app.core.root.RootActivity");
		options.setCapability("automationName", "UiAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
     
		driver = new AndroidDriver(url,options);
		System.out.println("");
		System.out.println("");
        
		service.stop();
		
	

	}
		
		
	

}
