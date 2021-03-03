package ru.netology.web.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MoneyTransfer {

    private SelenideElement transferPage = $(withText("Пополнение карты"));
    private SelenideElement transferAmount = $("[data-test-id=amount] input");
    private SelenideElement transferFrom = $("[data-test-id=from] input");
    private SelenideElement transferTo = $("[data-test-id=to] input");
    private SelenideElement transferButton = $(byText("Пополнить"));
    private SelenideElement cancelButton = $(byText("Отмена"));

    public void moneyTransferVisible() {
        transferPage.shouldBe(Condition.visible);
    }

    public void setTransferAmount(int sum) {
        transferAmount.setValue(String.valueOf(sum));
    }

    public void setFrom(String numberCard) {
        transferFrom.setValue(numberCard);
    }

    public void doTransfer() {
        transferButton.click();
    }

    public DashboardPage CancelTransfer() {
        cancelButton.click();
        return new DashboardPage();
    }
}

