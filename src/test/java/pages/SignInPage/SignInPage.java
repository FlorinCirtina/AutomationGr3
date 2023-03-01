package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By logo = By.id("logo");
    private By signInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
    private By emailField = By.id("email");
    private By nextButton = By.id("enterimg");

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(signInButton).click();
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if 'Skip Sign in' is displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(skipSignInButton).click();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if Email field is displayed");
        return driver.findElement(emailField).isDisplayed();
    }

    public void typeInEmailField(String email){
        LOG.info("Check email field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickNextButton(){
        LOG.info("Click Next button");
        driver.findElement(nextButton).click();
    }
}
