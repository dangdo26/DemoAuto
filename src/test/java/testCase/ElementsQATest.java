package testCase;

import common.BaseTest;
import helpers.DataFake;
import org.testng.annotations.Test;
import page.ElementsTextQAPage;

public class ElementsQATest extends BaseTest {

    ElementsTextQAPage eQP = new ElementsTextQAPage();
    DataFake dtFake = new DataFake();


    // Text Box Test
    @Test
    public void submitFormTextBox() {
        eQP.submitTextBox(dtFake.name, dtFake.email, dtFake.address, dtFake.address);
        eQP.verifyNameMessageDisplay("Name:" + dtFake.name, "Name Not Match");
        eQP.verifyNameMessageDisplay("Email:" + dtFake.email, " Email Not Match");
        eQP.verifyNameMessageDisplay("Current Address :" + dtFake.address, "Current Address Not Match");
        eQP.verifyNameMessageDisplay("Permananet Address :" + dtFake.address, "Permananet Address Not Match");

    }



}
