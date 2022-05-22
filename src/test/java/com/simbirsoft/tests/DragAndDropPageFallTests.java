package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import com.simbirsoft.data.DragAndDropData;
import com.simbirsoft.page.DragAndDropPage;
import com.simbirsoft.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropPageFallTests {
    DragAndDropPage page = new DragAndDropPage();
    //тесты тут падают
    //нельзя вклчать его вместе с другими, другие тоже упадут.Он сделан для пример запуска параллельного ,автотестов


    @Test
    public void openBrowserInASmallSize() {
        open(DragAndDropData.urlSite);
        DragAndDropData.aBlockAfterDragAndDropText="A";
        DragAndDropData.aBlockAfterDragAndDrop.shouldHave(text(DragAndDropData.aBlockAfterDragAndDropText));
    }

    @Feature("Issue")
    @Story("Поиск номера 66 в Issue")
    @Owner("SimplePerson")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка номера Isseus в репозитории")
    @Description("Ищем репозиторий , а потом в нем смотрим номер любой, что есть под одной хотя бы записью")
    @ValueSource(strings={"1","2","3","4"})
    @ParameterizedTest(name="test: {0}")
    public void DragAndDropAToB_BIsInAnotherPlace(String text) {
        open(DragAndDropData.urlSite);
        page.dragAndDropAToB(DragAndDropData.aNameBlock,DragAndDropData.bNameBlock);
        DragAndDropData.aBlockAfterDragAndDrop.shouldHave(text(DragAndDropData.aBlockAfterDragAndDropText));
        DragAndDropData.bBlcokAfterDragAndDrop.shouldHave(text(DragAndDropData.bBlcokAfterDragAndDropText));
    }
}
