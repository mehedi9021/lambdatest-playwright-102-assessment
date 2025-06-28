package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SliderPage;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderTo95() {
        HomePage home = new HomePage(page);
        home.clickSlider();

        SliderPage slider = new SliderPage(page);
        slider.moveSliderTo95();

        Assert.assertEquals(slider.getSliderValue(), "95");
    }
}