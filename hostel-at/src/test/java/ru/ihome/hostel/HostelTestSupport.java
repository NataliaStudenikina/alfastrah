package ru.ihome.hostel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.alfaStrakhovanie.page.HomePage;

import java.util.concurrent.TimeUnit;



public class HostelTestSupport {
    public static HomePage loginPage;

//    final static public String USER_LOGIN = "studenikina.n.a@gmail.com";
//    final static public String USER_PASSWORD = "474899100Natalia";

    public static WebDriver driver;

    public HostelTestSupport() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.alfastrah.ru");
    }

//    public void loginAsUser (String login, String password){
//        loginPage = new HomePage(driver);
//        loginPage.setLogin(login);
//        loginPage.setPassword(password);
//        loginPage.clickSubmitButton();
//    }
}
