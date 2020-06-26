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
        setById("password", "******");
        clickBy(By.id("loginButton"));

        return this;
    }

    public LoginPage search(String keyword) {
        setById("searchData", keyword);
        clickBy(By.className("searchBtn"));

        return this;


    }


    public LoginPage addAddress(String fullName, String countryCode , String cityId , String districtId , String neighbourhoodId , String postalCode , String addressDetail , String gsm , String tcNO , String addressName)  {
        setById("fullName", "Sezen Kaya");
        clickBy(By.id("countryCode"));
        clickBy(By.id("cityId"));
        clickBy(By.id("districtId"));
        clickBy(By.id("neighbourhoodId"));
        setById("postalCode" , "34750");
        setById("addressDetail" , "sfsdfd gsdfdsf vsdfsdfds sffsfffdffds");
        setById("gsm", "5328765645");
        setById("tcNO", "30435525502");
        setById("addressName" , "Yeni");
        return this;
    }



}
