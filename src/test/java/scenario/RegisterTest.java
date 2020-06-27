package scenario;

import base.BasePage;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    @Override
    public void before() throws InterruptedException {
        super.baseStep();
        driver.get("https://qa.n11.com/");
    }

    @Test
    public void registerTest() throws InterruptedException {
        Thread.sleep(5000);
        BasePage basePage=new BasePage(driver);
        basePage.clickBy(By.className("btnSignUp"));

        basePage.clickBy(By.xpath("//*[@class='button medium black']"));
        Thread.sleep(5000);
        //basePage.clickBy(By.className("container container_1180"));
        //basePage.clickBy(By.className("closeBtn closePopup"));

        basePage.setById("firstName","melih");
        basePage.setById("lastName","güldal");
        basePage.setById("registrationEmail","yenimail@n11.com");
        basePage.setById("registrationPassword","123Qwe123");
        basePage.setById("passwordAgain","123Qwe123");
        basePage.clickBy(By.className("genderArea-two-line"));
        Thread.sleep(5000);

        basePage.setById("phoneNumber","323443333");
        Thread.sleep(5000);
        /*ArrayList<WebElement> elements = new ArrayList<WebElement>(basePage.driver.findElements(By.id("birthDay")));
        for(WebElement element:elements)
            System.out.println(element);

*/

        //By.xpath("//*[@id='birthDay']")
        basePage.selectFromDropDownList(By.xpath("//*[@id='birthDay']"),"1");
        Thread.sleep(5000);

        basePage.selectFromDropDownList(By.xpath("//*[@id='birthMonth']"),"Mart");
        Thread.sleep(5000);

        basePage.selectFromDropDownList(By.xpath("//*[@id='birthYear']"),"1990");

        Thread.sleep(5000);






    }
}
