package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SimpleFormPage;

public class SimpleFormTest extends BaseTest {
    @Test
    public void testSimpleFormDemo() {
        HomePage home = new HomePage(page);
        home.clickSimpleFormDemo();
        Assert.assertTrue(page.url().contains("simple-form-demo"));

        SimpleFormPage simple = new SimpleFormPage(page);
        String msg = "Welcome to LambdaTest";
        simple.enterMessage(msg);
        simple.clickShowMessage();

        Assert.assertEquals(simple.getDisplayedMessage().trim(), msg);
    }
}