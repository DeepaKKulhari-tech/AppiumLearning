import java.awt.Dimension;
import java.awt.Rectangle;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.swing.Scrollable;

import org.openqa.selenium.By;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollActivity extends RealDevice{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"))");
	     
//		 HashMap<String, String> hm = new HashMap<String, String>();
//		 
//		 driver.executeScript("mobile: scroll", hm);
//		 hm.put("direction","down");
//		 hm.put("name", "Lists");
		 //driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));


		 

		
		System.out.println("Final");

	}

}
