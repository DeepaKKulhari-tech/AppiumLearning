import java.awt.Dimension;
import java.awt.Rectangle;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.swing.Scrollable;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollActivity extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"))");
	     
		
		
		System.out.println("Final");

	}

}
