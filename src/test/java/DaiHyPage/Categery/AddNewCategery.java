package DaiHyPage.Categery;

import Keywords.TemplateElement;
import TestcaseDaiHy.LoginTest;
import helpers.DataFake;
import org.openqa.selenium.By;
import helpers.DataScript;

import static Keywords.WebUi.*;


public class AddNewCategery {
    DataFake dataFake = new DataFake();

    String URL = "https://beta.daihy.ohqsoft.com/category-food-data";
    By addNewButton = By.xpath("//*[@id='table-enable-category-food-data_wrapper']/div[1]/div[2]/div/label");

    By categeryName = By.id("name-create-category-food-data");

    By categeryDec = By.id("description-create-category-food-data");
    By save = By.xpath("//*[@id=\"modal-create-category-food-data\"]/div/div/div[3]/div");


    LoginTest login = new LoginTest();
    TemplateElement tem = new TemplateElement();



    public void addNewSucces() {
        login.loginPass();
        navi(URL);
        clickElement(addNewButton);
        setText(categeryName, "Danh mục" + dataFake.companyName);
        setText(categeryDec, dataFake.companyName);
        clickElement(save);
        waitForElementVisible(tem.notifyTitle);
        verifyNotiAfterAction(tem.notifyTitle,"Thêm mới thành công !" );
    }

    public void addNewExist() {
        String name = "Danh mục Baumbach Group";
        String transform = DataScript.transformText(name);
        login.loginPass();
        navi(URL);
        clickElement(addNewButton);
//        setText(categeryName, "Danh mục" + dataFake.companyName);
        setText(categeryName, name);
        setText(categeryDec, dataFake.companyName);
        clickElement(save);
        waitForElementVisible(tem.notifyContent);
        verifyNotiAfterAction(tem.notifyContent,"Mã " + transform + " và tên " + name + " đã tồn tại, vui lòng chỉnh sửa thành mã và tên khác");
    }


}
