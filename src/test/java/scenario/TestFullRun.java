package scenario;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.AddAddress;
import page.BasketPage;
import page.HomePage;

public class TestFullRun extends BaseTest {

    @Test
    public void fullTest() throws InterruptedException {

        new HomePage(driver)
                .callLoginPage()
                .login("", "")
                .search("Lenovo y 700")
                .clickBy(new By.ByXPath("//div[@id='p-379173268']//img[@class='lazy']"));
        Thread.sleep(5000);
        WebElement addBasket = driver.findElement(By.xpath("//a[@class='btn btnGrey btnAddBasket']"));
        addBasket.click();
        WebElement clickBasket = driver.findElement(By.xpath("//i[@class='icon iconBasket']"));
        clickBasket.click();
        //driver.findElement(new By.ByXPath("//a[@class='btn btnGrey btnAddBasket']")).click();
        WebElement newAdress = driver.findElement(By.xpath("//div[8]//div[3]//p[1]"));
        newAdress.click();
        Thread.sleep(5000);
        new BasketPage(driver)
                .addAddress("","","","","","","","","","")
                .clickBy(By.xpath("//span[@class='btn btnBlack js-saveAddressBtn']"));
        Thread.sleep(5000);



    }


}






