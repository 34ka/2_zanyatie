package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");


        $("#firstName").val("Noob");
        $("#lastName").val("Noobski");
        $("#userEmail").val("Noobski@rgewrgwrg.rty");
        //f
        $("#userNumber").val("1234567890");
        //$("#subjectsContainer").val("thertherthethrthwth");
        //$(".subjects-auto-complete__input").val("thertherthethrthwth");
        //$("#subjectsInput").val("thertherth");
        //hobi
        //pic subjectsInput
        $("#currentAddress").val("Lenina, 51, 37");
        $("#submit").click();

        //Проверяем, что все данные заоплнились в поля$(#id или класс. ).shouldHave(text("Noob"));
        System.out.println("");
    }
    @Test
    void fillFormWithVariablesTest() {
        String firstname = "Noob",
                lastName = "Noobski",
                userEmail = "Noobski@rgewrgwrg.rty",
                userNumber = "1234567890",
                currentAddress = "Lenina, 51, 37";

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").val(firstname);
        $("#lastName").val(lastName);
        $("#userEmail").val(userEmail);
        //f
        $("#userNumber").val(userNumber);
        //$("#subjectsContainer").val("thertherthethrthwth");
        //$(".subjects-auto-complete__input").val("thertherthethrthwth");
        //$("#subjectsInput").val("thertherth");
        //hobi
        //pic subjectsInput
        $("#currentAddress").val(currentAddress);
        $("#submit").click();

        //Проверяем, что все данные заоплнились в поля$(#id или класс. ).shouldHave(text(firstname + lastName + userEmail + currentAddress  ));

        //Проверяем, что все данные заоплнились в поля$(#id или класс. ).shouldHave(text(String.format(
        // "first%s" + lastName + userEmail + currentAddress,  )));

        //Проверяем, что все данные заоплнились в поля$(#id или класс. ).shouldHave(text(firstname));
        System.out.println("");
    }
}
