package easy.utils;

import easy.PObject.AcessoLogin;
import easy.PObject.FazerBuscar;
import easy.PObject.PaginaInicial;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Pages {
    public static AndroidDriver driver;

public  void criarDriver() throws MalformedURLException {
    File appDir = new File("src");
    File app = new File(appDir, "EasyShops.apk");
    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android9");
    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

}
    public void teardown(){
        //close the app
        driver.quit();
    }
}
