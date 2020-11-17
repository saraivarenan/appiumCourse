package easy.PObject;

import easy.utils.Base;
import easy.utils.Pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static easy.utils.UIautomaortest.tempo;

public class AcessoLogin extends Base {

	By alertPermicao = By.id("com.android.packageinstaller:id/permission_allow_button");
	By campoEmail = By.xpath("//android.widget.EditText[@text='Digite o seu e-mail']");
	By campoSenha = By.xpath("//android.widget.EditText[@text='Digite sua senha']");
	By  buttonEntrar = By.xpath("//android.widget.TextView[@text='Entrar']");

	public void acessarApp()  {
			tempo(15);
			driver.findElement(alertPermicao).click();
			//Digitar email

		}
	public void digitarUsuarioSenha(){

		driver.findElement(campoEmail).sendKeys("reenann94@hotmail.com");
		//Digitar Senha
		driver.findElement(campoSenha).sendKeys("Re123456@");
		driver.findElement(buttonEntrar).click();

	}
	}
