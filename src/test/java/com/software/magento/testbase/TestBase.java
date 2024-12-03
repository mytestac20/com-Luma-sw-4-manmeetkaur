package com.software.magento.testbase;

import com.software.magento.propertyreader.PropertyReader;
import com.software.magento.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }



    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
