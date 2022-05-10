package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @FindBy(xpath = "//body/main[@id='site-main']/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")
    WebElement resultText;

    public void verifyTheResults(String expected){
        clickOnElement(resultText);
    }


}
