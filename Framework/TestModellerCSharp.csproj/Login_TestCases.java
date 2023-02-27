package tests;

import jakarta.mail.*;
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
import io.restassured.RestAssured;

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/fee8f6b0-16b5-482d-8f0d-83b5c8d48cb2
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 170, profileId = 100209)
public class Login_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "23ee3043-6178-4436-a8f1-1c3d1b1c2045")
    public void PositiveLoginSuccess()
    {
        
           pages.ReqresAuthentication _ReqresAuthentication = new pages.ReqresAuthentication(getDriver());
    TestModellerLogger.SetLastNodeGuid("64eae966-4501-4c88-9745-d1c4388755c0");
    _ReqresAuthentication.login("eve.holt@reqres.in","pistol",200);

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "3ac643ee-4fb1-45b0-bcd4-4a8bb07b0d50")
    public void NegativeLoginError()
    {
        
           pages.ReqresAuthentication _ReqresAuthentication = new pages.ReqresAuthentication(getDriver());
    TestModellerLogger.SetLastNodeGuid("5e69b285-e149-4c73-8605-9ac547fe836d");
    _ReqresAuthentication.login("eve.holt@reqres.in","#!_ @",400);

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "6c8a27f0-9848-4763-8dfe-edac05b89c91")
    public void NegativeLoginError1()
    {
        
           pages.ReqresAuthentication _ReqresAuthentication = new pages.ReqresAuthentication(getDriver());
    TestModellerLogger.SetLastNodeGuid("5e69b285-e149-4c73-8605-9ac547fe836d");
    _ReqresAuthentication.login("james.walker","",400);

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "bedc4678-d255-458e-a3a0-4c0d058ce80b")
    public void NegativeLoginError2()
    {
        
           pages.ReqresAuthentication _ReqresAuthentication = new pages.ReqresAuthentication(getDriver());
    TestModellerLogger.SetLastNodeGuid("5e69b285-e149-4c73-8605-9ac547fe836d");
    _ReqresAuthentication.login("","",400);

    }

}