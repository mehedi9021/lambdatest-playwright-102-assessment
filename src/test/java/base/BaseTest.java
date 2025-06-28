package base;

import com.microsoft.playwright.*;
import config.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeMethod
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        page.navigate(ConfigReader.getBaseUrl());
    }

    @AfterMethod
    public void teardown() {
        if (playwright != null) {
            playwright.close();
        }
    }
}