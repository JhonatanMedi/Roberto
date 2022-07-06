package Orange.Steps;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.icu.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class Questions {
	
	private WebDriver driver;
	
	public Questions(WebDriver driver) {
		this.driver = driver;	
	}

	
	public void tituloAssert() {

		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Booking.com");
	}


	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\Jhonatan\\Documents\\Capturas\\" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
	public void seachScroll(String employee) {
		
		WebElement result = driver.findElement(By.xpath("//table//*[text() = '" + employee + "']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", result);
		
	}
	
	public void assertCreateEmployee(String firstName, String lastName ) {
			
		String usurio = driver.findElement(By.xpath("//div//h1")).getText();
		Assert.assertEquals(usurio, firstName +" "+ lastName);

	}

}