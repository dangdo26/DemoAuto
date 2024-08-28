package DaiHyPage.Categery_PartySet;

import Keywords.TemplateElement;
import TestcaseDaiHy.LoginTest;
import constant.ConstantGlobal;
import helpers.DataFake;
import helpers.DataScript;
import org.openqa.selenium.By;

import static Keywords.WebUi.*;


public class AddNewCategery_PartySet {
    DataFake dataFake = new DataFake();

    String URL = "https://" + ConstantGlobal.ENVIRONMENT +".daihy.ohqsoft.com/category-set-party-data";
    By addNewButton = By.xpath("//*[@id=\"table-enable-category-set-party_wrapper\"]/div[1]/div[2]/div/label/button");

    By categeryName = By.id("name-create-category-set-party-data");

    By categeryDec = By.id("description-create-category-set-party-data");
    By save = By.xpath("//*[@id=\"modal-create-category-set-party-data\"]/div/div/div[3]/div");


    LoginTest login = new LoginTest();
    TemplateElement tem = new TemplateElement();



    public void addNewSucces() {
        login.loginPass();
        navi(URL);
        clickElement(addNewButton);
        setText(categeryName, "Hạng mục " + dataFake.name);
        setText(categeryDec, dataFake.name);
        clickElement(save);
        waitForElementVisible(tem.notifyTitle);
        verifyNotiAfterAction(tem.notifyTitle,"Thêm mới thành công !" );
    }



    // Chưa có API
    public void addNewExist() {
        String name = "Hạng mục" + dataFake.name ;
        String transform = DataScript.transformText(name);
        login.loginPass();
        navi(URL);
        clickElement(addNewButton);
//        setText(categeryName, "Danh mục" + dataFake.companyName);
        setText(categeryName, name);
        setText(categeryDec, dataFake.name);
        clickElement(save);
        waitForElementVisible(tem.notifyContent);
        verifyNotiAfterAction(tem.notifyContent,"Mã " + transform + " và tên " + name + " đã tồn tại, vui lòng chỉnh sửa thành mã và tên khác");
    }


}
