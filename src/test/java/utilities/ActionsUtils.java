package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtils {

    //    ACTIONS_RIGHT CLICK
    public static void actionsRightClickOnElement(WebElement element) {
        new Actions(Driver.getDriver()).contextClick(element).perform();
    }

    //ACTIONS_DOUBLE CLICK
    public static void actionsDoubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    //    ACTIONS_HOVER_OVER
    public static void actionsHoverOverOnElement(WebElement element) {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).moveToElement(element).perform();
    }

    //    ACTIONS_SCROLL_DOWN
    public static void actionsScrollDown() {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
    }

    //    ACTIONS_SCROLL_UP
    public static void actionsScrollUp() {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_UP).perform();
    }

    //    ACTIONS_SCROLL_RIGHT
    public static void actionsScrollRight() {
        new Actions(Driver.getDriver()).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).perform();
    }

    //    ACTIONS_SCROLL_LEFT
    public static void actionsScrollLeft() {
        new Actions(Driver.getDriver()).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).perform();
    }

    //    ACTIONS_DRAG_AND_DROP
    public static void actionsDragAndDrop(WebElement source, WebElement target) {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).dragAndDrop(source, target).perform();
    }

    //    ACTIONS_DRAG_AND_DROP_BY
    public static void actionsDragAndDrop(WebElement source, int x, int y) {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).dragAndDropBy(source, x, y).perform();
    }

    //    ACTIONS_TAB
    public static void actionsTab(WebElement element) {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).sendKeys(Keys.TAB).build().perform();
    }
}
