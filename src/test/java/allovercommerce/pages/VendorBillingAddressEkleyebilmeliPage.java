package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorBillingAddressEkleyebilmeliPage {

    public VendorBillingAddressEkleyebilmeliPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

  //  @FindBy(xpath = "//span[.='Register']")
  //  public WebElement registerButton;

    @FindBy(xpath = "(//a[@href='https://allovercommerce.com/my-account-2/'])[3]")
    public WebElement myAccountLink;

    @FindBy(css = "#username")
    public WebElement signInUserName;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit' and @name='login']")
    public WebElement signInButton;


    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//a[@href='https://allovercommerce.com/store-manager/profile/']")
    public WebElement vendorProfilButton;

    @FindBy(xpath = "(//div[@id='wcfm_profile_address_head'])[1]")
    public WebElement vendorPersonelButton;

    @FindBy(xpath = "(//div[@id='wcfm_profile_address_head'])[2]")
    public WebElement vendorAdressButton;

    @FindBy(xpath = "//h3[.='Billing']")
    public WebElement BillingText;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement vendorPersonalFirstName;

    @FindBy(css = "#last_name")
    public WebElement vendorPersonalLastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement vendorPersonalEmail;

    @FindBy(css = "#password")
    public WebElement vendorPersonalPassword;

    @FindBy(id = "password_strength")
    public WebElement vendorPersonalPaswordStrength;


    @FindBy(css = "#bfirst_name")
    public WebElement vendorAddressFirstName;

    @FindBy(css = "#blast_name")
    public WebElement vendorAdsressLastName;

    @FindBy(css = "#email")
    public  WebElement vendorEmailBox;

    @FindBy(id = "wcfmprofile_save_button")
    public WebElement vendorSave;

    @FindBy(xpath = "//*[.='Profile saved successfully']")
    public WebElement profilSavedSuccessfully;

    @FindBy(css = "#baddr_1")
    public WebElement vendorAddressAddress1;

    @FindBy(css = "#baddr_2")
    public WebElement vendorAddressAddress2;

    @FindBy(css = "#bcountry")
    public WebElement vendorAddressCountryDDM;

    @FindBy(css = "#bcity")
    public WebElement vendorAdressCityTown;

    @FindBy(css = "#bstate")
    public WebElement vendorAddressStateCountry;

    @FindBy(css = "#bzip")
    public WebElement vendorAddressPostcodeZip;

    @FindBy(xpath = "//div[.='Profile saved successfully']")
    public WebElement vendorAddressProfileSavedSuccessfullyText;




    //****************************************************
    @FindBy(xpath = "//a[.='Become a Vendor']")
    public WebElement becomeaVendorButton;

    @FindBy(xpath = "//span[@id='email']")
    public WebElement fakeMailText;



    @FindBy(xpath = "//input[@name='wcfm_email_verified_button']")
    public WebElement reSendCode;

    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement vendorAddressButton;

    @FindBy(xpath = "//a[.='Edit Your Billing Address']")
    public WebElement editYourBillingAddress;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAddress;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement addressChangedAlert;

    @FindBy(xpath = "//table//tr[2]//td[1]")
    public WebElement addressTable;


}
