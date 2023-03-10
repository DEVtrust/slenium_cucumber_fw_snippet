package pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class LoginPOM {

	WebDriver driver;

	By txt_username = By.xpath("//input[@name=\"userName\"]"); 
	By txt_password = By.xpath("//input[@name=\"loginPassword\"]");
	By btn_login = By.xpath("//button[text()=\"Login \"]");

	public LoginPOM(WebDriver driver) {

		this.driver = driver;

	}

	public void enterUsername(String username) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement enterusername = wait.until(ExpectedConditions.elementToBeClickable(txt_username)); 
		enterusername.sendKeys(username); //User enters buyer username

	}

	public void enterPassword(String password) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement enterpassword = wait.until(ExpectedConditions.elementToBeClickable(txt_password)); 
		enterpassword.sendKeys(password);  //User enters password
	}

	public void clickLogin() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnLogin = wait.until(ExpectedConditions.elementToBeClickable(btn_login)); 
		clickOnLogin.click();  //Click on Login
	}

}
