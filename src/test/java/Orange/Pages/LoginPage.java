package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;


public class LoginPage {
	
	//llamado de una clase
	private ButtonPages buttonPages;

	//elemento de busqueda en la pagina
	@FindBy(how = How.ID, using = "txtUsername")
	// nombre de la variable que guarda @FindBy
	private WebElement inputUserName;
	
	@FindBy(how = How.ID, using = "txtPassword")
	private WebElement inputContrasena;
	
	//constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		
	}

	//metodo
	public void diligenciarFormulario(String userName, String pass) {
		inputUserName.sendKeys(userName);
		inputContrasena.sendKeys(pass);
		buttonPages.botonLogin();
		
	}
	
	
}













