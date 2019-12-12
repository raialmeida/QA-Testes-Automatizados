package TesteWebJump.steps;

import org.openqa.selenium.WebDriver;

import Suporte.Browser;
import TesteWebJumb.pages.TesteWebJumbPages1;
import TesteWebJumb.pages.TesteWebJumbPages2;
import TesteWebJumb.pages.TesteWebJumbPages3;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesteWebJumpSteps {
	 
	protected WebDriver driver;
	
 Browser print = new Browser();
	TesteWebJumbPages1 TesteWebJumbPages = new TesteWebJumbPages1(driver);
	TesteWebJumbPages2 TesteWebJumbPages2 = new TesteWebJumbPages2(driver);
	TesteWebJumbPages3 TesteWebJumbPages3 = new TesteWebJumbPages3(driver);
	
	//print.Print("Screenshot Cenário 1");
	
	@Given("^que eu acesse a pagina$")
	public void queEuAcesseAPagina() throws Throwable {

		driver = Browser.Iniciadriver();
		
	}

	@When("^no painel Buttons e exibido os botoes 'One', 'Two', e 'Four'$")
	public void noPainelButtonsEExibidoOsBotoesOneTwoEFour() throws Throwable {

		TesteWebJumbPages.verificarbotaoNaTel(driver);
		
	}
 
	@When("^clicar no botao 'One', 'Two', e 'Four'$")
	public void clicarNoBotaoOneTwoEFour1() throws Throwable {
		TesteWebJumbPages.clicarbotao(driver); 
		
	}

	@Then("^verificar se os botoes ainda estao na tela$")
	public void verificarSeOsBotoesAindaEstaoNaTela() throws Throwable {
		TesteWebJumbPages.verificarAusencia(driver);
		print.Print("Screenshot Cenário 1");
		
  
	}
	@Given("^que eu acesse o Iframe$")
	public void queEuAcesseOIframe() throws Throwable {
		
	TesteWebJumbPages2.AcessarFrameButton(driver);
		
	}

	@When("^no painel iframe buttons Buttons e exibido os botoes 'One', 'Two', e 'Four'$")
	public void noPainelIframeButtonsButtonsEExibidoOsBotoesOneTwoEFour() throws Throwable {
		TesteWebJumbPages2.verificarbotaoNoPaineIFrameButton(driver);
		
		
	}

	@When("^clicar no botao 'One', 'Two', e 'Four'do painel IFRAME BUTTONS$")
	public void clicarNoBotaoOneTwoEFourDoPainelIFRAMEBUTTONS() throws Throwable {
		TesteWebJumbPages2.clicarBotaoNoPaineIFrameButtons(driver);
	    
	}

	@When("^verificar se os botoes ainda estao na tela do painel IFRAME BUTTONS$")
	public void verificarSeOsBotoesAindaEstaoNaTelaDoPainelIFRAMEBUTTONS() throws Throwable {
		TesteWebJumbPages2.verificarAusenciaBotaoIFrameButtons(driver);
		
		driver.switchTo().defaultContent();
		print.Print("Screenshot Cenário 2");
		
	}

	@When("^digita no campo YourFirstName com o texto$")
	public void digitaNoCampoYourFirstNameComOTexto() throws Throwable {
		TesteWebJumbPages3.digitarCampoYourFirstName(driver);
	}

	@When("^clicar no botao One$")
	public void clicarNoBotaoOne() throws Throwable {
		TesteWebJumbPages3.clicarBotaoOne(driver);
	   
	}

	@When("^cheque a opcao OptionThree$")
	public void chequeAOpcaoOptionThree() throws Throwable {
		TesteWebJumbPages3.chequeAopcaoOptionThree(driver);
	   
	}

	@When("^selecione a opcao ExampleTwo dentro da select box$")
	public void selecioneAOpcaoExampleTwoDentroDaSelectBox() throws Throwable {
		TesteWebJumbPages3.selectBoxExampleTwo(driver);
		print.Print("Screenshot Cenário 3");
	    
	}

	@Then("^validar a presenca da imagem do logo do Selenium Webdriver$")
	public void validarAPresencaDaImagemDoLogoDoSeleniumWebdriver() throws Throwable {
		TesteWebJumbPages3.verificarlogoImagem(driver);
	}

	
	@Then("^Fecha Browser$")
	public void fechaBrowser() throws Throwable {
	    driver.close();
}
}
