package ru.netology.web.page;


import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selemide.$;


public class LoginPage {
    public void LoginPage(DataHelper.AuthInfo info) {
        $("[data-test-id=login] input").setValue(info.getLogin());
        $("[data-test-id=password] input").setValue(info.getPassword());
        $("[data-test-id=login]").click();
        return new VerificationPage();
    }
}
