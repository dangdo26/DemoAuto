package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Obj {
    public By restaurantNameInput = By.id("name_restaurant");
    public By restaurantPhoneInput = By.id("phone_restaurant");
    public By restaurantMailInput = By.id("email_restaurant");
    public By selectCityRes = By.id("select2-select-city-create-restaurant-container");
    public By selectDistrictRes = By.id("select2-select-district-create-restaurant-container");
    public By selectWardRes = By.id("select2-select-ward-create-restaurant-container");
    public By addressResInput = By.id("address_restaurant");
    public By createResBtn = By.id("btn-save-create-restaurant");


    public By usernameInput = By.name("username");
    public By passwordInput = By.name("password");

    public By  headermenuRes =  By.xpath("//*[@id=\"new_header\"]/div/div[1]/nav/ul/li[2]/a/em");
    public By loginButton = By.xpath("//*[@id=\"login-form\"]/div/div[3]/button");

    public By menuResaurant = By.xpath("//*[@id=\"new_header\"]/div/div[1]/nav/ul/li[2]/ul/li[1]/a");
    public By btnCloseListResOutOfmoney = By.xpath("//*[@id=\"modal-get-list-restaurant-out-of-money\"]/div/div/div[3]/button");
    public By btnAddnewRestaurant = By.xpath("//*[@id=\"restaurant-enable_wrapper\"]/div[1]/div[2]/div/label/button");
    public By selectTrialOrofficialRes = By.id("select2-select-create-restaurant-is-trial-container");
    public By selectTrialRes = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[5]/span/span/span[2]/ul/li[2]");
    public By cityRes = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[5]/span/span/span[2]/ul/li[2]");
    public By districtRes = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[5]/span/span/span[2]/ul/li[2]");
    public By wardRes = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[5]/span/span/span[2]/ul/li[2]");






}
