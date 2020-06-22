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
    public void searchTest() throws InterruptedException {

        new HomePage(driver)
                .search("Lenovo y 700")
                .clickBy(new By.ByXPath("//div[@id='p-379173268']//img[@class='lazy']"));
        Thread.sleep(5000);
        driver.findElement(new By.ByXPath("//a[@class='btn btnGrey btnAddBasket']")).click();


    }




}
