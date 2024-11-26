package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver=driver;
    }

    By home = By.xpath("//span[text()='Home']");
    By fileAnAppeal = By.xpath("//span[text()='File An Appeal']");
    By yourRights = By.xpath("//span[text()='Your Rights']");
    By pricing = By.xpath("//span[text()='Pricing']");
    By aboutUs = By.xpath("//span[text()='About Us']");
    By insuranceNews = By.xpath("//span[text()='Insurance News']");
    By signIn = By.xpath("(//a[@href='signin.html'])[3]");
    By appealNow = By.xpath("//a[@href='signup.html']");
    By learnMore = By.xpath("//a[@href='signup.html']/following-sibling::a[1]");
    By learnMoreButton = By.linkText("Learn More");

    public void homeButton(){
        driver.findElement(home).click();
    }
    public void fileAnAppealButton(){
        driver.findElement(fileAnAppeal).click();
    }
    public void yourRightsButton(){
        driver.findElement(yourRights).click();
    }
    public void pricingButton(){
        driver.findElement(pricing).click();
    }
    public void aboutUsButton(){
        driver.findElement(aboutUs).click();
    }
    public void insuranceNewsButton(){
        driver.findElement(insuranceNews).click();
    }
    public void signInButton(){
        driver.findElement(signIn).click();
    }
}
