package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ProductPageDesktop extends Utility {

    By computerLink = By.linkText("Computers");
    By desktopsLink = By.linkText("Desktops");
    By selectPosition = By.xpath("//select[@id='products-orderby']");
    By addtocart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By buildOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcesser = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.ByLinkText.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']");
    By oSRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By software = By.xpath("//input[@id='product_attribute_5_10']");
    By softwareclick= By.xpath("//input[@id='product_attribute_5_12' and @ name='product_attribute_5']");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By clickAddCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyShoppingCart = By.xpath("//p[text()='The product has been added to your ']");

    public void clickoncomputertab() {
        clickOnElement(computerLink);
    }

    public void clickondesktop() {
        clickOnElement(desktopsLink);
    }

    public void selectposition() {
        selectByIndexFromDropDown(selectPosition, 1);
    }

    public void addToCart() {
        clickOnElement(addtocart);
    }

    public String buildyourownComputertext() {
        return getTextFromElement(buildOwnComputerText);
    }
    public void setselectProcesser(){
        selectByIndexFromDropDown(selectProcesser,1);
    }
    public void setSelectRam(){
        selectByIndexFromDropDown(selectRam,3);
    }

    public void clickonHdd(){
        clickOnElement(hddRadio);
    }
    public void OsRadit(){
        clickOnElement(oSRadio);
    }public void ClickSoftware(){
        clickOnElement(software);
        clickOnElement(software);
    }
    public void ClickOnSoftware(){
        clickOnElement(softwareclick);

    }
    public String setVerifyPrice(){

        return getTextFromElement(verifyPrice);
    }
    public void setClickAddCart(){

        clickOnElement(clickAddCart);
    }
   public String verifyshoppingcart(){
        return getTextFromElement(verifyShoppingCart);
    }

}
