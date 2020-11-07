package easy.PObject;

import easy.utils.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;

import java.net.MalformedURLException;

public class AcessoLogin extends Base {
	AndroidDriver<AndroidElement> driver = capabilities();

	public AcessoLogin() throws MalformedURLException {
	}

	@Test
	public void acessarApp()  {

		tempo(15);

		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		//Digitar email 

	}
	public void digitarUsuarioSenha(){

		driver.findElementByXPath("//android.widget.EditText[@text='Digite o seu e-mail']").sendKeys("reenann94@hotmail.com");
		//Digitar Senha 
		driver.findElementByXPath("//android.widget.EditText[@text='Digite sua senha']").sendKeys("Re123456@");
		driver.findElementByXPath("//android.widget.TextView[@text='Entrar']").click();
			
	}

}
