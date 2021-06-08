package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends TestBase {

    ComputerPage computerPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        computerPage.clickoncomputerlink();
        // 1.2 Click on Desktop
        computerPage.clickondesktopslink();
        // 1.3 Select Sort By position "Name: Z to A"
        computerPage.selectposition();
     //1.4 Verify the Product will arrange in Descending order.
        Thread.sleep(2000);
        List<WebElement> products;
        products = getListfromwebelements(By.xpath("//h2[@class='product-title']"));
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList,Collections.<String>reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist,tempList);

    }
}
