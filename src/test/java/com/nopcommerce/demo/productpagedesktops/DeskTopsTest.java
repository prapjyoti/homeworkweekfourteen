package com.nopcommerce.demo.productpagedesktops;

import com.nopcommerce.demo.pages.ProductPageDesktop;
import com.nopcommerce.demo.topmenupage.TopMenuTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeskTopsTest extends TopMenuTest {

    ProductPageDesktop productPageDesktop = new ProductPageDesktop();


    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        productPageDesktop.clickoncomputertab();
        //	2.2 Click on Desktop
        Thread.sleep(3000);
        productPageDesktop.clickondesktop();
        //	2.3 Select Sort By position "Name: A to Z"
        Thread.sleep(2000);
        productPageDesktop.selectposition();
        //2.4 Click on "Add To Cart"
        Thread.sleep(2000);
        productPageDesktop.addToCart();
        String expectedMessage = "Build your own computer";
        String actualMessage = productPageDesktop.buildyourownComputertext();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);

        //  2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPageDesktop.setselectProcesser();
        // 2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000);
        productPageDesktop.setSelectRam();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(1000);
        productPageDesktop.clickonHdd();
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(1000);
        productPageDesktop.OsRadit();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(1000);
        productPageDesktop.ClickSoftware();//clear default value first
        Thread.sleep(1000);
        productPageDesktop.ClickOnSoftware();
        //2.11 Verify the price "$1,475.00"
        Thread.sleep(1000);
        String expectedMessage1 = "$1,475.00";
        String actualMessage1 = productPageDesktop.setVerifyPrice();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        Thread.sleep(1000);
        //	2.12 Click on "ADD TO CARD" Button.
        productPageDesktop.setClickAddCart();
        Thread.sleep(1000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage2 = "The product has been added to your shopping cart";
        String actualMessage2 = productPageDesktop.verifyshoppingcart();
        Assert.assertEquals(actualMessage2, expectedMessage2);


    }
}
