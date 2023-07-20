package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExampleTest extends BaseTest {

//    WebDriver driver;
//
//    @BeforeTest
//    @Parameters("browser")
//    public void openBrowser(String br) {
//        System.out.println("Before Class");
//        switch (br) {
//            case "chrome":
//                ChromeOptions ops = new ChromeOptions();
//                ops.addArguments("--headless");
//                ops.addArguments("--start-maximized");
//                ops.setImplicitWaitTimeout(Duration.ofSeconds(10));
//                ops.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
//                driver = new ChromeDriver(ops);
//                break;
//
//            case "edge":
//                EdgeOptions e_ops = new EdgeOptions();
//                driver = new EdgeDriver(e_ops);
//                break;
//
//            case "firefox":
//                FirefoxOptions f_ops = new FirefoxOptions();
//                driver = new FirefoxDriver(f_ops);
//                break;
//        }
//
//        driver.get("https://google.com");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//    }

    @Parameters({"browser", "username", "password"})
    @Test(alwaysRun = true, groups = "regression", priority = 0)
    public void test1(@Optional String br, @Optional String uname, @Optional String pass) {
        driver.findElement(By.xpath("//XPATH"));
        System.out.println("test1");
    }


    @Test(dependsOnMethods = "test2", alwaysRun = true, groups = {"smoke", "regression"}, timeOut = 5000, priority = 10)
    public void test2() {
        System.out.println("test2");
    }
}
