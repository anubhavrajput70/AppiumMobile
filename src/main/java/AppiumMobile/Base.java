package AppiumMobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		//to avoid the hardcoding of values in the file
		File f=new File("src/main/java");
		File fs=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Medium");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("automationName", "UiAutomator2");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),cap);
		//androiduiautomator
		return driver;
	}

}
