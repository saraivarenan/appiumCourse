package easy.Step;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy.PObject.AcessoLogin;

import java.net.MalformedURLException;

public class StepFazerlogin {
	AcessoLogin acesso = new AcessoLogin();

	public StepFazerlogin() throws MalformedURLException {
	}


	@Given("^usuario acessou o app$")
	public void usuario_acessou_o_app()  {
		acesso.acessarApp();

	}
	@When("^preenchido o usuario e senha valido$")
	public void inserirUsuario() {
		acesso.digitarUsuarioSenha();
		
	}
	@Then("^deve ser apresentado a tela inicial do App$")
	public  void validarTelaInicial(){

	}
}
