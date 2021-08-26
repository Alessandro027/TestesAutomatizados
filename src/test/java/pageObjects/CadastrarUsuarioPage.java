package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	@FindBy(name = "systemUser[employeeName][empName]")
	public WebElement campoEmployee;
	
	@FindBy(id = "systemUser_userName")
	public WebElement campoUserName;
	
	@FindBy(id = "systemUser_password")
	public WebElement campoPassword;
	
	@FindBy(id = "systemUser_confirmPassword")
	public WebElement campoConfirmarPassword;
	
	@FindBy(id = "btnSave")
	public WebElement botaoSalvar;
	
	public void informarCampoEmployeeName(String employeeName) {
		campoEmployee.sendKeys(employeeName);
	}
	
	public void informarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void informarCampoConfirmaPassword(String confirmaPassword) {
		campoConfirmarPassword.sendKeys(confirmaPassword);
	}
	
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}
}
