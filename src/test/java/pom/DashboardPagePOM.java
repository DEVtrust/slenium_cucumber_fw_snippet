package pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPagePOM {

	WebDriver driver;

	By btn_buy = By.xpath("//span[text()=\"Buy\"]");                            //Buy xpath
	By btn_po = By.xpath("(//ul[@aria-labelledby='help-button']//li)[1]");      //Purchase Orders xpath
	By btn_br = By.xpath("(//ul[@aria-labelledby='help-button']//li)[2]");      //Booking Requests xpath
	By btn_products = By.xpath("//li[text()=\"Products\"]");                    //Products xpath
	By btn_move = By.xpath("//button[@id=\"menu-button\"]");                    //Move xpath
	By btn_bc = By.xpath("//li[text()=\"Booking Confirmations\"]");             //Booking Confirmations xpath
	By btn_sc = By.xpath("//li[text()=\"Shipments\"]");                         //Shipments xpath
	By btn_profile = By.xpath("(//button[@id=\"profile-button\"])[2]");         //Profile button xpath
	By btn_logout = By.xpath("//li[text()=\"Logout\"]");                        //Logout xpath

	public DashboardPagePOM(WebDriver driver) {

		this.driver = driver;

	}
	
	public void clickBuy() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnBuy = wait.until(ExpectedConditions.presenceOfElementLocated(btn_buy));
		clickOnBuy.click();  //Click on Buy
	}
	
	public void clickPO() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnPO = wait.until(ExpectedConditions.presenceOfElementLocated(btn_po));
		clickOnPO.click();  //Click on Purchase Orders
	}
	
	public void clickBR() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnBR = wait.until(ExpectedConditions.presenceOfElementLocated(btn_br));
		clickOnBR.click();  //Click on Booking Requests
	}
	
	public void clickproducts() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnProducts = wait.until(ExpectedConditions.presenceOfElementLocated(btn_products));
		clickOnProducts.click();  //Click on Products
	}
		
	public void clickMove() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnMove = wait.until(ExpectedConditions.presenceOfElementLocated(btn_move));
		clickOnMove.click();  //Click on Move
	}
	
	public void clickBC() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnBC = wait.until(ExpectedConditions.presenceOfElementLocated(btn_bc));
		clickOnBC.click();  //Click on Booking Confirmations
	}
	
	public void clickSC() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnSC = wait.until(ExpectedConditions.presenceOfElementLocated(btn_sc));
		clickOnSC.click();  //Click on Shipments
	}

	public void clickProfileButton() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement clickOnProfileButton = wait.until(ExpectedConditions.presenceOfElementLocated(btn_profile));
		clickOnProfileButton.click();  //Click on Profile button
	}

	public void clickLogout() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement clickOnLogout = wait.until(ExpectedConditions.presenceOfElementLocated(btn_logout));
		clickOnLogout.click();  //Click on Logout
	}


}
