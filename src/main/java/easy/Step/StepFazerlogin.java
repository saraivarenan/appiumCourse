package easy.Step;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy.PObject.AcessoLogin;
import easy.PObject.FazerBuscar;
import easy.utils.Base;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
public class StepFazerlogin extends Base {
	AcessoLogin acesso = new AcessoLogin();
	FazerBuscar fazerBuscar = new FazerBuscar();




	@Given("^usuario acessou o app$")
	public void usuario_acessou_o_app(){
		acesso.acessarApp();

	}
	@When("^preenchido o usuario e senha valido$")
	public void inserirUsuario() {
		acesso.digitarUsuarioSenha();
		
	}
	@Then("^deve ser apresentado a tela inicial do App$")
	public  void validarTelaInicial(){
		fazerBuscar.validarItemPesquisadoLoja();

	}
}
