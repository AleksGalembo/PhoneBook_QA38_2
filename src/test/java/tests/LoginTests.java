package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @BeforeMethod
    public void precondition(){
        if(app.getUser().isLogged())
        {
            app.getUser().logout();
        }
    }


    @Test
    public void loginPositiveTestBase(){
       // String email = "abc@def.com", password = "$Abcdef12345";
    User user = new User ()
            .withEmail("abc@def.com")
            .withPassword("$Abcdef12345");
        app.getUser().openLoginForm();
        app.getUser().fillLoginForm(user.getEmail(), user.getPassword());
        app.getUser().submitLogin();
        app.getUser().pause(3000);
       // Assert.assertTrue(wd.findElements(By.xpath("//button")).size() > 0);
       Assert.assertTrue(app.getUser().isElementPresent
               (By.xpath("//button")));

    }
    @Test
    public void NegativeTestBase(){
        String email = "12455@123.com", password = "$Abcdef12345";

        app.getUser().openLoginForm();
        app.getUser().fillLoginForm(email, password);
        app.getUser().submitLogin();
        app.getUser().pause(3000);
       // Assert.assertTrue(wd.findElements(By.xpath("//button")).size() > 0);
       Assert.assertTrue(app.getUser().isElementPresent
               (By.xpath("//button")));

    }


}