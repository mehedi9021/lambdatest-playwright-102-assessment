package pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void clickSimpleFormDemo() {
        page.getByText("Simple Form Demo").click();
    }

    public void clickSlider() {
        page.getByText("Drag & Drop Sliders").click();
    }

    public void clickInputFormSubmit() {
        page.getByText("Input Form Submit").click();
    }
}