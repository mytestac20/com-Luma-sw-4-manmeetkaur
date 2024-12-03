package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Men extends Utility {
    //Click on Content Tab
    By consent = By.xpath("//p[text()='Consent']");

    //1.Mouse Hover on the ‘Men’ Menu
    By men = By.xpath("//span[normalize-space()='Men']");

    //2.Mouse Hover on the ‘Bottoms’
    By bottoms = By.xpath("//a[@id='ui-id-18']");

    //3.Click on the ‘Pants’
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    //4.Mouse Hover on the product name‘Cronus Yoga Pant’ and click on the size 32.
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By cronusYogaPantClick = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");

    //5.Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
    By colorBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");

    //6.Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    By mouseHoverCronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addToCart = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");

    //7.Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    //8.Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    //9.Verify the text ‘Shopping Cart.'
    By verifyShoppingCart = By.xpath("//span[@class='base']");

    //10.Verify the product name ‘Cronus Yoga Pant’
    By verifyName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    //11.Verify the product size ‘32’
    By verifySize = By.xpath("//dd[contains(text(),'32')]");

    //12.Verify the product colour ‘Black’
    By verifyColour = By.xpath("//dd[contains(text(),'Black')]");


    public void clickOnConsent(){
        clickOnElement(consent);
    }

    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(men);
    }

    public void mouseHoverBottoms(){
        mouseHoverToElement(bottoms);
    }

    public void clickOnPants(){
        clickOnElement(pants);
    }

    public void mouseHoverOnCronusYogaPantAndClick(){
        mouseHoverToElement(cronusYogaPant);
        mouseHoverToElementAndClick(cronusYogaPantClick);
    }

    public void clickOnColorBlack(){
        mouseHoverToElementAndClick(colorBlack);
    }

    public void mouseHoverAndAddToCart(){
        mouseHoverToElement(mouseHoverCronusYogaPant);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyTextCronusYogaPant(){
        return getTextFromElement(verifyText);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }

    public String verifyTextShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }

    public String verifyProductName(){
        return getTextFromElement(verifyName);
    }

    public String verifyProductSize(){
        return getTextFromElement(verifySize);
    }

    public String verifyProductColour(){
        return getTextFromElement(verifyColour);
    }

}