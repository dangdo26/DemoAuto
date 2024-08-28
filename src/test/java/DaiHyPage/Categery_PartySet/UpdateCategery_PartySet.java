package DaiHyPage.Categery_PartySet;

import Keywords.TemplateElement;
import TestcaseDaiHy.LoginTest;
import constant.ConstantGlobal;
import helpers.DataFake;
import helpers.DataScript;
import org.openqa.selenium.By;

import static Keywords.WebUi.*;


public class UpdateCategery_PartySet {
    DataFake dataFake = new DataFake();

    String URL = "https://" + ConstantGlobal.ENVIRONMENT +".daihy.ohqsoft.com/category-set-party-data";
    By updateButton = By.xpath("//*[@id=\"table-enable-category-set-party\"]/tbody/tr[1]/td[4]/div/button[2]");
    By categeryName = By.id("name-update-category-food-data");

    By categeryDec = By.id("description-update-category-food-data");
    By save = By.xpath("//*[@id=\"modal-update-category-set-party-data\"]/div/div/div[3]/div");


    LoginTest login = new LoginTest();
    TemplateElement tem = new TemplateElement();



    public void updateSucces() {
        login.loginPass();
        navi(URL);
        clickElement(updateButton);
        setText(categeryName, getAttributeElement(categeryName,"value"));
        setText(categeryDec, getAttributeElement(categeryDec,"value"));
        clickElement(save);
        waitForElementVisible(tem.notifyTitle);
        verifyNotiAfterAction(tem.notifyTitle,"Chỉnh sửa thành công !" );
    }



    // Chưa có API
//    public void addNewExist() {
//        String name = "Hạng mục" + dataFake.name ;
//        String transform = DataScript.transformText(name);
//        login.loginPass();
//        navi(URL);
//        clickElement(addNewButton);
//        setText(categeryName, name);
//        setText(categeryDec, dataFake.name);
//        clickElement(save);
//        waitForElementVisible(tem.notifyContent);
//        verifyNotiAfterAction(tem.notifyContent,"Mã " + transform + " và tên " + name + " đã tồn tại, vui lòng chỉnh sửa thành mã và tên khác");
//    }


}
