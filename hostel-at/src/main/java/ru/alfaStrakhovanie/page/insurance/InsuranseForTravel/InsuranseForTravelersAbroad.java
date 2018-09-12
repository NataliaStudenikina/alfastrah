package ru.alfaStrakhovanie.page.insurance.InsuranseForTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranseForTravelersAbroad {
    public static WebDriver driver;
    public InsuranseForTravelersAbroad(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    /**
     *Селекторы для заголовков полей на странице
     */
    @FindBy (xpath = ".//div[@class = 'calculator-heading__title h1']/descendant::h1")
    WebElement mainHeading; //Главный заголовок на странице

    @FindBy (xpath = ".//div[text() = 'Выберите тип полиса и укажите даты поездки'']")
    WebElement headerPolisAndDuration;

    @FindBy (xpath = ".//div[text()='Укажите страну']")
    WebElement headerCountry;

    @FindBy (xpath = ".//div[text() = 'Укажите даты рождения участников поездки']")
    WebElement headerBirthday;

    @FindBy (xpath = ".//div[text() = 'Укажите активные виды отдыха и спорта']")
    WebElement headerActivity;

    @FindBy (css = "[name = 'vzr-countries-input']")
    WebElement countryInput; //Селектор для указания страны

    @FindBy (xpath = ".//div[text() = 'Однократный']")
    WebElement singleEntrySwitch; //Селектор для однократного тип полиса

    @FindBy (xpath = ".//div[text() = 'Многократный']")
    WebElement multiplexSwitch; //Селектор для многократного типа полиса

    @FindBy (css = "[name = 'vzr-date-start']")
    WebElement calendarStartInput; //Селектор для даты начала поездки

    @FindBy (css = "[name = 'vzr-date-end']")
    WebElement calendarEndInput; //Селектор для даты окончания поездки

    @FindBy (xpath= "[class = 'js-vzr-single-days-amount-value']")
    WebElement durationOfTrip; // Селектор для длительности поездки

    @FindBy (xpath = ".//div[@class ='numbered-fields']")
    public WebElement birthdayUserInput; //Селектор для даты рождения участников поездки

    @FindBy (xpath = ".//div[text() = 'Добавить участника']")
    WebElement addUser;

    @FindBy (name = "vzr-sport-input")
    WebElement activityInput; //

    @FindBy (xpath = ".//li[text() = 'Сноубординг']")
    WebElement snowboarding; //Сноубординг

    @FindBy (xpath = ".//*[text() = 'Рассчитать стоимость' and (@class = 'i-button__text')]")
    WebElement buttonCalculationsCosts; //Кнопка Рассчитать стоимость

    public String setMainHeading() { return mainHeading.getText(); } //Метод получения значения заголовка

    public String setHeaderPolisAndDuration () { return headerPolisAndDuration.getText(); }
    //Метод получения наименования типа полиса и укажите даты поездки

    public String setHeaderCountry() { return headerCountry.getText(); } //Метод получения заголовка для ввода страны

    public String setHeaderBirthday() { return headerBirthday.getText(); } //Метод получения заголовка для ввода даты рождения

    public String setHaderActivity() { return headerActivity.getText(); } //Метод получения заголовка для ввода активности

    public void setCountryInput(String value) { countryInput.sendKeys(value); }

    public void clickingleEntrySwitch() { singleEntrySwitch.click(); }

    public void clickMultiplexSwitch() { multiplexSwitch.click(); }

    public void setCalendarStartInput(String value) { calendarStartInput.sendKeys(value); }

    public void setCalendarEndInput(String value) { calendarEndInput.sendKeys(value); }

    public String setDurationOfTrip() { return durationOfTrip.getText(); }

    public void clickAddUser() { addUser.click(); }

    public void setActivityInput(String value) { activityInput.sendKeys(value); }




















}
