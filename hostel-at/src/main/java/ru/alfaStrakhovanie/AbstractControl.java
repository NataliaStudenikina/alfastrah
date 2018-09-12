package ru.alfaStrakhovanie;

import org.openqa.selenium.WebElement;

abstract class AbstractControl {
    public WebElement element;

    AbstractControl(WebElement element) { this.element = element; }
}
