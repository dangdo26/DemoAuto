package page;

import org.openqa.selenium.By;

import static Keywords.WebUi.*;

public class ElementsWebTabletQAPage {
    String URL = "https://demoqa.com/webtables";

    public By addNewbtn = By.id("addNewRecordButton");
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By userEmailInput = By.id("userEmail");
    public By ageInput = By.id("age");
    public By salaryInput = By.id("salary");
    public By departmentInput = By.id("department");
    public By submitBtn = By.id("submit");
    public By table = By.className("rt-table");
    public By row = By.className("rt-tr-group");
    public By cell = By.className("rt-td");

    //rt-tr-group rt-td


//    public void verifyDataDisplayAfterAddNew(String expected, String message, String e ) {
//        getRowCount(table);
//        Assert.assertTrue(getWebElement(currentAddressMessage).isDisplayed(), "FAIL. Error message no displays.");
//        Assert.assertEquals(getTextElement(currentAddressMessage), expected, message);
//    }

    public int getRowCountTable() {
//        getRowCount(table, row, cell);
        return getRowCount(table, row, cell);
    }

    public void enterAddNewBtn() {
        clickElement(addNewbtn);
    }

    public void enterFirstName(String firstName) {
        setText(firstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        setText(lastNameInput, lastName);
    }

    public void enterUserEmail(String userEmail) {
        setText(userEmailInput, userEmail);
    }

    public void enterAge(String age) {
        setText(ageInput, age);
    }

    public void enterSalary(String salary) {
        setText(salaryInput, salary);
    }

    public void enterDepartment(String department) {
        setText(departmentInput, department);
    }

    public void enterSubmit() {
        clickElement(submitBtn);
    }

    public int initialRowCount;

    public void submitNewForm(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        openURL(URL);
        initialRowCount = getRowCountTable();
        enterAddNewBtn();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterUserEmail(userEmail);
        enterAge(age);
        enterSalary(salary);
        enterDepartment(department);
        enterSubmit();

    }


}
