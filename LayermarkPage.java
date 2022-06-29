package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LayermarkPage {
    public LayermarkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Main page
    @FindBy(css = "div h2:nth-of-type(2)")
    public WebElement mainPageAllTitles;
    @FindBy(css = "div  > div[class='fusion-builder-row fusion-row']")
    public WebElement mainPageAllTablesToCheckSuccessfullyLoaded;

    //Dropdown menu
    @FindBy(xpath ="(//span[text()='About'])[1]")
    public WebElement dropdownMenuAboutButton;
    @FindBy(xpath = "(//span[contains(text(),'Careers')])[1]")
    public WebElement dropdownMenuAboutButtonCareersButton;
    @FindBy(css = ".fusion-sticky-logo")
    public WebElement dropdownMenuLayermarkButton;


    //Career page
    @FindBy(xpath ="(//div[@class='flip-box-front'])[1]")
    public WebElement HoverOvercompetitiveSalary;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[2]")
    public WebElement HoverOverBestEquipment;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[3]")
    public WebElement HoverOverFlexibleWorkHours;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[4]")
    public WebElement HoverOverPersonalDevelopment;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[5]")
    public WebElement HoverOverInternationalProjects;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[6]")
    public WebElement HoverOverRemoteWorkOpportunity;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[7]")
    public WebElement HoverOverFastPacedCareerGrowth;
    @FindBy(xpath ="(//div[@class='flip-box-front'])[8]")
    public WebElement HoverOverGreatWorkLifeBalance;
    //Hover 0ver box texts
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[1]")
    public WebElement HoverOvercompetitiveSalaryText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[2]")
    public WebElement HoverOverBestEquipmentText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[3]")
    public WebElement HoverOverFlexibleWorkHoursText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[4]")
    public WebElement HoverOverPersonalDevelopmentText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[5]")
    public WebElement HoverOverInternationalProjectsText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[6]")
    public WebElement HoverOverRemoteWorkOpportunityText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[7]")
    public WebElement HoverOverFastPacedCareerGrowthText;
    @FindBy(xpath ="(//div[@class='flip-box-back-inner'])[8]")
    public WebElement HoverOverGreatWorkLifeBalanceText;





}
