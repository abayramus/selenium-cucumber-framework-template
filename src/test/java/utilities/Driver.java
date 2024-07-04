package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ThreadGuard;

import java.time.Duration;

/*
NOTE: all of our current codes still works, because this driver is class is good for squential and parallel testing
 */
public class Driver {
    private Driver() {
    }

    //    private static WebDriver driver;
//    1. Use ThreadLocal WebDriver for parallel testing.
//    Type of the driver is still WebDriver, but this driver is now ThreadLocal
//    driver is thread safe variable to make sure each thread can create a copy of its own driver instance
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    //    2 Driver.getDriver() will be used in the test classes
//    This will return copy of the driver instance for each thread(browser)
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            initializeDriver();
        }
        return driver.get();
    }

    //    3. initialize the WebDriver instance
    public static void initializeDriver() {
        switch (ConfigReader.getProperty("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
//                    driver=new ChromeDriver();
                driver.set(ThreadGuard.protect(new ChromeDriver()));
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver.set(ThreadGuard.protect(new FirefoxDriver()));
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver.set(ThreadGuard.protect(new EdgeDriver()));
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver.set(ThreadGuard.protect(new SafariDriver()));
                break;
            case "chrome-headless":
                WebDriverManager.chromedriver().setup();
                driver.set(ThreadGuard.protect(new ChromeDriver(new ChromeOptions().addArguments("--headless=new"))));
                break;
        }

//            driver -> driver.get()
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get().manage().window().maximize();
    }

    //    4. close driver
    public static void closeDriver() {
        if (driver != null) {
            driver.get().quit();
            driver.remove();
        }
    }

}

