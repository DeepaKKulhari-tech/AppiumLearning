import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AxisappExample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		File f=new File("src");
		File fs=new File(f,"axis360_QA_4.1.0.49.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"DKPixel");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//Package and Activity Pages needs to mention extra when apps are download directly to your
		//android emulator.
		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");

		AndroidDriver driver=new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		System.out.println("Success");
	 
	}

}
