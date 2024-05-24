package testCase;

import common.BaseTest;
import helpers.DataFake;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ElementsWebTabletQAPage;

public class ElementsWebTabletQATest extends BaseTest {

    ElementsWebTabletQAPage eW = new ElementsWebTabletQAPage();
    DataFake dFake = new DataFake();

    @Test
    public void addSucsess() {
        eW.submitNewForm(dFake.name, dFake.name, dFake.email, String.valueOf(dFake.age), "900000", dFake.companyName);
        System.out.println(eW.initialRowCount);
        int currentRowCount = eW.getRowCountTable();
        System.out.println(currentRowCount);
        Assert.assertTrue(currentRowCount == eW.initialRowCount + 1, "Số lượng hàng sau khi thêm phải lớn hơn 1 so với ban đầu");

    }

}
