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
    public By selectCity = By.id("select2-select-city-create-branch-container");
    public By selectCityInDropdown = By.className("select2-results__option");


    public By selectDistrict = By.className("select2-selection__rendered");
    public By selectDistrict1 = By.id("select-district-create-branch-setting-first");
    public By selectWard = By.id("select2-yvpj-container");
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
        clickInDropdown(selectCity, selectCityInDropdown ,2);

//        waitForPerFormText(selectDistrict, "Vui lòng chọn");
sleep(1);
        clickInDropdown(selectDistrict1,selectCityInDropdown ,1);
//        waitForElementRefresh(selectWard);
//        waitForPerFormText(selectDistrict, "Vui lòng chọn");
        sleep(1);
        clickInDropdown(selectWard,selectCityInDropdown ,1);
        selectAddressByInputGGmap(addressInput, "303", addressSelect);

        sleep(5);



    }






}
