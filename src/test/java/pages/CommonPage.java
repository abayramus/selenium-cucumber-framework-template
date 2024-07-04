package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {

    public CommonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    private By menuButton = By.cssSelector(".header_link.ms-2");
    private By username = By.cssSelector("#username");
    private By password = By.cssSelector("#password");
    private By loginButton = By.cssSelector("button[class='fw-semibold btn btn-primary']");


    public void login(String email,String password) {
        Driver.getDriver().findElement(menuButton).click();
        Driver.getDriver().findElement(username).sendKeys(email);
        Driver.getDriver().findElement(this.password).sendKeys(password);
        Driver.getDriver().findElement(loginButton).click();
    }

}
