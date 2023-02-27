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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/6a2fd459-96d7-44bf-9fd8-f23bcca480d8
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 188, profileId = 100254)
public class RegisterPet_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "7c159d9b-5f8a-4e19-86cd-da2b6f6ca37d")
    public void NegativeInvalidinput405Failure()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("98a95b30-3812-4d2e-9884-17a2f3073b08");
    _Post_addPet.Post_addPet_405("389348","","","","");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "ada125ad-c42f-44e3-9669-e1eb5affadbc")
    public void NegativeInvalidinput405Failure1()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("98a95b30-3812-4d2e-9884-17a2f3073b08");
    _Post_addPet.Post_addPet_405("sunt","voluptatem","","","");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "db592db4-6da2-4c82-b85b-e2b8795855d1")
    public void NegativeInvalidinput405Failure2()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("98a95b30-3812-4d2e-9884-17a2f3073b08");
    _Post_addPet.Post_addPet_405("dolore","commodi","#!_ @","","");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "296a15ac-4331-42e4-ab84-f9204c3d89c1")
    public void NegativeInvalidinput405Failure3()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("98a95b30-3812-4d2e-9884-17a2f3073b08");
    _Post_addPet.Post_addPet_405("sed","est","https://arielle.com","389348","");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "f5e33a22-211d-4b11-94f8-511d0aa0b69c")
    public void PositiveInvalidinput405Positive()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("8d4bd0ac-c896-41c4-8e9d-1592c8985ecd");
    _Post_addPet.Post_addPet_405("labore","id","http://earl.org","aperiam","available");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "a6880103-93d8-4f34-a4d9-7ae5bc5f0f1f")
    public void PositiveInvalidinput405Positive1()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("8d4bd0ac-c896-41c4-8e9d-1592c8985ecd");
    _Post_addPet.Post_addPet_405("laborum","inventore","http://verdie.org","dolorem","pending");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "6ec626da-36c7-4039-b130-ade9b7511df2")
    public void PositiveInvalidinput405Positive2()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("8d4bd0ac-c896-41c4-8e9d-1592c8985ecd");
    _Post_addPet.Post_addPet_405("et","inventore","http://ryleigh.biz","excepturi","sold");

    }

    @Test  (groups= {"Register Pet","Register Pet - Default Profile"})
    @TestModellerPath(guid = "60b86914-7827-4ad6-bcfe-535831b0bd1d")
    public void NegativeInvalidinput405Failure4()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("98a95b30-3812-4d2e-9884-17a2f3073b08");
    _Post_addPet.Post_addPet_405("aut","389348","","","");

    }

}