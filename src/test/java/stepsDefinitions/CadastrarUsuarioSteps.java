package stepsDefinitions;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployeeName(String employeeName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeeName);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String userName) {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmaPassword) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmaPassword(confirmaPassword);
	}
	
	@Quando("acionar o botao salvar")
	public void acionar_o_botao_salvar() {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Então("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String userName) {
		assertTrue(driver.findElement(By.xpath("//a[.='"+userName+"']")).isDisplayed());
	}
}
