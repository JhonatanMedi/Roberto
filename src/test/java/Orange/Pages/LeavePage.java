package Orange.Pages;

import org.openqa.selenium.WebDriver;

import Orange.Steps.ButtonPages;
import Orange.Steps.ListPages;
import Orange.Steps.Questions;

public class LeavePage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	private ListPages listPages;
	
	public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);
		}
	
	public void searchEmployee(String employee) {
		buttonPages.btnLeave();
		questions.seachScroll(employee);
		questions.screenShot();
	}
	
	public void actionsEmployee(String employee, String action) {
		listPages.selectActions(employee, action);
		questions.screenShot();
	}

}
