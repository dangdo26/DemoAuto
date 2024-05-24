package testCase;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.ElementsRadioQAPage;

import static Keywords.WebUi.getRowCount;
import static Keywords.WebUi.openURL;

public class ElementsRadioQATest extends BaseTest {

    ElementsRadioQAPage eRQ = new ElementsRadioQAPage();

    @Test
    public void clickYesTest() {
        eRQ.clickYes();
        eRQ.verifyResultMessageDisplay("Yes", "Yes Not Match");

    }

    @Test
    public void clickImpressiveTest() {
        eRQ.clickImpressive();
        eRQ.verifyResultMessageDisplay("Yes", "Yes Not Match");
    }

    @Test
    public void clickNoTest() {
        eRQ.clickNo();
    }

}
