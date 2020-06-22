package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAddress extends BasePage {



    public AddAddress(WebDriver driver) {
        super(driver);
    }



    public AddAddress addAddress(String fullName, String countryCode , String cityId , String districtId , String neighbourhoodId , String postalCode , String addressDetail , String gsm , String tcNO , String addressName)  {
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

    private void setById(String s) {

    }

}
