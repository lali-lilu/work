package org.example.StepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.example.PageObject.HomePage;
import org.testng.Assert;

import java.time.Duration;

import static org.example.DataObjact.HomePageData.computer;
import static org.example.DataObjact.HomePageData.smart;

public class HomePageSteps extends HomePage {
    @Step("მთავარი გვერდის ძებნის ველში კონკრეტული პროდუქტის მოძებნა," +
            "საძებნი პროდუქტის დასახელება Value: {0}")
    public HomePageSteps searchValue(String text) {
        searchInput.setValue(smart).pressEnter();
        searchInput.shouldBe(Condition.visible, Duration.ofMillis(5000));
    return this;
    }

    @Step("კალათაში გადასვლა, მისი სიცარიელის შემოწმება")
    public HomePageSteps GoToBasket() {
        basketBtn.hover();
        goToBasket.click();
        basketBtn.shouldBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }

}
