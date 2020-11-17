package easy.PObject;

import easy.utils.Base;
import easy.utils.Pages;
import easy.utils.UIautomaortest;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class PaginaInicial extends Base {
	UIautomaortest aux = new UIautomaortest();
 By campoBusca = By.xpath("//android.widget.EditText[@text='Pesquise seu shopping ou loja']");
 By btnProcurar = By.className("android.widget.TextView");

	//AndroidDriver<AndroidElement> driver = capabilities();

	public void fazerBuscaLoja() {
		aux.tempo(10);
		driver.findElement(campoBusca).click();
		driver.findElement(campoBusca).sendKeys("Americanas");
aux.tempo(2);
		driver.findElements(btnProcurar).get(1).click();
		aux.tempo(5);

	}
}
