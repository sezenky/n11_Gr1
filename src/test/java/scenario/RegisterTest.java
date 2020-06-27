package scenario;

import base.BasePage;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.RegisterPage;

import java.util.ArrayList;
import java.util.List;

public class RegisterTest extends BaseTest {
    @Override
    public void before() throws InterruptedException {
        super.baseStep();
        driver.get("https://qa.n11.com/");
    }

    @Test
    public void registerTest() throws InterruptedException {
//
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.registerPageInformations("mel","kfnnkel","addgud@gmail.com","123qwe",1
                ,"1222","6","Mart","1995");









    }
}
