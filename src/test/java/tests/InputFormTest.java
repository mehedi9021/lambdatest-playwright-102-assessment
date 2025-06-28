package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InputFormPage;

public class InputFormTest extends BaseTest {
    @Test
    public void testInputFormSubmit() {
        HomePage home = new HomePage(page);
        home.clickInputFormSubmit();

        InputFormPage input = new InputFormPage(page);
        input.clickSubmit(); // Empty submit first to trigger error (browser shows HTML5 native message)

        input.fillForm();
        input.clickSubmit();

        String msg = input.getSuccessMessage().trim();
        Assert.assertTrue(msg.contains("Thanks for contacting us"));
    }
}