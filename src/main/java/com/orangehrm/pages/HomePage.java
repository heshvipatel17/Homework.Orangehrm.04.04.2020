package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By orangeHrmLink = By.xpath("//img[@class='nav-logo']");
    By free30DayTrialLink = By.xpath("//a[contains(@class,'btn-orange trial-btn pulse')]");
    By contactSalesLink = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");

    public void clickOnOrangeHrm() {
        clickOnElement(orangeHrmLink);
    }

    public void clickOnFree30DayTrialLink() {
        clickOnElement(free30DayTrialLink);
    }

    public void clickOnContactSalesLink() {
        clickOnElement(contactSalesLink);
    }
}
