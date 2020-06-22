package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String username, String password) {
        setById("email", "sezen.kaya@n11.com");
        setById("password", "*110277*Sk*Sk*");
        clickBy(By.id("loginButton"));

        return this;
    }

    public LoginPage search(String keyword) {
        setById("searchData", keyword);
        clickBy(By.className("searchBtn"));

        return this;


    }
}
