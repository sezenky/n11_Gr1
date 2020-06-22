package scenario;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import page.HomePage;
import page.ProductDetailPage;


public class Test1 extends BaseTest {

    @Test
    public void loginTest() {

        new HomePage(driver)
                .callLoginPage()
                .login("", "");


    }

    @Test
    public void searchTest() {

        new HomePage(driver)
                .search("Lenovo y 700")
                .clickBy(By.id("p-416248653"));

    }

    @Test
    public void addBasket() {

        new ProductDetailPage(driver)
                .productDetailPage().clickBy(By.className("btnAddBasket"));


    }


}
