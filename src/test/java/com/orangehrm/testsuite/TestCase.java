package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void VerifyUserShouldNavigateToOrangeHrmPage(){
        homePage.clickOnOrangeHrm();
    }
    @Test
    public void VerifyUserShouldClickOnFree30DayTrialLink(){
        homePage.clickOnFree30DayTrialLink();

    }
    @Test
    public void verifyUserShouldClickOnContactSalesLink(){
        homePage.clickOnContactSalesLink();

    }

}
