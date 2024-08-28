package TestcaseDaiHy.Categery_PartySet;

import DaiHyPage.Categery.AddNewCategery;
import DaiHyPage.Categery_PartySet.AddNewCategery_PartySet;
import common.BaseTest;
import org.testng.annotations.Test;

public class AddNewCategeryPartyTest extends BaseTest {


    AddNewCategery_PartySet add = new AddNewCategery_PartySet();

    @Test
    public void addNewPass(){
        add.addNewSucces();

    }
    @Test
    public void addNewExist(){
        add.addNewExist();
    }
}
