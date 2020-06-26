package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;


    public void baseStep(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver 3");
        driver = new ChromeDriver();
    }

    @Before
    public void before() throws InterruptedException {

        baseStep();
        driver.get("https://www.n11.com");

    }

    @After
    public void after(){

        driver.quit();
    }
}
