package TestcaseDaiHy.Categery;

import DaiHyPage.Categery.AddNewCategery;
import common.BaseTest;
import org.testng.annotations.Test;

public class AddNewCategeryTest extends BaseTest {


    AddNewCategery add = new AddNewCategery();

    @Test
    public void addNewPass(){
        add.addNewSucces();

    }
    @Test
    public void addNewExist(){
        add.addNewExist();
    }
}
