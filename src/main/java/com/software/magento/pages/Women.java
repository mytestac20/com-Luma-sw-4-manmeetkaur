package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Women extends Utility {
    //Click on Consent
    By consent = By.xpath("//p[text()='Consent']");

    //Mouse Hover on the ‘Women’ Menu
    By women  = By.xpath("//span[normalize-space()='Women']");

    //Mouse Hover on the ‘Tops’
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    //Click on the ‘Jackets’
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    //Select Sort By filter “Product Name”
    By productName = By.xpath("//select[@id='sorter'])[1]");

    //Select Sort By filter “Price”
    By productPrice = By.xpath("//select[@id='sorter'])[1]");

    //Verify the product name displayed in alphabetical order
// By.xpath("//strong[@class='product name product-item-name']//a");


    public void clickOnConsent(){
        clickOnElement(consent);
    }

    public void mouseHoverOnWomen(){
        mouseHoverToElement(women);
    }

    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }

    public void clickOnJackets(){
        mouseHoverToElementAndClick(jackets);
    }

    public void selectSortByProductName(){
        selectByVisibleTextFromDropDown(productName,"Product Name");
    }

    public void selectSortByProductPrice(){
        selectByVisibleTextFromDropDown(productPrice,"Price");
    }
}
