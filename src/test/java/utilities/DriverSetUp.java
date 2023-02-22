package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverSetUp {
	
	public AndroidDriver<AndroidElement>driver;
	
	@BeforeSuite
	public void setDriver() throws MalformedURLException {
		//File f = new File("src/General-Store.apk"); // direct File  path
		
//		File f = new File("src");
//		File fs = new File(f,"General-Store.apk");
		
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("appium:udid", "emulator-5554");
	   // desiredCapabilities.setCapability("app", fs.getAbsolutePath());
	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\mobile_automation\\src\\General-Store.apk");
	   	    
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	   // AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    
	    
// list driver
	    driver = new AndroidDriver<AndroidElement>(remoteUrl , desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
		
	}
	

}
