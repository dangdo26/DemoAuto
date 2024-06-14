package page;

import constant.ConstantGlobal;
import org.openqa.selenium.By;
import testCase.LoginTest;

import static Keywords.WebUi.*;
public class BranchesPage {
    String URL = "https://" + ConstantGlobal.ENVIRONMENT + ".admin.techres.vn/branch-restaurant";

    public By selectBranch = By.xpath("//*[@id=\"tab-enable-branch-restaurant\"]/div/div[1]/div[1]/div/select");
    public By menuCustomer = By.className("icofont-building-alt");
    public By subMenuBranch = By.xpath("//*[@id=\"new_header\"]/div/div[1]/nav/ul/li[2]/ul/li[5]/a");


LoginTest login = new LoginTest();

    public void addNewBranch(){
        login.LoginTestPass();
        clickElement(menuCustomer);
        clickElement(subMenuBranch);
        selectTextInDropdown(selectBranch, "nhà hàng Mười Dễ");
        sleep(5);



    }






}
