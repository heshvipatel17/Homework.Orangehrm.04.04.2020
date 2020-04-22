package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//img[@class='nav-logo']")
    WebElement _orangeHrmLink;

    @FindBy(xpath = "//a[contains(@class,'btn-orange trial-btn pulse')]")
    WebElement _free30DayTrialLink;

    @FindBy(xpath = "//a[contains(@class,'btn-orange contact-ohrm')]")
    WebElement _contactSalesLink;

    public void clickOnOrangeHrm() {
        Reporter.log("Clicking on OrangeHRM link "+ _orangeHrmLink.toString() + "<br>");
        clickOnElement(_orangeHrmLink);
        log.info("Clicking on OrangeHRM link "+ _orangeHrmLink.toString());
    }

    public void clickOnFree30DayTrialLink() {
        Reporter.log(" Clicking on 30 day free trial "+ _free30DayTrialLink.toString() + "<br>");
        clickOnElement(_free30DayTrialLink);
        log.info(" Clicking on 30 day free trial "+ _free30DayTrialLink.toString());
    }

    public void clickOnContactSalesLink() {
        Reporter.log(" Clicking on contact sales link "+ _contactSalesLink.toString() + "<br>");
        clickOnElement(_contactSalesLink);
        log.info(" Clicking on contact sales link "+ _contactSalesLink.toString());
    }
}
