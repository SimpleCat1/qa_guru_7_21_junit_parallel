package com.simbirsoft.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class DragAndDropPage {
    @Step("Перемещаем элемент с {locator} на {locator2}")
    public void dragAndDropAToB(SelenideElement locator, SelenideElement locator2){
        locator.dragAndDropTo(locator2);
    }
}
