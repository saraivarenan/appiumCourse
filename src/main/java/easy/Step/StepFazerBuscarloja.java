package easy.Step;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy.PObject.AcessoLogin;
import easy.PObject.FazerBuscar;
import easy.PObject.PaginaInicial;
import easy.utils.Base;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class StepFazerBuscarloja  {
	AcessoLogin acesso = new AcessoLogin();
	FazerBuscar fazerBuscar = new FazerBuscar();
	PaginaInicial paginaInicial = new PaginaInicial();




	@Given("^usuario está logado no APP Loja$")
	public void usuario_acessou_o_app_BuscaLoja(){
		acesso.acessarApp();
		acesso.digitarUsuarioSenha();

	}
	@When("^fazer a busca de uma loja pelo campo Busca Loja$")
	public void fazerBuscar_BuscaLoja() {
		paginaInicial.fazerBuscaLoja();
		
	}
	@Then("^Deve ser apresentado a loja pesquisada$")
	public  void validarbusca_BuscaLoja(){
		fazerBuscar.validarItemPesquisadoLoja();

	}
}
