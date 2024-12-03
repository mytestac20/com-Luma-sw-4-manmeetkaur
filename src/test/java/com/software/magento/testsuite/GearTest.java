package com.software.magento.testsuite;


import com.software.magento.pages.Gear;
import com.software.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {

    Gear gearPage = new Gear();

    @Test
    public void  userShouldAddProductSuccessFullyToShoppinCart(){
        //Click on Content Tab
        gearPage.clickOnConsent();

        //1.Mouse Hover on the ‘Gear’ Menu
        gearPage.mouseHoverOnGear();

        //2.Click on the ‘Bags’
        gearPage.clickOnBags();

        //3.Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();

        //4.Verify the text ‘Overnight Duffle’
        gearPage.verifyTextOvernightDuffle();
        String expectedText = "Overnight Duffle";
        String actualTest = gearPage.verifyTextOvernightDuffle();
        Assert.assertEquals(actualTest,expectedText,"Overnight Duffle not displayed");

        //5.Change Qty 3
        gearPage.changeQty3();

        //6. Click on the ‘Add to Cart’ Button.
        gearPage.clickOnAddToCart();

        //7.Verify the text ‘You added Overnight Duffle to your shopping cart.’
        gearPage.verifyTextShoppingCart();
        String expectedMessage = "You added Overnight Duffle to your shopping cart.";
        String actualMessage = gearPage.verifyTextShoppingCart();
        Assert.assertEquals(actualMessage,expectedMessage,"You added Overnight Duffle to your shopping cart is not displayed");

        //8.Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();

        //9.Verify the product name ‘Overnight Duffle’
        gearPage.verifyProductName();
        String expectedName = "Overnight Duffle";
        String actualName =gearPage.verifyProductName();
        Assert.assertEquals(actualName,expectedName,"product name ‘Overnight Duffle’ not displayed");

        //10.Verify the Qty is ‘3’
        gearPage.verifyProductQty();
        String expectedQty = "3";
        String actualQty = gearPage.verifyProductQty();
        Assert.assertEquals(actualQty,expectedQty,"Qty is ‘3’ is not displayed");

        //11.Verify the product price ‘$135.00’
        gearPage.verifyProductPrice();
        String expectedPrice = "$135.00";
        String actualPrice = gearPage.verifyProductPrice();
        Assert.assertEquals(actualPrice,expectedPrice,"product price ‘$135.00’ not displayed");

        //12.Change Qty to ‘5’
        gearPage.changeQty5();

        //13.Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCart();

        //14.Verify the product price ‘$225.00’
        gearPage.verifyTheProPrice();
        String expectedProPrice = "$225.00";
        String actualProPrice = gearPage.verifyTheProPrice();
        Assert.assertEquals(actualProPrice,expectedProPrice,"product price ‘$225.00’ not displayed");
    }

}
