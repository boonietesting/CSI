package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/c8957b9b-7965-47e0-b446-66d4181ec1f2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 116, profileId = 55)
public class Login_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "2d314c4d-5b1e-401c-8a5a-8ec9961e76ba")
    public void LoginPageUnauthenticated()
    {
        
        Pages.CustomerAuthentication.CustomerLoginPage _CustomerLoginPage = new Pages.CustomerAuthentication.CustomerLoginPage(driver);
    TestModellerLogger.SetLastNodeGuid("22b3605e-4116-46d9-89b0-1d98e344d10e");
    _CustomerLoginPage.goToURL();

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.enterEmail("roni_cost@example.com");

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.enterPassword("NpoH3F.5lM6^0HRJvldPrW@L8_2zRfmN^=2XH7v.kb-JC+OKlO");

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.submitLogin();

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.assertInvalidLogin();

    }


    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "b2f7181d-545d-4d35-be34-553df4477231")
    public void LoginPageUnauthenticated1()
    {
        
        Pages.CustomerAuthentication.CustomerLoginPage _CustomerLoginPage = new Pages.CustomerAuthentication.CustomerLoginPage(driver);
    TestModellerLogger.SetLastNodeGuid("22b3605e-4116-46d9-89b0-1d98e344d10e");
    _CustomerLoginPage.goToURL();

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.enterEmail("invalid@invalid.com");

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.enterPassword("2!S0s^BRzjDFt3qz02F*1n$fuf+l8cbye2dz<%Kan%OcBVXVj3");

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.submitLogin();

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.assertInvalidLogin();

    }


    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "78332b0c-9b50-4b51-93d9-15b16ab5ea2b")
    public void LoginPageUnauthenticated2()
    {
        
        Pages.CustomerAuthentication.CustomerLoginPage _CustomerLoginPage = new Pages.CustomerAuthentication.CustomerLoginPage(driver);
    TestModellerLogger.SetLastNodeGuid("22b3605e-4116-46d9-89b0-1d98e344d10e");
    _CustomerLoginPage.goToURL();

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.enterEmail("invalid@invalid.com");

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.enterPassword("roni_cost3@example.com");

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.submitLogin();

    TestModellerLogger.SetLastNodeGuid("d60eaf48-ffcd-47e4-91d5-9a5339bd5b05");
    _CustomerLoginPage.assertInvalidLogin();

    }


    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "741a2e5b-ca42-4a7c-bfaf-04291fe6dc79")
    public void LoginPageAuthenticated()
    {
        
        Pages.CustomerAuthentication.CustomerLoginPage _CustomerLoginPage = new Pages.CustomerAuthentication.CustomerLoginPage(driver);
    TestModellerLogger.SetLastNodeGuid("22b3605e-4116-46d9-89b0-1d98e344d10e");
    _CustomerLoginPage.goToURL();

    TestModellerLogger.SetLastNodeGuid("9f004174-a87b-4a1c-b416-ecaf4714793b");
    _CustomerLoginPage.enterEmail("roni_cost@example.com");

    TestModellerLogger.SetLastNodeGuid("9f004174-a87b-4a1c-b416-ecaf4714793b");
    _CustomerLoginPage.enterPassword("roni_cost3@example.com");

    TestModellerLogger.SetLastNodeGuid("9f004174-a87b-4a1c-b416-ecaf4714793b");
    _CustomerLoginPage.submitLogin();

    TestModellerLogger.SetLastNodeGuid("9f004174-a87b-4a1c-b416-ecaf4714793b");
    _CustomerLoginPage.assertLoggedIn();

    }


}