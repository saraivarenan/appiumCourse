package appium.Mobile.course;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Execution_Easy extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		//primeiro passo - 1 tela
		tempo(8);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		
		//Digitar email 
		driver.findElementByXPath("//android.widget.EditText[@text='Digite o seu e-mail']").sendKeys("reenann94@hotmail.com");
		
		//Digitar Senha 
		driver.findElementByXPath("//android.widget.EditText[@text='Digite sua senha']").sendKeys("Re123456@");
		
		driver.findElementByXPath("//android.widget.TextView[@text='Entrar']").click();
		
		
	}

}
