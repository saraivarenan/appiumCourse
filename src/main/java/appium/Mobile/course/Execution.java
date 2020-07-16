package appium.Mobile.course;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Execution extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		//primeiro passo - 1 tela
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		tempo(1);
		//segundo passo = 2 tela
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		tempo(1);
		//terceira passo - 3 tela
		driver.findElementById("android:id/checkbox").click();
		tempo(1);
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click()
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		tempo(1);
		//Quarto passo - Janela Aberta para edição
		driver.findElementByXPath("//android.widget.EditText").sendKeys("Hello World");
		driver.findElementsByClassName("android.widget.Button").get(2).click();
		//driver.findElementById("android:id/button1").click();
	;
		// xpath id classname androiduiautomator
		//XPATH = 
		//
		//
		//
	}

}
