package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuPage extends Utility {
    //1. create class "TopMenuTest"
    // 	1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string
    //	1.2 This method should click on the menu whatever name is passed as parameter.
    By computerLink = By.linkText("Computers");
    By verifyComputerPage = By.partialLinkText("Compute");
    By electronicsLink = By.linkText("Electronics");
    By verifyElectronicsPage = By.partialLinkText("Electroni");
    By apparelLink = By.linkText("Apparel");
    By verifyApparelPage = By.partialLinkText("Appar");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By verifyDigitalDowanloadPage = By.partialLinkText("Digital downloa");
    By booksLink = By.linkText("Books");
    By verifyBooksPage =By.partialLinkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By verifyJewelryPage = By.partialLinkText("Jewel");
    By giftcardsLink = By.linkText("Gift Cards");
    By verifyGiftsCards =By.partialLinkText("Gift Car");

    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        if (menu == "Computers") {
            clickOnElement(computerLink);

        } else if (menu == "Electronics") {
         clickOnElement(electronicsLink);
        } else if (menu == "Apparel") {

            clickOnElement(apparelLink);
        } else if (menu == "Digital downloads") {

            clickOnElement(digitalDownloadsLink);
        } else if (menu == "Books") {

            clickOnElement(booksLink);

        } else if (menu == "Jewelry") {

          clickOnElement(jewelryLink);
        } else if (menu == "Gift Cards") {
            clickOnElement(giftcardsLink);
        }

    }
    public String verifyComputerPages(){
        return getTextFromElement(verifyComputerPage);
    }
    public String verifyElectronicspages(){
        return getTextFromElement(verifyElectronicsPage);
    }
    public String verifyAppearlPages(){
        return getTextFromElement(verifyApparelPage);
    }
    public String verifydigitalDowanload(){
        return getTextFromElement(verifyDigitalDowanloadPage);
    }
    public String verifyBooksPages(){
        return getTextFromElement(verifyBooksPage);
    }
    public  String verifyJewlrypages(){
        return getTextFromElement(verifyJewelryPage);
    }
    public String verifyGiftcardspages(){
        return getTextFromElement(verifyGiftsCards);
    }
}
