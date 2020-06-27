package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void registerPageInformations(String firstname,String lastname,String email,String password,int genderArea,String phoneNumber,
                                         String dogumGunu,String dogumAyi,String dogumYili) throws InterruptedException
    //
    {
        BasePage basePage=new BasePage(driver);
        basePage.clickBy(By.className("btnSignUp"));
        basePage.clickBy(By.xpath("//*[@class='button medium black']"));
        Thread.sleep(3000);
        basePage.setById("firstName",firstname);
        basePage.setById("lastName",lastname);
        basePage.setById("registrationEmail",email);
        basePage.setById("registrationPassword",password);
        basePage.setById("passwordAgain",password);
        Thread.sleep(3000);

        switch (genderArea){
            case 1:
                basePage.clickBy(By.xpath("//label[@for='genderMale']"));
                break;
            case 2:
                basePage.clickBy(By.xpath("//label[@for='genderFemale']"));
                break;
            default:
                basePage.clickBy(By.className("genderArea-two-line"));
                break;

        }
        Thread.sleep(3000);

        basePage.setById("phoneNumber","323443333");
        basePage.selectFromDropDownList(By.xpath("//*[@id='birthDay']"),dogumGunu);
        basePage.selectFromDropDownList(By.xpath("//*[@id='birthMonth']"),dogumAyi);
        basePage.selectFromDropDownList(By.xpath("//*[@id='birthYear']"),dogumYili);
        basePage.clickBy(By.xpath("//label[@for='acceptContract']"));
        basePage.setById("captchaText","N11");
        Thread.sleep(3000);
        basePage.clickBy(By.id("submitButton"));

    }
}