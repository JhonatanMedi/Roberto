package Orange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPages {
	
	private WebDriver driver;

 public ListPages(WebDriver driver) {
	 this.driver = driver;
 }
 
 public void selectActions(String employee, String action) {
	 
	 WebElement actions = driver.findElement(By.xpath("//tr/td/a[contains(text(),'" + employee
	 		+ "')]/../../td[8]//select/option[text() = '" + action + "']"));
	 
	 actions.click();
	 
 }
	
}
