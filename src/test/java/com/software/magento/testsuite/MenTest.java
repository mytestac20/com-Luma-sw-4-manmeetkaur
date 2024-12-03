package com.software.magento.testsuite;

import com.software.magento.pages.Men;
import com.software.magento.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {

    Men menPage = new Men();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        //Click on Content Tab
        menPage.clickOnConsent();

        //1.Mouse Hover on the ‘Men’ Menu
        menPage.mouseHoverOnMenMenu();

        //2.Mouse Hover on the ‘Bottoms’
        menPage.mouseHoverBottoms();

        //3.Click on the ‘Pants’
        menPage.clickOnPants();

        //4.Mouse Hover on the product name‘Cronus Yoga Pant’ and click on the size 32.
        menPage.mouseHoverOnCronusYogaPantAndClick();

        //5.Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
        menPage.clickOnColorBlack();

        //6.Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        menPage.mouseHoverAndAddToCart();

        //7.Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        menPage.verifyTextCronusYogaPant();
        String actualText = menPage.verifyTextCronusYogaPant();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart";
        Assert.assertEquals(actualText,expectedText,"You added Cronus Yoga Pant to your shopping cart not displayed");

        //8.Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();

        //9.Verify the text ‘Shopping Cart.'
        menPage.verifyTextShoppingCart();
        String actualTextIs = menPage.verifyTextShoppingCart();
        String expectedTextIs = "Shopping Cart";
        Assert.assertEquals(actualTextIs,expectedTextIs,"Shopping Cart text is not displayed");

        //10.Verify the product name ‘Cronus Yoga Pant’
        menPage.verifyProductName();

        String actualName = menPage.verifyProductName();
        String expectedName = "Cronus Yoga Pant";
        Assert.assertEquals(actualName,expectedName,"Cronus Yoga Pant product name not displayed");

        //11.Verify the product size ‘32’
        menPage.verifyProductSize();
        String actualSize = menPage.verifyProductSize();

        String expectedSize = "32";
        Assert.assertEquals(actualSize,expectedSize,"Size 32 not displayed");

        //12.Verify the product colour ‘Black’
        menPage.verifyProductColour();

        String actualColour = menPage.verifyProductColour();
        String expectedColour = "Black";
        Assert.assertEquals(actualColour,expectedColour,"Black colour not displayed");

    }
}