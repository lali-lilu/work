package org.example.PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class NavigationPage {
    public ElementsCollection
            hrefs=$$x("//div[@class='navigation']//a[@href]");

}
