package uk.co.library.testsuite;

import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.utility.Utility;

public class JobSearchTest extends Utility {


    HomePage homePage = new HomePage();
    ResultPage loginPage = new ResultPage();

    @Test(groups = {"sanity","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) {
        homePage.alertaccept();
        homePage.enterJobTitle("Automation Tester");
        homePage.enterLocation("Watford");
        homePage.selectDistance("Up to 5 miles");
        homePage.clickOnFindJobsButton();
        homePage.enterMinSalary("20000");
        homePage.enterMaxSalary("70000");
        homePage.selectSalaryType("Per annum");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();


    }


}
