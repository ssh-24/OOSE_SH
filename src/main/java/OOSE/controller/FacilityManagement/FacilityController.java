package OOSE.controller.FacilityManagement;

import OOSE.Database.*;

public class FacilityController {
    FacilityDBManager dbManager = new FacilityDBManager();

    boolean facilityRegister(String s) {
        dbManager.registerFacilityInfo(s);
        return false;
    }

    boolean facilityModify(String s) {
        dbManager.modifyFacilityInfo(s);
        return false;
    }

    boolean facilityDelete(String s) {
        dbManager.deleteFacilityInfo(s);
        return false;
    }

    String[] facilityBrowse() {
        return dbManager.browseFacilityInfo();
    }

    void identifyReqView(String s, int n) {

    }
}
