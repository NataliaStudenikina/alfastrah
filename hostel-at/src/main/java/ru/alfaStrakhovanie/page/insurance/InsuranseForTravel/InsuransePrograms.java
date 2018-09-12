package ru.alfaStrakhovanie.page.insurance.InsuranseForTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuransePrograms {

    public InsuransePrograms(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy (xpath = ".//div[@class = 'calc-parameters-list__item calc-parameters-list__item_countries']/descendant::span[1]")
    WebElement countryOfTraveIP; //Страна, которая отображается на вкладке "Программы страхования"

    @FindBy (xpath = ".//div[@class = 'calc-parameters-list__item calc-parameters-list__item_date']")
    WebElement durationOfTravelIP; //Период поездки на вкладке "Программы страхования"

    @FindBy (xpath = ".//div[@class = 'calc-parameters-list__parameter calc-parameters-list__parameter_date']")
    WebElement numberOfDaysOfTravel; //Количество дней поездки на вкладке "Программы страхования"

    @FindBy (xpath = ".//div[@class = 'calc-parameters-list__item calc-parameters-list__item_insurers']/descendant::span[3]")
    WebElement numberOfParticipants; //Количество учатников поездки на вкладке "Программы страхования"

    @FindBy (xpath = ".//div[@class = 'calc-parameters-list__item calc-parameters-list__item_sports']/descendant::span[1]")
    WebElement typeOfActivity; //Вид спорта на вкладке "Программы страхования"

    @FindBy (xpath = ".//tr[@class = 'calculator-price__row calculator-price__row_top-align js-info-layer-1 is-showed']" +
            "/descendant::div[text() = 'Классик (С)']")
    WebElement insuransePrograms;

    @FindBy (xpath = ".//tr[@class = 'calculator-price__row calculator-price__row_top-align js-info-layer-1 is-showed']" +
            "/td/descendant::div[text()='Классик (С)']")
    WebElement сhoiceButton;





}
