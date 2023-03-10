Feature: Add Product

  Scenario Outline: Add product and validate same Product
    Given Open the <URL> and enter valid <username> and <password>
    When Reach out to Buy and click on Products then click on add Product
    And Enter values in the fields <SKU>,<HTS>,<UPC>,Name,Description,Category,PriceEach,UnitofMeasure,PackageBarCode,PackageType,PackageWeight,PackageVolume,PackageWidth,PackageHeight,PackageLength,InnerQTY,Color,Size,MSRP,StockCode,Materials,UDF1,UDF2,ProductNetWeight,ProductHeight,ProductLength,ProductWidth,PrepackType,Season,ColorCode and click on save
    And User is able to add the product and search the same
    Then Logout from the user

    Examples: -
      | URL                     | username  | password | SKU   | HTS        | UPC     |
      | https://www.google.com/ | Username1 |      123 | 36621 | 1234567890 | TestNew |
