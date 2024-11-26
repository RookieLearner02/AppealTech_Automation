package stepDefinitions;

import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;
import utils.*;

public class SignUpStepDefinition {
    private WebDriver driver;
    TestContextSetup testContextSetup;
    private LandingPage landingPage;

    public SignUpStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.landingPage=testContextSetup.pageObjectManager.getLandingPage();
    }
}
