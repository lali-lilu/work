package org.example.StepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.example.PageObject.ProdactPage;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static org.example.DataObjact.ProdactPageData.*;


public class ProdactPageSteps extends ProdactPage {
    @Step("მობილურების ჩანართში პროდუქტის ღურებულების შუელედით დაფილტვრა," +
            "შეიყვანეთ მინიმალური რირებულება Value: {0}." +
            "შეიყვანეთ მაქსიმალური ღირებულება Value: {1}")

    public  ProdactPageSteps sortValue(Integer int1, Integer int2){
        betweenMin.setValue(String.valueOf(PriceMin)).pressEnter();
        betweenMax.setValue(String.valueOf(PriceMax)).pressEnter();
        okClick.click();
        betweenMax.shouldBe(Condition.visible, Duration.ofMillis(5000));
        betweenMin.shouldBe(Condition.visible,Duration.ofMillis(5000));
        /*Assert.assertNotNull(betweenMin);
        Assert.assertNotNull(betweenMax);*/

        return this;
    }

    @Step("ღირებულებით დაფილტრული პროდუქტის დალაგება კლებადობით, " +
            "შესაბამისი ჩანართის გამოყენებით")
    public  ProdactPageSteps goToSort(){
       sortBtn.click();
       sortBy.click();
       sortBtn.shouldBe(Condition.visible,Duration.ofMillis(5000));
       sortBy.shouldBe(Condition.visible,Duration.ofMillis(5000));
       /*Assert.assertTrue(sortBtn.is(Condition.visible));
        Assert.assertTrue(sortBy.is(Condition.visible));*/
        return this;
    }


}
