package test_mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.DriverSetUp;

public class GeneralStoreApk extends DriverSetUp{
	@Test
	public void test_general_apk() throws MalformedURLException {
		//File f = new File("src/General-Store.apk"); // direct File  path
		
//		File f = new File("src");
//		File fs = new File(f,"General-Store.apk");
		
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//	    desiredCapabilities.setCapability("platformName", "android");
//	    desiredCapabilities.setCapability("appium:udid", "emulator-5554");
//	   // desiredCapabilities.setCapability("app", fs.getAbsolutePath());
//	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\mobile_automation\\src\\General-Store.apk");
//	   	    
//	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//	    AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
//	    
	    
// list driver
	 // AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(remoteUrl , desiredCapabilities);
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AndroidElement countrylist = driver.findElement(By.id("spinnerCountry"));
				
	    countrylist.click();
	    AndroidElement specificcountry = driver.findElement(By.xpath("//android.widget.TextView[@text='Angola']"));
	    specificcountry.click();
	    AndroidElement namefiled = driver.findElement(By.id("nameField"));
	    namefiled.sendKeys("Tanmoy Datta");
	    AndroidElement Fgender = driver.findElement(By.id("radioFemale"));
	    Fgender.click();
	    AndroidElement Mgender = driver.findElement(By.id("radioMale"));
	    Mgender.click();
	    AndroidElement loginBtn = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
	    loginBtn.click(); 
	    
	    
//	    MobileElement el1 = (MobileElement) driver.findElementById("android:id/text1");
//	    el1.click();
//	    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]");
//	    el2.click();
//	    MobileElement el3 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/nameField");
//	    el3.sendKeys("Tanmoy Datta");
//	    MobileElement el4 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/radioFemale");
//	    el4.click();
//	    MobileElement el5 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/radioMale");
//	    el5.click();
//	    MobileElement el6 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");
//	    el6.click();
//	    MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]");
//	    el7.click();
//	    MobileElement el8 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart");
//	    el8.click();
//	    MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.CheckBox");
//	    el11.click();
//	    MobileElement el12 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/btnProceed");
//	    el12.click();
	}
}
