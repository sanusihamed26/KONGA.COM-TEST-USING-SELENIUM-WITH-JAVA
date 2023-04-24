import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {

    private static final WebDriver driver = new FirefoxDriver();


    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("web-driver.gecko.driver", Utils.FIREFOX_DRIVER_LOCATION);

    }

    @Test(testName = "successful login")
    public static void Login() throws InterruptedException{
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        Thread.sleep(70000);
        webForm.loginSignup();
        Thread.sleep(20000);
        webForm.enterEmailAddress();
        webForm.enterPassword();
        webForm.clickLogin();
        Thread.sleep(10000);
    }

    @Test(testName = "computers and accessories")
    public static void accessory() throws InterruptedException{
        WebForm webForm = new WebForm(driver);
        webForm.clickcomputer();
        Thread.sleep(50000);
        webForm.clicklaptop();
        webForm.clickapplemacbooks();
        Thread.sleep(10000);
        webForm.selectitem();
        Thread.sleep(5000);
    }

    @Test(testName = "checkout")
    public static void checkout() throws InterruptedException{
        WebForm webForm = new WebForm(driver);
        webForm.mycart();
        Thread.sleep(30000);
        webForm.checkout();
        Thread.sleep(30000);
    }

    @Test(testName = "PaymentOption")
    public static void pay() throws InterruptedException{
        WebForm webForm = new WebForm(driver);
        webForm.payNow();
        Thread.sleep(10000);
        webForm.paymentButton();
        Thread.sleep(2000);
    }
    @AfterSuite
    public static void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
