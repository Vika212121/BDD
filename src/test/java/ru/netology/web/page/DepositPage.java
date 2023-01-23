package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DepositPage {

    private SelenideElement heading = $("[data-test-id=dashboard]");

    private SelenideElement amountField = $("[data-test-id=\"amount\"] .input__control");
    private SelenideElement whereFrom = $("[data-test-id=\"from\"] input");
    private SelenideElement button = $("[data-test-id=\"action-transfer\"] .button__text");
    private SelenideElement errorNotification = $("[data-test-id=\"error-notification\"] .notification__content");


    public DepositPage() {
        heading.shouldBe(visible);
    }

    public DashboardPage transferCardToCard(String amount, DataHelper.Card from) {
        amountField.click();
        amountField.setValue(amount);
        whereFrom.click();
        whereFrom.setValue(from.getNumber());
        button.click();
        return new DashboardPage();
    }

}
