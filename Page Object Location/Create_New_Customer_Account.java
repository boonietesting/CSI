package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://riley.partner.testinsights.io/app/#!/module-collection/guid/9b1edfee-6b58-4f00-82c7-e12c20c4557b
@TestModellerModule(guid = "9b1edfee-6b58-4f00-82c7-e12c20c4557b")
public class Create_New_Customer_Account extends BasePage
{
	public Create_New_Customer_Account (WebDriver driver)
	{
		super(driver);
	}


	
	private By First_NameElem = By.xpath("//label[normalize-space()= 'First Name']/../div/input");

	private By Last_NameElem = By.xpath("//label[normalize-space()= 'Last Name']/../div/input");


	
	public void GoToUrl()
	{
		m_Driver.get("https://magento.nublue.co.uk/customer/account/create/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://magento.nublue.co.uk/customer/account/create/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://magento.nublue.co.uk/customer/account/create/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://magento.nublue.co.uk/customer/account/create/";

        if (!currentUrl.equals("https://magento.nublue.co.uk/customer/account/create/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter First Name
     * @name Enter First Name
     */
 	public void Enter_First_Name(String First_Name)
 	{
 	    
 		WebElement elem = getWebElement(First_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

 			Assert.fail("Unable to locate object: " + First_NameElem.toString());
         }

 		elem.sendKeys(First_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_First_Name " + First_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_First_Name " + First_Name);
 	}
      
	/**
 	 * Enter Last Name
     * @name Enter Last Name
     */
 	public void Enter_Last_Name(String Last_Name)
 	{
 	    
 		WebElement elem = getWebElement(Last_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Last_NameElem.toString());
         }

 		elem.sendKeys(Last_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Last_Name " + Last_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Last_Name " + Last_Name);
 	}}