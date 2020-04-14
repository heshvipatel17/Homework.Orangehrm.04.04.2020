package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    HomePage homePage = new HomePage();

    @Test(priority = 0, groups = {"Sanity","Regression"})
    public void VerifyUserShouldNavigateToOrangeHrmPage(){
        homePage.clickOnOrangeHrm();
    }
    @Test(priority = 1, groups = {"Smoke","Regression"})
    public void VerifyUserShouldClickOnFree30DayTrialLink(){
        homePage.clickOnFree30DayTrialLink();

    }
    @Test (priority = 2, groups = {"Regression"})
    public void verifyUserShouldClickOnContactSalesLink(){
        homePage.clickOnContactSalesLink();

    }

}
