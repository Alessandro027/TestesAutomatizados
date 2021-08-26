package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	@FindBy(xpath = "//b[.='Admin']")
	public WebElement abaAdmin;
	
	@FindBy(xpath = "//b[.='PIM']")
	public WebElement abaPim;
	
	@FindBy(id = "menu_pim_Configuration")
	public WebElement menuConfiguration;
	
	@FindBy(id = "menu_pim_listCustomFields")
	public WebElement menuField;


}
