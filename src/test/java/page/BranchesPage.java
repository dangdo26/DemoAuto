package page;

import constant.ConstantGlobal;
import helpers.DataFake;
import org.openqa.selenium.By;
import testCase.LoginTest;

import static Keywords.WebUi.*;
public class BranchesPage {

    DataFake datafake = new DataFake();
    String URL = "https://" + ConstantGlobal.ENVIRONMENT + ".admin.techres.vn/branch-restaurant";

    public By selectBranch = By.xpath("//*[@id=\"tab-enable-branch-restaurant\"]/div/div[1]/div[1]/div/select");
    public By menuCustomer = By.className("icofont-building-alt");
    public By subMenuBranch = By.xpath("//*[@id=\"new_header\"]/div/div[1]/nav/ul/li[2]/ul/li[5]/a");
    public By selectBrand = By.className("select-brand-branch-restaurant");
    public By addNewbtn = By.className("createBranchRestaurantManager");
    public By branchNameInput = By.className("name-branch-create-branch-restaurant");
    public By branchPhoneInput = By.className("phone-branch-create-branch-restaurant");
    public By branchAvgAmountInput = By.className("avg-amount-branch-create-branch-restaurant");
    public By selectCity = By.id("select-city-create-branch");
    public By selectDistrict = By.className("select-district-create-branch-setting-first");
    public By selectWard = By.className("select-ward-create-branch-setting-first");
    public By addressInput = By.className("address-branch-create-branch-setting-restaurant");
    public By addressSelect = By.id("box-search-address-create-branch-setting-restaurant");
    public By brand = By.id("select2-selection--single");




LoginTest login = new LoginTest();

    public void addNewBranch(){
        login.LoginTestPass();
        clickElement(menuCustomer);
        clickElement(subMenuBranch);
        selectTextInDropdown(selectBranch, "nhà hàng Mười Dễ");
//        waitForElementRefresh(brand);
        sleep(3);
        selectTextInDropdown(selectBrand, "thương hiệu 1");
        clickElement(addNewbtn);
        setText(branchNameInput, datafake.name );
        setText(branchPhoneInput, datafake.phoneNumber);
        setText(branchAvgAmountInput, "100000");
        selecIndexInDropdown(selectCity, 1);
        waitForElementRefresh(selectDistrict);
        selecIndexInDropdown(selectDistrict, 1);
        waitForElementRefresh(selectWard);
        selecIndexInDropdown(selectWard, 1);
        selectAddressByInputGGmap(addressInput, "303", addressSelect);

        sleep(5);



    }






}
