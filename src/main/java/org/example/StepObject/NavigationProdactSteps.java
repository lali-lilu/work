package org.example.StepObject;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;
import org.example.PageObject.NavigationPage;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NavigationProdactSteps  extends NavigationPage {
    @Step("ნავიგაციის ჩანართის href-ში არსებული ყველა href-ის მოძიება," +
            "მათი ერეი ლისტად გცევა და ციკლსი დატრიალება. " +
            "რომ თანმიმდევრობით გაიხსნას ტესტში")
    public NavigationProdactSteps Linkssort() {
        List<String> links = new ArrayList<>();
        hrefs.forEach(x -> links.add(x.getAttribute("href")));
        hrefs.should(CollectionCondition.sizeLessThan(0),Duration.ofMillis(5000));
        return this;
    }

}
