package scenario;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        Thread.sleep(5000);

        //driver.findElement(new By.ByXPath("//a[@class='btn btnGrey btnAddBasket']")).click();


    }


}







