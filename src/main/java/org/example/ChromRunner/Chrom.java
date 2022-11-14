package org.example.ChromRunner;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Chrom {
    @BeforeTest(description = "Configure browser before tests")
    public void Openchrom(){
        Configuration.browser="chrome";
        Configuration.baseUrl="https://zoommer.ge/";

    }
}
