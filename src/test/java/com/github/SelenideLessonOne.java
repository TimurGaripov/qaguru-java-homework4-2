package com.github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideLessonOne {

    @Test
    void githubSearchTest() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").scrollTo().click();
        $("a[href$='SoftAssertions']").click();
        $("#user-content-3-using-junit5-extend-test-class").closest("h4").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
