package test_mobile;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestDialerApp {
	@Test
	public void test_Dilr() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("appium:udid", "emulator-5554");
	    desiredCapabilities.setCapability("appium:appPackage", "com.android.dialer");
	    desiredCapabilities.setCapability("appium:appActivity", "com.android.dialer.main.impl.MainActivity");
		
	    
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	   // AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    
	    
	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(remoteUrl , desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("key pad");
//	    el1.click();
//	    MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"0\"]/android.widget.LinearLayout/android.widget.TextView");
//	    el2.click();
//	    MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"1,\"]/android.widget.LinearLayout/android.widget.TextView");
//	    el3.click();
//	    MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"3,DEF\"]/android.widget.LinearLayout/android.widget.TextView");
//	    el4.click();
//	    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("backspace");
//	    el5.click();
//	    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("dial");
//	    el6.click();
//	   
	    
	    driver.findElement(By.id("com.android.dialer:id/fab")).click();
	    
	    List<AndroidElement> keypad = driver.findElements(By.id("com.android.dialer:id/dialpad_key_number"));
	    keypad.get(10).click();
	    System.out.println(keypad.get(10).getText());
	    keypad.get(0).click();
	    keypad.get(2).click();
	    assertEquals(driver.findElement(By.id("com.android.dialer:id/digits")),"013");
	    
	    
	}
	
	@Test
	public void test_general_apk() throws MalformedURLException {
		//File f = new File("src/General-Store.apk");
		
		File f = new File("src");
		File fs = new File(f,"General-Store.apk");
		
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("appium:udid", "emulator-5554");
	    desiredCapabilities.setCapability("app", fs.getAbsolutePath());
	   	    
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	    AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}

}
