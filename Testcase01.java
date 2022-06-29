package tests.LayermarkAutomationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LayermarkPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class CareerPageHoverOverTest extends TestBaseRapor {
    LayermarkPage layermarkPage;
    Actions actions;

    @Test
    public void test01_Main_Page_Then_Careers_Page_Then_Verify_HoverOvers() throws InterruptedException {
        layermarkPage = new LayermarkPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Kullanici 'anasayfaya' gider " +
                "devaminda 'careers' sayfasina gider ve hoverover elementleri kullanir ", "test01_Main_Page_Then_Careers_Page_Then_Verify_HoverOvers()");
        extentTest.pass("1. Layermark anasayfasina gidildi. 'http://automationexercise.com'");
        Driver.getDriver().get("https://www.layermark.com/");
        ReusableMethods.waitForPageToLoad(10);
        extentTest.pass("2. Anasayfanidaki butun webElementlerinin hepsi basari ile yuklendi ve URL dogrulugu kontrol edildi. ");
        ReusableMethods.waitFor(3);
        Assert.assertTrue(ReusableMethods.verifyURLorText(Driver.getDriver().getCurrentUrl(), "https://www.layermark.com/"));
        List<WebElement> mainPageControl1 = Driver.getDriver().findElements(By.cssSelector("div  > div[class='fusion-builder-row fusion-row']"));
        for (WebElement element : mainPageControl1) {
            element.isDisplayed();
            element.isEnabled();
        }
        List<WebElement> mainPageControl2 = Driver.getDriver().findElements(By.cssSelector("div h2:nth-of-type(2)"));
        for (WebElement element : mainPageControl2) {
            element.isDisplayed();
            element.isEnabled();
        }
        extentTest.pass("3. Anasayfadan header hoverover menu kullanilarak 'About' menusu altindan 'Careers' sekmesine gidildi. ");
        actions.moveToElement(layermarkPage.dropdownMenuAboutButton).perform();
        actions.moveToElement(layermarkPage.dropdownMenuAboutButtonCareersButton).click().perform();
        extentTest.pass("4. Careers sayfasinin basariyla yuklendigi ve Url dogrulugu kontrol edildi.");
        List<WebElement> careerPageElements = Driver.getDriver().findElements(By.xpath("//div[@class='flip-box-front']"));
        for (WebElement element : careerPageElements) {
            element.isDisplayed();
            element.isEnabled();
        }
        Assert.assertTrue(ReusableMethods.verifyURLorText(Driver.getDriver().getCurrentUrl(), "https://www.layermark.com/careers/"));
        extentTest.pass("5. Sayfada Hoverover elementlerin bulundugu alana scroll down yapildi. ");
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView()",layermarkPage.HoverOvercompetitiveSalary);
        extentTest.pass("6. 8 Farkli Hoverover kutunun calistigi tek tek assert edildi.");
        actions.moveToElement(layermarkPage.HoverOvercompetitiveSalary).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOvercompetitiveSalaryText.getText()
                ,"You & your work is valuable to us; thus, we pay what you deserve." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverBestEquipment).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverBestEquipmentText.getText()
                ,"We provide latest technological devices for you to enjoy working." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverFlexibleWorkHours).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverFlexibleWorkHoursText.getText()
                ,"Daily hours are irrevelant when the work is done on time." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverPersonalDevelopment).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverPersonalDevelopmentText.getText()
                ,"We provide necessary trainings and experiences for your professional development." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverInternationalProjects).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverInternationalProjectsText.getText()
                ,"Work on international projects and experience new things." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverRemoteWorkOpportunity).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverRemoteWorkOpportunityText.getText()
                ,"Place is irrevelant, too." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverFastPacedCareerGrowth).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverFastPacedCareerGrowthText.getText()
                ,"Experience latest technologies & methodologies while working." ));
        Thread.sleep(500);
        actions.moveToElement(layermarkPage.HoverOverGreatWorkLifeBalance).perform();
        Assert.assertTrue(ReusableMethods.verifyURLorText(layermarkPage.HoverOverGreatWorkLifeBalanceText.getText()
                ,"We believe family is more important than work. Flexible work hours will let you have more time with them." ));
        Thread.sleep(500);
        extentTest.pass("7. Header hoverover menu uzerinden Layermark image'i tiklanarak anasayfaya gidildi.");
        layermarkPage.dropdownMenuLayermarkButton.click();
        extentTest.pass("8. Anasayfanidaki butun webElementlerinin hepsi basari ile yuklendi ve URL dogrulugu kontrol edildi. ");
        ReusableMethods.waitFor(3);
        Assert.assertTrue(ReusableMethods.verifyURLorText(Driver.getDriver().getCurrentUrl(), "https://www.layermark.com/"));
        List<WebElement> mainPageControl3 = Driver.getDriver().findElements(By.cssSelector("div  > div[class='fusion-builder-row fusion-row']"));
        for (WebElement element : mainPageControl3) {
            element.isDisplayed();
            element.isEnabled();
        }
        List<WebElement> mainPageControl4 = Driver.getDriver().findElements(By.cssSelector("div h2:nth-of-type(2)"));
        for (WebElement element : mainPageControl4) {
            element.isDisplayed();
            element.isEnabled();
        }
        extentTest.pass("Test basari ile tamamlandi!!");
    }
}
