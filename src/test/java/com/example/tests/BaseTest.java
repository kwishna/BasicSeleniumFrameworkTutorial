package com.example.tests;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) {
        System.out.println("Before Class");
        switch (browser) {
            case "chrome":

                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

                ChromeOptions ops = new ChromeOptions();
                ops.addArguments("--headless");
                ops.addArguments("--start-maximized");
                ops.setImplicitWaitTimeout(Duration.ofSeconds(10));
                ops.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
                driver = new ChromeDriver(ops);
                break;

            case "edge":
                EdgeOptions e_ops = new EdgeOptions();
                driver = new EdgeDriver(e_ops);
                break;

            case "firefox":
                FirefoxOptions f_ops = new FirefoxOptions();
                driver = new FirefoxDriver(f_ops);
                break;
        }

        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
