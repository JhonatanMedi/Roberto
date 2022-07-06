package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement botonLogin;
	
	@FindBy(how = How.ID, using = "menu_pim_viewPimModule")
	private WebElement btnPim;
	
	@FindBy(how = How.ID, using = "btnAdd")
	private WebElement btnAdd;
	
	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;
	
	@FindBy(how = How.ID, using = "menu_leave_viewLeaveModule")
	private WebElement btnLeave;
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void botonLogin() {
		botonLogin.click();
	}
	
	public void btnPim() {
		btnPim.click();
	}
	
	public void btnAdd() {
		btnAdd.click();
	}
	
	public void btnSave() {
		btnSave.click();
	}
	
	public void btnLeave() {
		btnLeave.click();;
	}
	
	
	
	
	
	
	
	
	
	
	
}
