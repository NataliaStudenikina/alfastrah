package ru.alfaStrakhovanie.page.insurance.InsuranseForTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranseForTourist {

    public InsuranseForTourist(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy (xpath = ".//a[text()='Страхование выезжающих за рубеж']")
    WebElement insuranceForTravelersAbroad;

    @FindBy (xpath = ".//a[text()='Страхование путешествий по России']")
    WebElement travelInsuranceInRussia;

    @FindBy (xpath = ".//a[text()='Страховка для шенгенской визы']")
    WebElement insuranceForSchengenVisa;

    public void clickInsuranceForTravelersAbroad (){insuranceForTravelersAbroad.click();}

    public void clickTravelInsuranceInRussia() {travelInsuranceInRussia.click();}

    public void clickInsuranceForSchengenVisa() {insuranceForSchengenVisa.click();}






}
