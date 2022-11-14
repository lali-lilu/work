package org.example.PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProdactPage {
    public SelenideElement
            betweenMin= $("#min_price"),
            betweenMax= $("#max_price"),
            okClick =$(".js-filter-price"),
            sortBtn = $(".sorter_dropdown"),
            sortBy=$(byText("ფასი: კლებადობით"));

}
