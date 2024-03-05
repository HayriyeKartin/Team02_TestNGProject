package allovercommerce.tests;

import allovercommerce.pages.VendorBillingAddressEkleyebilmeliPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VendorBillingAddressEkleyebilmeli {


    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void FirstNameLastNameVeEmailAddresiOtomatikGelmeli() {
        VendorBillingAddressEkleyebilmeliPage vendorBillingAddressEkleyebilmeliPage = new VendorBillingAddressEkleyebilmeliPage();
        Faker faker = new Faker();
        // Web sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));

        //Vendor en altta bulunan My Account yazısına tıklar
        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.myAccountLink);

        //Vendor Signin yapar
        String signUpUsername = ConfigReader.getProperty("vendorMail");
        String password = ConfigReader.getProperty("vendorPasswordd");
        vendorBillingAddressEkleyebilmeliPage.signInUserName.sendKeys(signUpUsername);
        vendorBillingAddressEkleyebilmeliPage.password.sendKeys(password);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.signInButton);

        //Vendor Store Manger butonuna tıklar

        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.storeManagerButton);

        //Vendor profil resminin üstüne tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorProfilButton);
        //Profil manager sayfasında bulunan personel bilgilerindeki First Name/ Last Name kısmına profil ismi girilir
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorPersonelButton);
        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.vendorPersonalEmail);
        vendorBillingAddressEkleyebilmeliPage.vendorPersonalFirstName.clear();
        vendorBillingAddressEkleyebilmeliPage.vendorPersonalFirstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.bekle(2);
        vendorBillingAddressEkleyebilmeliPage.vendorPersonalLastName.clear();
        vendorBillingAddressEkleyebilmeliPage.vendorPersonalLastName.sendKeys(ConfigReader.getProperty("lastName"));
        ReusableMethods.bekle(2);
        //Profil manager sayfasında e-mail ve password kısmının otomatik olarak gelip gelmediği kontrol edilir
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorPersonalEmail.getAttribute("value").contains("kingcharles.lucy@farmoaks.com"));
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorPersonalPassword.getAttribute("value").isEmpty());
        //Save butonuna tıklanır

        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.vendorSave);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorSave);
        ReusableMethods.bekle(2);
        //Profil manager sayfasına tekrar giriş yapılır ve First Name / Last Name kısımlarının otomatik olarak gelip gelmediği kontrol edilir
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorProfilButton);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorPersonelButton);
        //Profil manager sayfasında First Name/Last Name bilgilerinin otomatik olarak geldiği doğrulanır
        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.vendorPersonalEmail);
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorPersonalFirstName.getAttribute("value").contains("kingcharles"));
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorPersonalLastName.getAttribute("value").contains("lucy"));
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorPersonalEmail.getAttribute("value").contains("kingcharles.lucy@farmoaks.com"));





    }

    @Test
    public void CountryRegionStreetAddressTownCityStateZIPCodeVePhoneGirilmeli() {
        VendorBillingAddressEkleyebilmeliPage vendorBillingAddressEkleyebilmeliPage = new VendorBillingAddressEkleyebilmeliPage();
        Faker faker = new Faker();
        Select select = new Select(vendorBillingAddressEkleyebilmeliPage.vendorAddressCountryDDM);
        // Web sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Vendor en altta bulunan My Account yazısına tıklar
        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        //Vendor Signin yapar
        String signUpUsername = ConfigReader.getProperty("vendorMail");
        String password = ConfigReader.getProperty("vendorPasswordd");
        vendorBillingAddressEkleyebilmeliPage.signInUserName.sendKeys(signUpUsername);
        vendorBillingAddressEkleyebilmeliPage.password.sendKeys(password);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.signInButton);
        //Vendor Store Manger butonuna tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.storeManagerButton);
        //Vendor profil resminin üstüne tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorAdressButton);
        //Profil manager sayfasında Address kısmındaki Address 1 ve Address 2 bilgilerine Street Address bilgisi girilir
        vendorBillingAddressEkleyebilmeliPage.vendorAddressAddress1.sendKeys(faker.address().fullAddress());
        vendorBillingAddressEkleyebilmeliPage.vendorAddressAddress2.sendKeys(faker.address().fullAddress());
        //Profil manager sayfasında adress kısmındaki Country /City-Town bilgileri girilir
        select.selectByIndex(5);
        //Profil manager sayfasında adress kısmındaki State/Country bilgileri girilir
        vendorBillingAddressEkleyebilmeliPage.vendorAdressCityTown.sendKeys(faker.address().city());
        vendorBillingAddressEkleyebilmeliPage.vendorAddressStateCountry.sendKeys(faker.address().state());
        //Profil manager sayfasında adress kısmındaki Poscode/Zip bilgileri girilir
        vendorBillingAddressEkleyebilmeliPage.vendorAddressPostcodeZip.sendKeys(faker.address().zipCode());
        //Save buttonuna tıklanır
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorSave);
        //Profile saved successfully yazısı ile Address kısmındaki bilgilerin kayıt yapılabildigi dogrulanır.
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorAddressProfileSavedSuccessfullyText.isDisplayed());


    }

    @Test
    public void SaveAddressButonunaTıklayarakBillingAddreseEklenmeli () {

        VendorBillingAddressEkleyebilmeliPage vendorBillingAddressEkleyebilmeliPage = new VendorBillingAddressEkleyebilmeliPage();
        Faker faker = new Faker();

        // Web sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Vendor en altta bulunan My Account yazısına tıklar
        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        //Vendor Signin yapar
        String signUpUsername = ConfigReader.getProperty("vendorMail");
        String password = ConfigReader.getProperty("vendorPasswordd");
        vendorBillingAddressEkleyebilmeliPage.signInUserName.sendKeys(signUpUsername);
        vendorBillingAddressEkleyebilmeliPage.password.sendKeys(password);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.signInButton);
        //Vendor Store Manger butonuna tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.storeManagerButton);
        //Vendor profil resminin üstüne tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorProfilButton);
        //address butonuna tıklanır
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorAdressButton);
        //Profil manager sayfasında Address kısmındaki Address 1  bilgilerine Address bilgisi girilir
        vendorBillingAddressEkleyebilmeliPage.vendorAddressAddress1.sendKeys(faker.address().fullAddress());
        //Save Address butonuna tıklanır ve Fatura Adresi bilgileri eklendiği doğrulanır
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorSave);
        //Profile saved successfully yazısı ile Address kısmındaki bilgilerin kayıt yapılabildigi dogrulanır.
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorAddressProfileSavedSuccessfullyText.isDisplayed());


    }

    @Test
    public void AddressChangedSuccessfullyMetniGörülmeli() {

        VendorBillingAddressEkleyebilmeliPage vendorBillingAddressEkleyebilmeliPage = new VendorBillingAddressEkleyebilmeliPage();
        Faker faker = new Faker();

        // Web sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Vendor en altta bulunan My Account yazısına tıklar
        ReusableMethods.scroll(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.myAccountLink);
        //Vendor Signin yapar
        String signUpUsername = ConfigReader.getProperty("vendorMail");
        String password = ConfigReader.getProperty("vendorPasswordd");
        vendorBillingAddressEkleyebilmeliPage.signInUserName.sendKeys(signUpUsername);
        vendorBillingAddressEkleyebilmeliPage.password.sendKeys(password);
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.signInButton);
        //Vendor Store Manger butonuna tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.storeManagerButton);
        //Vendor profil resminin üstüne tıklar
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorProfilButton);
        //address butonuna tıklanır
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorAdressButton);
        //State/Country kısmına bilgi eklenebildigi dogrulanır
        vendorBillingAddressEkleyebilmeliPage.vendorAddressStateCountry.sendKeys("ANKARA");
        //Save Address butonuna tıklanır ve Fatura Adresi bilgileri eklendiği doğrulanır
        ReusableMethods.click(vendorBillingAddressEkleyebilmeliPage.vendorSave);
        //Profile saved successfully yazısı ile Address kısmındaki bilgilerin kayıt yapılabildigi dogrulanır.
        Assert.assertTrue(vendorBillingAddressEkleyebilmeliPage.vendorAddressProfileSavedSuccessfullyText.isDisplayed());

    }

    @AfterMethod
    public void tearDown() {

        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }
}