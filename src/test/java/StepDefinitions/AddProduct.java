package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.AddProductPOM;
import pom.DashboardPagePOM;
import pom.LoginPOM;

public class AddProduct {
	
	WebDriver driver = null;
	LoginPOM login;
	DashboardPagePOM dashboard;
	AddProductPOM addproduct;
		
	@Given("^Open the (.*) and enter valid (.*) and (.*)$")
	public void open_the_URL_and_enter_valid_username_and_password(String URL, String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(URL); //Hit the URL
		
		login = new LoginPOM(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
		
	}

	@When("Reach out to Buy and click on Products then click on add Product")
	public void reach_out_to_buy_and_click_on_products_then_click_on_add_product() {
		
		dashboard = new DashboardPagePOM(driver);
		addproduct = new AddProductPOM(driver);
		
		dashboard.clickBuy();
		dashboard.clickproducts();
		addproduct.clickAddProductIcon();
		
	}
	
	@And("^Enter values in the fields (.*),(.*),(.*),Name,Description,Category,PriceEach,UnitofMeasure,PackageBarCode,PackageType,PackageWeight,PackageVolume,PackageWidth,PackageHeight,PackageLength,InnerQTY,Color,Size,MSRP,StockCode,Materials,UDF1,UDF2,ProductNetWeight,ProductHeight,ProductLength,ProductWidth,PrepackType,Season,ColorCode and click on save$")
	public void enter_values_in_the_fields_sku_hts_upc_name_description_category_price_each_unitof_measure_package_bar_code_package_type_package_weight_package_volume_package_width_package_height_package_length_inner_qty_color_size_msrp_stock_code_materials_udf1_udf2_product_net_weight_product_height_product_length_product_width_prepack_type_season_color_code_and_click_on_save(String SKU, String HTS, String UPC) {
		
		addproduct = new AddProductPOM(driver);
		
		addproduct.enterSKU(SKU);
		addproduct.enterHTS(HTS);
		addproduct.enterUPC(UPC);
		addproduct.enterName("Test");
		addproduct.enterDescription("New");
		addproduct.enterCategory("Bags");
		addproduct.enterPriceEach("12");
		addproduct.enterUnitOfMeasure("EA");
		addproduct.enterPackageBarcode("12");
		addproduct.enterPackageType("Bag");
		addproduct.enterPackageWeight("12");
		addproduct.enterPackageVolume("12");
		addproduct.enterPackageWidth("12");
		addproduct.enterPackageHeight("12");
		addproduct.enterPackageLength("12");
		addproduct.enterInnerQTY("12");
		addproduct.enterColor("12");
		addproduct.enterSize("12");
		addproduct.enterMSRP("12");
		addproduct.enterStockCode("12");
		addproduct.enterMaterials("12");
		addproduct.enterUDF1("12");
		addproduct.enterUDF2("12");
		addproduct.enterProductNetWeight("12");
		addproduct.enterProductNetVolume("12");
		addproduct.enterUnitHeight("12");
		addproduct.enterUnitLength("12");
		addproduct.enterUnitWidth("12");
		addproduct.enterPrepackType("Box");
		addproduct.enterCountryOfOrigin("United States");
		addproduct.enterSeason("12");
		addproduct.enterColorCode("12");
		addproduct.ClickonSave();
		
	}

	@And("User is able to add the product and search the same")
	public void user_is_able_to_add_the_product_and_search_the_same() {
		
		addproduct = new AddProductPOM(driver);
		
		addproduct.closeIconProductPage();
		addproduct.productPageSearchTextField("36621");
		addproduct.pressenter();
		
	}
	
	@Then("Logout from the user")
	public void logout_from_the_user() {
		
		dashboard = new DashboardPagePOM(driver);
		
		dashboard.clickProfileButton();
		dashboard.clickLogout();
		
		driver.close();
		driver.quit();
		
	}

}

