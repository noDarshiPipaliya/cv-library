package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitle;

    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void alertaccept() {
        alertaccept();
    }

    public void enterJobTitle(String jobTitle) {
        clickOnElement(jobtitle);
    }

    public void enterLocation(String location) {
        clickOnElement(Location);
    }

    public void selectDistance(String distance) {
        clickOnElement(distanceDropDown);
        selectByValueFromDropDown(By.xpath("//select[@id='distance']"),"2");
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        clickOnElement(salaryMin);
    }

    public void enterMaxSalary(String maxSalary) {
        clickOnElement(salaryMax);
    }

    public void selectSalaryType(String sType) {
        clickOnElement(salaryTypeDropDown);
        selectByValueFromDropDown(By.xpath("//select[@id='salarytype']"),"month");
    }

    public void selectJobType(String jobType) {
        clickOnElement(jobTypeDropDown);
        selectByValueFromDropDown(By.xpath("//select[@id='tempperm']"),"Permanent");
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }

}
