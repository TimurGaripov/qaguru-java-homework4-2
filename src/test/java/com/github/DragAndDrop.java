package com.github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.DragAndDropOptions.usingActions;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $$("#columns").first().shouldHave(text("B"));
        $$("#columns").last().shouldHave(text("A"));
    }
}
