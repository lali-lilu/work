package org.example.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
    searchInput = $("#small-searchterms"),
    basketBtn = $(".h_basket_icon",0),
    goToBasket= $(byText("კალათაში გადასვლა")),
    emptyBasketText=$(byText("თქვენი კალათა ცარიელია"));

}
