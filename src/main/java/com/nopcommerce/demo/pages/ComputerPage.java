package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    WebDriverWait wait;

    By computerLink = By.linkText("Computers");
    By desktopsLink = By.linkText("Desktops");
    By selectPosition = By.xpath("//select[@id='products-orderby']");

    public void clickoncomputerlink() {
        clickOnElement(computerLink);
    }

    public void clickondesktopslink() {
        clickOnElement(desktopsLink);
    }

    public void selectposition() {
        selectByIndexFromDropDown(selectPosition, 2);
    }


}
