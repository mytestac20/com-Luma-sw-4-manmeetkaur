package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Gear extends Utility {


    //Click on Content Tab
    By consent = By.xpath("//p[text()='Consent']");

    //1.Mouse Hover on the ‘Gear’ Menu
    By gear = By.xpath("//span[normalize-space()='Gear']");

    //2.Click on the ‘Bags’
    By bags = By.xpath("//span[normalize-space()='Bags']");

    //3.Click on Product Name ‘Overnight Duffle’
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    //4.Verify the text ‘Overnight Duffle’
    By verifyText = By.xpath("//span[@class='base']");

    //5.Change Qty 3
    By qty3 = By.xpath("//input[@id='qty']");

    //6. Click on the ‘Add to Cart’ Button.
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    //7.Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By verifyShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    //8.Click on ‘shopping cart’ Link into message
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    //9.Verify the product name ‘Overnight Duffle’
    By verifyName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    //10.Verify the Qty is ‘3’
    By verifyQty = By.xpath("//input[@title='Qty']");

    //11.Verify the product price ‘$135.00’
    By verifyPrice = By.xpath("//span[@class='cart-price']//span)[2]");

    //12.Change Qty to ‘5’
    By qty5 = By.xpath("//input[@class='input-text qty'])[1]");

    //13.Click on ‘Update Shopping Cart’ button
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    //14.Verify the product price ‘$225.00’
    By verifyThePrice = By.xpath("//span[@class='cart-price']//span)[2]");

    public void clickOnConsent(){
        clickOnElement(consent);
    }

    public void mouseHoverOnGear(){
        mouseHoverToElement(gear);
    }

    public void clickOnBags(){
        mouseHoverToElementAndClick(bags);
    }

    public void clickOnOvernightDuffle(){
        clickOnElement(overnightDuffle);
    }

    public String verifyTextOvernightDuffle(){
        return getTextFromElement(verifyText);
    }
    public void changeQty3(){
        sendTextToElement(qty3,"3");
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public String verifyTextShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }

    public String verifyProductName(){
        return getTextFromElement(verifyName);
    }

    public String verifyProductQty(){
        return getTextFromElement(verifyQty);
    }

    public String verifyProductPrice(){
        return getTextFromElement(verifyPrice);
    }

    public void changeQty5(){
        sendTextToElement(qty5,"5");
    }

    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }

    public String verifyTheProPrice(){
        return getTextFromElement(verifyThePrice);
    }
}
