package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.DashboardPagePOM;
import pom.LoginPOM;

public class LoginandLogout {

	WebDriver driver = null;
	LoginPOM login;
	DashboardPagePOM dashboard;


	@Before
	public void browsersetup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void browserquitsetup() {

		driver.close();
		driver.quit();

	}

	@Given("^Hit (.*)$")
	public void hit_url(String URL) {

		driver.get(URL); //Hit the URL

	}

	@When("^user enters (.*) username and (.*)$")
	public void user_enters_buyer__username_and_password(String buyer, String password) {

		login = new LoginPOM(driver);

		login.enterUsername(buyer);    //User enters Buyer username
		login.enterPassword(password); //User enters password

	}

	@And("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {

		login = new LoginPOM(driver);

		login.clickLogin();  //Click on Login

	}

	@And("user is navigated to Dashboard page then logout")
	public void user_is_navigated_to_dashboard_page_then_logout() throws InterruptedException {

		dashboard = new DashboardPagePOM(driver);

		dashboard.clickProfileButton();   //Click on Profile button
		dashboard.clickLogout();          //Click on Logout

	}

	@Then("^Login again with (.*) username and (.*) and logout from the same$")
	public void login_again_with_supplier_username_and_password_and_logout_from_the_same(String supplier, String password) throws InterruptedException {

		login = new LoginPOM(driver);
		dashboard = new DashboardPagePOM(driver);

		login.enterUsername(supplier);   //User enters Supplier username
		login.enterPassword(password);   //User enters password
		login.clickLogin();              //Click on Login
		dashboard.clickProfileButton();  //Click on Profile button
		dashboard.clickLogout();         //Click on Logout
	}

}
