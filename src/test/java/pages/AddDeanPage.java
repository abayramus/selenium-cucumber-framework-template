package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class AddDeanPage {

    // Constructor to initialize the WebDriver
    public AddDeanPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // CSS locators
    private By loginLink = By.cssSelector("a[href='/login']");
    private By menuButton = By.cssSelector("button[class='fw-semibold text-white bg-primary navbar-toggler collapsed']");
    private By deanManagementButton = By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > a:nth-child(2)");
    private By usernameBox = By.cssSelector("#username");
    private By passwordBox = By.cssSelector("#password");
    private By loginButton = By.cssSelector("button[class='fw-semibold btn btn-primary']");
    private By name = By.cssSelector("#name");
    private By surname = By.cssSelector("#surname");
    private By birthPlace = By.cssSelector("#birthPlace");
    private By genderFemale = By.cssSelector("input[value='FEMALE']");
    private By genderMale = By.cssSelector("input[value='MALE']");
    private By birthDay = By.cssSelector("#birthDay");
    private By phoneNumber = By.cssSelector("#phoneNumber");
    private By ssn = By.cssSelector("#ssn");
    private By username = By.cssSelector("#username");
    private By deanPassword = By.cssSelector("#password");
    private By deanSubmit = By.cssSelector(".btn-primary");
    private By deanSavedPopUp = By.xpath("//*[.='Dean Saved']");

    // Reusable methods
    public void setUsername(String username) {
        Driver.getDriver().findElement(usernameBox).sendKeys(username);
    }

    public void setPassword(String password) {
        Driver.getDriver().findElement(passwordBox).sendKeys(password);
    }

    public void clickOnLoginButton() {
        Driver.getDriver().findElement(loginButton).click();
    }

    public void clickOnMenu() {
        Driver.getDriver().findElement(menuButton).click();
    }

    public void clickOnDeanManagement() {
        Driver.getDriver().findElement(deanManagementButton).click();
    }

    public void enterDeanName(String name) {
        Driver.getDriver().findElement(this.name).sendKeys(name);
    }

    public void enterDeanSurName(String surname) {
        Driver.getDriver().findElement(this.surname).sendKeys(surname);
    }

    public void enterBirthPlace(String birthplace) {
        Driver.getDriver().findElement(birthPlace).sendKeys(birthplace);
    }

    public void enterDeanGender(String gender) {
        if (gender.equalsIgnoreCase("female")) {
            Driver.getDriver().findElement(genderFemale).click();
        } else {
            Driver.getDriver().findElement(genderMale).click();
        }
    }

    public void enterBirthDay(String birthday) {
        Driver.getDriver().findElement(birthDay).sendKeys(birthday);
    }

    public void enterPhone(String phone) {
        Driver.getDriver().findElement(phoneNumber).sendKeys(phone);
    }

    public void enterSSN(String ssn) {
        Driver.getDriver().findElement(this.ssn).sendKeys(ssn);
    }

    public void enterUsername(String username) {
        Driver.getDriver().findElement(this.username).sendKeys(username);
    }

    public void enterDeanPassword(String password) {
        Driver.getDriver().findElement(deanPassword).sendKeys(password);
    }

    public void clickOnDeanSubmit() {
        Driver.getDriver().findElement(deanSubmit).click();
    }

    public void verifyDeanRegistration() {
        WebElement popUp = Driver.getDriver().findElement(deanSavedPopUp);
        assertTrue(popUp.isDisplayed());
    }
    public void verifyDeanRegistration(String message) {
        WebElement popUp = Driver.getDriver().findElement(deanSavedPopUp);
        assertTrue(popUp.isDisplayed());
        assertTrue(popUp.getText().equals(message));
    }
}

