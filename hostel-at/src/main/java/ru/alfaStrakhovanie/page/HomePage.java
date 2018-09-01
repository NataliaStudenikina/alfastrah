package ru.alfaStrakhovanie.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy (xpath= ".//a[text() = 'Частным лицам']")
    WebElement privatePerson;

    @FindBy (xpath = ".//a[text() = 'Корпоративным клиентам']")
    WebElement corporateClients;

    @FindBy (xpath = ".//a[text() = 'Партнерам']")
    WebElement partners;

    @FindBy (xpath = ".//a[text() = 'VIP-Клиентам']")
    WebElement vipClients;

    public void clickPrivatePerson() {privatePerson.click();}

    public void clickCopporateClients() {corporateClients.click();}

    public void clickPartners() {partners.click();}

    public void clickVipClients() {vipClients.click();}

}
