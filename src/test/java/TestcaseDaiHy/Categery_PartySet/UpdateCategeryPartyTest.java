package TestcaseDaiHy.Categery_PartySet;

import DaiHyPage.Categery_PartySet.AddNewCategery_PartySet;
import DaiHyPage.Categery_PartySet.UpdateCategery_PartySet;
import common.BaseTest;
import org.testng.annotations.Test;

public class UpdateCategeryPartyTest extends BaseTest {


    UpdateCategery_PartySet add = new UpdateCategery_PartySet();

    @Test
    public void updatePass(){
        add.updateSucces();

    }
//    @Test
//    public void addNewExist(){
//        add.addNewExist();
//    }
}
