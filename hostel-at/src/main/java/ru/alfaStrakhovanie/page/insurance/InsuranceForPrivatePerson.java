package ru.alfaStrakhovanie.page.insurance;
/**
 * Page Object для различных видов страховок для частных клиентов
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceForPrivatePerson {

    public InsuranceForPrivatePerson(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;
    @FindBy (xpath = ".//*[@class = 'calc-popup__title' and (text() = 'Автомобили')]")
    WebElement carlLink;

    @FindBy (xpath = ".//*[@class = 'calc-popup__title' and (text() = 'Жилье')]")
    WebElement housinglLink;

    @FindBy (xpath = ".//*[@class = 'calc-popup__title' and (text() = 'Путешествия')]")
    WebElement travelLink;

    @FindBy (xpath = ".//*[@class = 'calc-popup__title' and (text() = 'Имущество')]")
    WebElement possessionsLink;

    @FindBy (xpath = ".//*[@class = 'calc-popup__title' and (text() = 'Здоровье')]")
    WebElement healthlLink;

    @FindBy (xpath = ".//*[@class = 'calc-popup__title' and (text() = 'Инвестиции')]")
    WebElement investmentslLink;

    public void clickCarLink() {carlLink.click();}

    public void  clickHousinglLink() {housinglLink.click();}

    public void clickTravelLink() {travelLink.click();}

    public void  clickPossessionsLink() {possessionsLink.click();}

    public void clickHealthlLink () {healthlLink.click();}

    public void clickInvestmentslLink() {investmentslLink.click();}








}
