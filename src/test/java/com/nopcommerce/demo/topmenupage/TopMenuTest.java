package com.nopcommerce.demo.topmenupage;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    //e class "TopMenuTest"
    // 	1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string
    //	1.2 This method should click on the menu whatever name is passed as parameter.
    //	1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.

    @Test
    public void verifyUserShouldNavigateToTopMenuPage() throws InterruptedException {

        topMenuPage.selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = topMenuPage.verifyComputerPages();
        Assert.assertEquals(actualMessage, expectedMessage);

        topMenuPage.selectMenu("Electronics");
        String expectedMessage1 = "Electronics";
        String actualMessage1 = topMenuPage.verifyElectronicspages();
        Assert.assertEquals(actualMessage1, expectedMessage1);

        topMenuPage.selectMenu("Apparel");
        String expectedMessage2 = "Apparel";
        String actualMessage2 = topMenuPage.verifyAppearlPages();
        Assert.assertEquals(actualMessage2, expectedMessage2);

        topMenuPage.selectMenu("Digital downloads");
        String expectedMessage3 = "Digital downloads";
        String actualMessage3 = topMenuPage.verifydigitalDowanload();
        Assert.assertEquals(actualMessage2, expectedMessage2);

        topMenuPage.selectMenu("Books");
        String expectedMessage4 = "Books";
        String actualMessage4 = topMenuPage.verifyBooksPages();
        Assert.assertEquals(actualMessage4, expectedMessage4);

        topMenuPage.selectMenu("Jewelry");
        String expectedMessage5 = "Jewelry";
        String actualMessage5 = topMenuPage.verifyJewlrypages();
        Assert.assertEquals(actualMessage5, expectedMessage5);

        topMenuPage.selectMenu("Gift Cards");
        String expectedMessage6 = "Gift Cards";
        String actualMessage6 = topMenuPage.verifyGiftcardspages();
        Assert.assertEquals(actualMessage6, expectedMessage6);
    }


}
