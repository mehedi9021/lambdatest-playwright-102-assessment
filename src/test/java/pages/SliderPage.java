package pages;

import com.microsoft.playwright.Page;

public class SliderPage {
    private Page page;

    public SliderPage(Page page) {
        this.page = page;
    }

    public void moveSliderTo95() {
        page.locator("input[type='range']").first().evaluate("e => e.value = 95");
    }

    public String getSliderValue() {
        return page.locator("#range").textContent();
    }
}