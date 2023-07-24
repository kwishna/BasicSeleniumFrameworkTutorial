package com.example.tests;

import com.examples.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
        
        HomePage homePage = new HomePage(driver);
        homePage.submitForm();

        driver.findElement(By.xpath("//XPATH"));
        System.out.println("test1");
    }

    @Test(dependsOnMethods = "test2", alwaysRun = true, groups = {"smoke", "regression"}, timeOut = 5000, priority = 10)
    public void test2() {
        System.out.println("test2");
    }
}
