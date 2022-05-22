package com.simbirsoft.data;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DragAndDropData {
    public final static String urlSite = "https://the-internet.herokuapp.com/drag_and_drop";
    public final static SelenideElement aNameBlock = $("#column-a");
    public final static SelenideElement bNameBlock = $("#column-b");
    public final static SelenideElement aBlockAfterDragAndDrop = $("#column-a header");
    public final static SelenideElement bBlcokAfterDragAndDrop = $("#column-b header");
    public static String aBlockAfterDragAndDropText = "B";
    /* private String bBlcokAfterDragAndDrop = "#column-b header:contains('A')"; Почему-то не работает,
    хотя в консоли браузера работает...
    */
    public static String bBlcokAfterDragAndDropText = "A";
}
