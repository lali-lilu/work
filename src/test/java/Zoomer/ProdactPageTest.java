package Zoomer;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.ChromRunner.Chrom;
import org.example.ChromRunner.Retry;
import org.example.StepObject.ProdactPageSteps;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.example.DataObjact.ProdactPageData.PriceMax;
import static org.example.DataObjact.ProdactPageData.PriceMin;
import static com.codeborne.selenide.Selenide.open;

@Listeners(org.example.ChromRunner.TestLister.class)
public class ProdactPageTest extends Chrom {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("მობილურების ჩანართზე გადასვლა" +
            "დასროტვა ფასის შუალედის მიხედვით," +
            "მიღებული შედეგის დალაგება კლებადობით")
     public void Prodact(){
               open("mobilurebi-2?orderby=30");

        ProdactPageSteps prodactPageSteps= new ProdactPageSteps();
        prodactPageSteps.sortValue(PriceMin,PriceMax)
                        .goToSort();
        Assert.assertNotNull(PriceMin,"მიუთითეთ მინიმალური ღირებულება");
        Assert.assertNotNull(PriceMax,"მიუთითეთ მაქსიმალური ღირებულება");

        //Assert.assertNotNull(betweenMax);
    }

}
