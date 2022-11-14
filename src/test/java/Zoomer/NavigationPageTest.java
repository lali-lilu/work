package Zoomer;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.ChromRunner.Chrom;
import org.example.ChromRunner.Retry;
import org.example.StepObject.NavigationProdactSteps;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.DataObjact.NavigationPageData.links;

@Listeners(org.example.ChromRunner.TestLister.class)
public class NavigationPageTest extends Chrom {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("მთავარი გვერის ნავიგაციის ჩანართში არსებული ყველა ჩამონათვალის " +
            "გახსნა თანმიმდევრობით href-ების გამოყენებით. მათი დატრიალება ციკლში")

    public void Navigation(){
    open("https://zoommer.ge/");
    NavigationProdactSteps navigationProdactSteps=new NavigationProdactSteps();
    navigationProdactSteps.Linkssort();
    links.forEach(Selenide::open);
    int a=0;
    Assert.assertNotNull(links);
}
}
