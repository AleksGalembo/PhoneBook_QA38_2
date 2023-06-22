package tests;

import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class TestBase {

    static ApplicationManager app = new ApplicationManager();
    //создание объекта позволяет получить доступ к классу аппликейшен менеджер и к его полям

////    WebDriver wd;
////
    @BeforeSuite
    public void setUp(){
        app.init();

    }

    @AfterSuite
    public void stop(){
      app.tearDown();
    }

}