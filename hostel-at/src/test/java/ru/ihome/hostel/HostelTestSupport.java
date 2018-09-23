package ru.ihome.hostel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.alfaStrakhovanie.MembersBirthdayPicker;
import ru.alfaStrakhovanie.page.insurance.InsuranseForTravel.InsuranseForTravelersAbroad;
import java.util.concurrent.TimeUnit;

public class HostelTestSupport {
    public static WebDriver driver;
   // public static InsuranseForTravelersAbroad insuranseForTravelersAbroad;
     InsuranseForTravelersAbroad insuranseForTravelersAbroad = new InsuranseForTravelersAbroad(driver );
//    MembersBirthdayPicker membersBirthdayPicker = new MembersBirthdayPicker(insuranseForTravelersAbroad.birthdayUserInput);

    /**
     * Комментарии для git
     */


    /**
     *Очередной новый комментарий
     */
    public HostelTestSupport() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.alfastrah.ru/individuals/travel/vzr/");
    }
    @Test
    public void addMembers(){
    insuranseForTravelersAbroad.clickingleEntrySwitch();
    driver.close();

    }
}
