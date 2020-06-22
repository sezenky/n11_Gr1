package scenario;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import page.HomePage;

public class TestFullRun extends BaseTest {

    @Test
    public void fullTest() {

        new HomePage(driver)
                .callLoginPage()
                .login("", "")
                .search("Lenovo y 700")
                .clickBy(By.id("p-416248653"));


    }


}
