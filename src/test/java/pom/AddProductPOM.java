package pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductPOM {
	
	WebDriver driver;
	
	 By txt_Sku=By.xpath("//textarea[@name=\"SKU\"]");                                      //SKU xpath
	 By txt_hts= By.xpath("//label[text()='HTS#']/parent::div//textarea[@name='HTS#']");    //HTS xpath
	 By txt_upc= By.xpath("//label[text()='UPC#']/parent::div//textarea[@name='UPC#']");    //UPC xpath
	 By txt_name= By.xpath("//textarea[@name=\"Name\"]");                                   //Name xpath
	 By txt_Description= By.xpath("//textarea[@name=\"Description\"]");                     //Description xpath
	 By txt_Category=By.xpath("//label[text()='Category']/parent::div//input");    	        //Category xpath
	 By enterpriceUSD=By.xpath("//label[text()='Price Each (USD)']/parent::div//textarea[@name='Price Each (USD)']");      				//Price Each (USD) xpath
	 By enterUnit=By.xpath("//label[text()='Unit of Measure']/parent::div//input");         											//Unit of Measure xpath
	 By enterPackageBarcode= By.xpath("//label[text()='Package Bar Code']/parent::div//textarea[@name='Package Bar Code']");            //Package Bar Code xpath
	 By enterPackagetype= By.xpath("//label[text()='Package Type']/parent::div//input");                                                //Package Type xpath
	 By enterPackageweight= By.xpath("//label[text()='Package Weight (KG)']/parent::div//textarea[@name='Package Weight (KG)']");       //Package Weight (KG) xpath
	 By enterPackageVolume=By.xpath("//label[text()='Package Volume (CBM)']/parent::div//textarea[@name='Package Volume (CBM)']");      //Package Volume (CBM) xpath
	 By enterPackageWidth=By.xpath("//label[text()='Package Width (CM)']/parent::div//textarea[@name='Package Width (CM)']");           //Package Width (CM) xpath
	 By enterPackageheight=By.xpath("//label[text()='Package Height (CM)']/parent::div//textarea[@name='Package Height (CM)']");        //Package Height (CM) xpath
	 By enterPackagelength=By.xpath("//label[text()='Package Length (CM)']/parent::div//textarea[@name='Package Length (CM)']");        //Package Length (CM) xpath
	 By enterinnerqty=By.xpath("//label[text()='Inner QTY']/parent::div//textarea[@name='Inner QTY']");                         		//Inner QTY xpath
	 By entercolor=By.xpath("//textarea[@name=\"Color\"]");       		//Color xpath
	 By entersize=By.xpath("//textarea[@name=\"Size\"]");         		//Size xpath
	 By enterMsrp= By.xpath("//textarea[@name=\"MSRP\"]");        		//MSRP xpath
	 By enterstockcode =By.xpath("//textarea[@name=\"Stock Code\"]");   //Stock Code xpath
	 By enterMaterial =By.xpath("//textarea[@name=\"Materials\"]");     //Materials xpath
	 By enterudf1=By.xpath("//textarea[@name=\"UDF1\"]");          		//UDF1 xpath
	 By enterUdf2=By.xpath("//textarea[@name=\"UDF2\"]");          		//UDF2 xpath
	 By enterProductnetweight= By.xpath("//textarea[@name=\"Product Net Weight (KG)\"]");         //Product Net Weight (KG) xpath
	 By enterProductnetvolume= By.xpath("//textarea[@name=\"Product Net Volume (CBM)\"]");        //Product Net Volume (CBM) xpath
	 By enterUnitheight= By.xpath("//textarea[@name=\"Unit Height (CM)\"]");      //Unit Height (CM) xpath
	 By enterUnitlength=By.xpath("//textarea[@name=\"Unit Length (CM)\"]");       //Unit Length (CM) xpath
	 By enterunitwidth=By.xpath("//textarea[@name=\"Unit Width (CM)\"]");         //Unit Width (CM) xpath
	 By enterperpack= By.xpath("//div[@name='Prepack Type']//input");             //Prepack Type xpath
	 By entercountryorigin= By.xpath("//div[@data-testid=\"COUNTRYOFORIGINOBJECT\"]//input");       		//Country of Origin xpath
	 By enterseason=By.xpath("//label[text()='Season']/parent::div//textarea[@name='Season']");         	//Season xpath
	 By entercolourcode=By.xpath("//label[text()='Color Code']/parent::div//textarea[@name='Color Code']"); //Color Code xpath
	 By clickonsave=By.xpath("//button[@type=\"submit\"]");               	//Click on Save
	 
	 By btn_AddProductIcon = By.xpath("//button[@title=\"Add\"]");          //Click on + icon to add Product
	 By link_closeicon = By.xpath("//button[@title=\"Close\"]");			//Close Icon after product add and delete on product page
	 By txt_SearchProduct = By.xpath("//input[@placeholder=\"Search\"]");   //Click on Search Text Field of Product Page

	 
	 public AddProductPOM(WebDriver driver) {
			
			this.driver = driver;
			
		}
	 
	 public void enterSKU(String Sku) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterSku = wait.until(ExpectedConditions.elementToBeClickable(txt_Sku));
			enterSku.sendKeys(Sku);  //Enter value in SKU field
		}
	 
	 public void enterHTS(String hts) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterSku = wait.until(ExpectedConditions.elementToBeClickable(txt_hts));
			enterSku.sendKeys(hts);  //Enter value in HTS field
	 }
	 
	 public void enterUPC(String upc) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterSku = wait.until(ExpectedConditions.elementToBeClickable(txt_upc));
			enterSku.sendKeys(upc);  //Enter value in UPC field
	}
	 
	 public void enterName(String name) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterSku = wait.until(ExpectedConditions.elementToBeClickable(txt_name));
			enterSku.sendKeys(name);  //Enter value in Name field
	}
	 
	 public void enterDescription(String Description) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			WebElement enterDescription = wait.until(ExpectedConditions.elementToBeClickable(txt_Description));
			enterDescription.sendKeys(Description);  //Enter value in Description field
	}
	 
	 public void enterCategory(String Category) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			
			WebElement enterCategory = wait.until(ExpectedConditions.elementToBeClickable(txt_Category));
			enterCategory.sendKeys(Category);  //Enter value in Category field
	}
	 
	 public void enterPriceEach(String Price) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterprice = wait.until(ExpectedConditions.elementToBeClickable(enterpriceUSD));
			enterprice.sendKeys(Price);  //Enter value in Price Each USD field
	}
	 
	 public void enterUnitOfMeasure (String UnitMeasure ) {
		 
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
		 	WebElement enterUnitOfMeasure = wait.until(ExpectedConditions.elementToBeClickable(enterUnit));
		 	enterUnitOfMeasure.sendKeys(UnitMeasure);  //Enter value in Unit of Measure field
	 }
	 
	 public void enterPackageBarcode(String PackageBarcode) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterPackage = wait.until(ExpectedConditions.elementToBeClickable(enterPackageBarcode));
			enterPackage.sendKeys(PackageBarcode);  //Enter value in Package Bar Code field
	}
	 
	 public void enterPackageType(String PackageType) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterPackageType = wait.until(ExpectedConditions.elementToBeClickable(enterPackagetype));
			enterPackageType.sendKeys(PackageType);  //Enter value in Package Type field
	}
	 
	 public void enterPackageWeight(String PackageWeight) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			
			WebElement enterPackageWeight = wait.until(ExpectedConditions.elementToBeClickable(enterPackageweight));
			enterPackageWeight.sendKeys(PackageWeight);  //Enter value in Package Weight field
	}
	 
	 public void enterPackageVolume(String Packagevolume) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterPackagevolume = wait.until(ExpectedConditions.elementToBeClickable(enterPackageVolume));
			enterPackagevolume.sendKeys(Packagevolume);  //Enter value in Package Volume field
	}
	 
	 public void enterPackageWidth(String Packagewidth) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterPackagewidth = wait.until(ExpectedConditions.elementToBeClickable(enterPackageWidth));
			enterPackagewidth.sendKeys(Packagewidth);  //Enter value in Package Width field
	}
	 
	 public void enterPackageHeight(String Packageheight) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterPackageheightCM = wait.until(ExpectedConditions.elementToBeClickable(enterPackageheight));
			enterPackageheightCM.sendKeys(Packageheight);  //Enter value in Package Height field
	 }
	 
	 public void enterPackageLength(String Packagelength) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterPackagelengthCM = wait.until(ExpectedConditions.elementToBeClickable(enterPackagelength));
			enterPackagelengthCM.sendKeys(Packagelength);  //Enter value in Package Length field
	}
	 
	 public void enterInnerQTY(String innerqty) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement enterinnerqtyvalue = wait.until(ExpectedConditions.elementToBeClickable(enterinnerqty));
			enterinnerqtyvalue.sendKeys(innerqty);  //Enter value in Inner QTY field
	}
	 
	 public void enterColor(String color) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						
			WebElement entercolorvalue = wait.until(ExpectedConditions.elementToBeClickable(entercolor));
			entercolorvalue.sendKeys(color);  //Enter value in Color field
	 }
	 
	public void enterSize(String Size) {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
								
				WebElement enterSizeValue = wait.until(ExpectedConditions.elementToBeClickable(entersize));
				enterSizeValue.sendKeys(Size);  //Enter value in Size field
		}
	
	public void enterMSRP(String Msrp) {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
								
				WebElement enterMsrpValue = wait.until(ExpectedConditions.elementToBeClickable(enterMsrp));
				enterMsrpValue.sendKeys(Msrp);  //Enter value in MSRP field
		}
	
	public void enterStockCode(String stockcode) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterstockcodeValue = wait.until(ExpectedConditions.elementToBeClickable(enterstockcode));
		enterstockcodeValue.sendKeys(stockcode);  //Enter value in Stock Code field
	}
	
	public void enterMaterials(String Material) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterMaterialValue = wait.until(ExpectedConditions.elementToBeClickable(enterMaterial));
		enterMaterialValue.sendKeys(Material);  //Enter value in Materials field
	}
	
	public void enterUDF1(String udf1) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterudf1Value = wait.until(ExpectedConditions.elementToBeClickable(enterudf1));
		enterudf1Value.sendKeys(udf1);  //Enter value in UDF1 field
	}
	
	public void enterUDF2(String Udf2) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterUdf2Value = wait.until(ExpectedConditions.elementToBeClickable(enterUdf2));
		enterUdf2Value.sendKeys(Udf2);  //Enter value in UDF2 field
	}
	
	public void enterProductNetWeight(String Productnetweight) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterProductnetWeight = wait.until(ExpectedConditions.elementToBeClickable(enterProductnetweight));
		enterProductnetWeight.sendKeys(Productnetweight);  //Enter value in Product Net Weight field
	}
	
	public void enterProductNetVolume(String ProductnetVolume) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterProductnetVolume = wait.until(ExpectedConditions.elementToBeClickable(enterProductnetvolume));
		enterProductnetVolume.sendKeys(ProductnetVolume);  //Enter value in Product Net Volume (CBM) field
	}
	
	public void enterUnitHeight(String Productunitheight) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterProductunitheight = wait.until(ExpectedConditions.elementToBeClickable(enterUnitheight));
		enterProductunitheight.sendKeys(Productunitheight);  //Enter value in Unit Height (CM) field
	}
	
	public void enterUnitLength(String Productunitlength) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterProductunitlength = wait.until(ExpectedConditions.elementToBeClickable(enterUnitlength));
		enterProductunitlength.sendKeys(Productunitlength);  //Enter value in Unit Length (CM) field
	}
	
	public void enterUnitWidth(String unitWidth) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterunitwidthValue = wait.until(ExpectedConditions.elementToBeClickable(enterunitwidth));
		enterunitwidthValue.sendKeys(unitWidth);  //Enter value in Unit Width (CM) field
	}
	
	public void enterPrepackType(String Prepack) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterPerPack = wait.until(ExpectedConditions.elementToBeClickable(enterperpack));
		enterPerPack.sendKeys(Prepack);  //Enter value in Prepack Type field
	}
	
	public void enterCountryOfOrigin(String CountryOfOrigin) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterCountryOrigin = wait.until(ExpectedConditions.elementToBeClickable(entercountryorigin));
		enterCountryOrigin.sendKeys(CountryOfOrigin);  //Enter value in Country of Origin field
	}
	
	public void enterSeason(String Season) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterSeasonValue = wait.until(ExpectedConditions.elementToBeClickable(enterseason));
		enterSeasonValue.sendKeys(Season);  //Enter value in Season field
	}
	
	public void enterColorCode(String Colorcode) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement enterColorcode = wait.until(ExpectedConditions.elementToBeClickable(entercolourcode));
		enterColorcode.sendKeys(Colorcode);  //Enter value in Color Code field
	}
	
	public void ClickonSave() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		WebElement ClickonSave  = wait.until(ExpectedConditions.elementToBeClickable(clickonsave));
		ClickonSave.click();  //Click on Save
	}
	
	public void clickAddProductIcon() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickonAddProductIcon = wait.until(ExpectedConditions.presenceOfElementLocated(btn_AddProductIcon));
		clickonAddProductIcon.click();  //Click on + icon to add Product
	}
	
	public void closeIconProductPage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		WebElement clickonCloseIcon = wait.until(ExpectedConditions.presenceOfElementLocated(link_closeicon));
		clickonCloseIcon.click();  //Close Icon after product add and delete
	}
	
	public void productPageSearchTextField(String Searchentertext) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		WebElement productsearchtextfield = wait.until(ExpectedConditions.presenceOfElementLocated(txt_SearchProduct));
		productsearchtextfield.sendKeys(Searchentertext);  //Click on search text field
	}
	
	public void pressenter() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

		WebElement pressEnter = wait.until(ExpectedConditions.presenceOfElementLocated(txt_SearchProduct));
		pressEnter.sendKeys(Keys.ENTER);  //Press Enter to search product
	}

}
