package Zoomer;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.ChromRunner.Chrom;
import org.example.ChromRunner.Retry;
import org.example.StepObject.HomePageSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.example.DataObjact.HomePageData.*;
import static com.codeborne.selenide.Selenide.open;

@Listeners(org.example.ChromRunner.TestLister.class)
public class HomePageTest extends Chrom {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("მთავარი გვერდზე ძებნის ღილაკის გამოყენებით პროდუქტის მოძებნა, " +
            "მოძებნილ პროდუქტების ჩამონათვალზე გადასვლა," +
            "კალათაში გადასვლა")
    public void Home(){
        open("https://zoommer.ge/");
        HomePageSteps homePageSteps=new HomePageSteps();
        homePageSteps.searchValue(smart)
                .GoToBasket();
        Assert.assertEquals(smart,"მიკროფონი");
       Assert.assertTrue(homePageSteps.emptyBasketText.is(Condition.visible));
    }
}
