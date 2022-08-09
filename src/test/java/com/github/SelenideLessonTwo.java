package com.github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideLessonTwo {
    @Test
    void githubPricingTest() {
        Configuration.headless=true;
        open("https://github.com/");
        $("nav").$(byText("Pricing")).hover();
        $("nav").$(byText("Compare plans")).click();
        $("#compare-features")
                .shouldHave(text("Free"))
                .shouldHave(text("Team"))
                .shouldHave(text("Enterprise"));
    }
}
