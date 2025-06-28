package pages;

import com.microsoft.playwright.Page;

public class InputFormPage {
    private Page page;

    public InputFormPage(Page page) {
        this.page = page;
    }

    public void clickSubmit() {
        page.locator("button[type='submit']").click();
    }

    public void fillForm() {
        page.fill("input[name='name']", "Mehedi");
        page.fill("input[name='email']", "mehedi@example.com");
        page.fill("input[name='password']", "Password123");
        page.fill("input[name='company']", "My Company");
        page.fill("input[name='website']", "https://example.com");
        page.selectOption("select[name='country']", "United States");
        page.fill("input[name='city']", "Dhaka");
        page.fill("input[name='address1']", "Address 1");
        page.fill("input[name='address2']", "Address 2");
        page.fill("input[name='state']", "Dhaka");
        page.fill("input[name='zip']", "1205");
    }

    public String getSuccessMessage() {
        return page.locator(".success-msg").textContent();
    }
}