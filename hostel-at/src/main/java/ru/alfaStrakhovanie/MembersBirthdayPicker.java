package ru.alfaStrakhovanie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MembersBirthdayPicker extends AbstractControl {

    public MembersBirthdayPicker(WebElement element) {
        super(element);
    }
    public void inputDateOfBirth(int index, String value) {
        WebElement birthInput =  super.element.findElement(By.xpath(".//div[contains(@class, 'numbered-fields__item')][" +
               index + "]"));
        birthInput.sendKeys(value);
    }

    public void deleteMembers(int index){
        WebElement deleteMemeber = super.element.findElement(By.xpath(".//div[contains(@class, 'numbered-fields__item')]" +
                "["+ index +"]/descendant::a"));
        deleteMemeber.click();
    }

    public void clearFieldBirth(int index) {
        WebElement clearFieldBD = super.element.findElement(By.xpath(".//div[contains(@class, 'numbered-fields__item')]" +
                "["+ index +"]/descendant::a"));
        clearFieldBD.clear();
    }

    public void addMember(){
        WebElement addMember;
        addMember = super.element.findElement(By.xpath(".//span[text() = 'Добавить участника']"));
        addMember.click();
    }

}
