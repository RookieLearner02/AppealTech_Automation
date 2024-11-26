package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private LandingPage landingPage;
    private WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage getLandingPage(){
        landingPage = new LandingPage(driver);
        return landingPage;
    }
}
