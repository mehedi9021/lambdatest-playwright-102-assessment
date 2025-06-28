package pages;

import com.microsoft.playwright.Page;

public class SimpleFormPage {
    private Page page;

    public SimpleFormPage(Page page) {
        this.page = page;
    }

    public void enterMessage(String msg) {
        page.locator("#user-message").fill(msg);
    }

    public void clickShowMessage() {
        page.locator("#showInput").click();
    }

    public String getDisplayedMessage() {
        return page.locator("#message").textContent();
    }
}