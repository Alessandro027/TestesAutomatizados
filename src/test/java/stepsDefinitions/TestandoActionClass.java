package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionClass {
	@Quando("acionar o submenu customField")
	public void acionarOSubmenuCustomField() {
		Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("o sistema apresenta a tela customField")
	public void oSistemaApresentaATelaCustomField() {
		assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//h1[.='Defined Custom Fields']")).getText());
		
	}

}
