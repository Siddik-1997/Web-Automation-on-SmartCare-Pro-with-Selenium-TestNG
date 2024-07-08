package runner;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.FacilityPage;
import pages.PatientPage;
import utils.Setup;

public class TestRunner extends Setup {
    BasePage basePage;
    FacilityPage facilityPage;
    PatientPage patientPage;

    @Test(priority = 1, description = "User login with valid credentials")
    public void doLogin() {
        basePage = new BasePage(driver);
        basePage.doLogin("tester", "tester2023!");

    }

    @Test(priority = 2)
    public void selectFacility() throws InterruptedException {
        facilityPage = new FacilityPage(driver);
        Thread.sleep(300);
        facilityPage.selectFacility();
    }

    @Test(priority = 3)
    public void searchPatient() throws InterruptedException {
        patientPage = new PatientPage(driver);
        patientPage.searchPatient();
    }
}
