package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser ="chrome";
    @BeforeMethod
    public void setup(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void teardown(){
        closeBrowser();
    }
}
