package easy.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class Base 
{
	

	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		AndroidDriver<AndroidElement>  driver;
    		// TODO Auto-generated method stub
    	 File appDir = new File("src");
         File app = new File(appDir, "EasyShops.apk");
         DesiredCapabilities capabilities = new DesiredCapabilities();
         
         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android9");
         capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    	    return driver; 
    	}
public static void tempo(int tempo) {

	int tempoSegundos1= tempo;
	tempoSegundos1 = tempoSegundos1 * 1000;
	try {
		Thread.sleep(tempoSegundos1);	
	} catch (InterruptedException e) {
		e.printStackTrace();
	}		
}
	
}

