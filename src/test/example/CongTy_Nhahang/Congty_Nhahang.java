package CongTy_Nhahang;

import SetUp.SetUp;
import SetUp.Obj;
import SetUp.DataFake;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Congty_Nhahang extends SetUp {

    Obj obj = new Obj();
    DataFake dataFaker = new DataFake();

    @Test
    public void CreateRestaurant() throws InterruptedException {
        login();

        WebElement dropdownElement = driver.findElement(obj.headermenuRes);
        moveToElement(dropdownElement, driver);
        clickElement(obj.menuResaurant);
        clickElement(obj.btnCloseListResOutOfmoney);
        clickElement(obj.btnAddnewRestaurant);

        setText(obj.restaurantNameInput, dataFaker.companyName);
        Thread.sleep(1000);
        setText(obj.restaurantPhoneInput, dataFaker.phoneNumber);
        setText(obj.restaurantMailInput, dataFaker.email);

        clickElement(obj.selectTrialOrofficialRes);
        clickElement(obj.selectTrialRes);
        clickElement(obj.selectCityRes);
        clickElement(obj.cityRes);
        clickElement(obj.selectDistrictRes);
        clickElement(obj.districtRes);
        clickElement(obj.selectWardRes);
        clickElement(obj.wardRes);

        setText(obj.addressResInput, dataFaker.address);
        clickElement(obj.createResBtn);
        Thread.sleep(2000);


    }


}
