package DaiHyPage.Categery_PartySet;

import Keywords.TemplateElement;
import TestcaseDaiHy.LoginTest;
import constant.ConstantGlobal;
import org.openqa.selenium.By;

import static Keywords.WebUi.*;


public class ChangeStatusCategery_PartySet {

    String URL = "https://" + ConstantGlobal.ENVIRONMENT + ".daihy.ohqsoft.com/category-food-data";

    By iconDisable = By.xpath("//*[@id=\"table-enable-category-food-data\"]/tbody/tr[1]/td[5]/div/button[1]");
    By iconEnable = By.xpath("//*[@id=\"table-disable-category-food-data\"]/tbody/tr[1]/td[5]/div/button[1]");
    By confirmButton = By.className("swal2-confirm");
    By disableStatus = By.id("tab-category-disable-data");
    TemplateElement tem = new TemplateElement();

    LoginTest login = new LoginTest();


    public void disableSuccess() {
        login.loginPass();
        navi(URL);
        clickElement(iconEnable);
        waitForElementVisible(confirmButton);
        clickElement(confirmButton);
        waitForPerFormText(tem.notifyTitle,"Tạm ngưng thành công !");
        verifyNotiAfterAction(tem.notifyTitle, "Tạm ngưng thành công !");
    }

    public void enableSuccess() {
        login.loginPass();
        navi(URL);
        clickElement(disableStatus);
        waitForElementVisible(iconEnable);
        clickElement(iconEnable);
        waitForElementVisible(confirmButton);
        clickElement(confirmButton);
        waitForPerFormText(tem.notifyTitle,"Bật hoạt động thành công !");
        verifyNotiAfterAction(tem.notifyTitle, "Bật hoạt động thành công !");
    }


}
