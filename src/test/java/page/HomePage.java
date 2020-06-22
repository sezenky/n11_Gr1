package page;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        clickBy(By.className("closeBtn"));
    }

    public HomePage search(String keyword){
        setById("searchData",keyword);
        clickBy(By.className("searchBtn"));

        return this;
    }

    public LoginPage callLoginPage(){
        clickBy(By.className("btnSignIn"));
        return new LoginPage(driver);
    }

    public HomePage callProductDetailPage() {
        clickBy(By.className("btnAddBasket"));
       return this ;

    }


}
