import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

        private final String EMAIL_ADDRESS = "sanusihamed26@gmail.com";
        private final String PASSWORD = "omotoyosi1";

        //login
        @FindBy(xpath = "//a[normalize-space()='Login / Signup']")
        private WebElement loginsignup;

        //insert email addrerss
        @FindBy(xpath = "//input[@id='username']")
        private WebElement username;

        //insert password
        @FindBy(xpath = "//input[@id='password']")
        private WebElement password;

        //click on login button
        @FindBy(xpath = "//button[normalize-space()='Login']")
        private WebElement login;

        // click on computers and accessories
        @FindBy(css = "div.ais-InstantSearch__root section.d6575_J-kZm._1eecb_eqPMu div.e5dc4_DR8xw:nth-child(5) nav:nth-child(1) div:nth-child(3) div._46ff9_Nvz9p._716d0_1mCht div._0d327_3ftRW > a.ef511_2c5_i:nth-child(2)")
        private WebElement accessories;

        // click on laptop
        @FindBy(xpath = "//span[normalize-space()='Laptops']")
        private WebElement laptop;

        //click on apple macbooks
        @FindBy(xpath = "//span[normalize-space()='Apple MacBooks']")
        private WebElement macbook;

        // Add item to cart
        @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/div[3]/section[1]/main[1]/section[3]/section[1]/section[1]/section[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
        private WebElement item;

        // click on my cart
        @FindBy(xpath = "//span[normalize-space()='My Cart']")
        private WebElement mycart;

        // click on checkout button
        @FindBy(xpath = "/html/body/div[1]/div/section/div[3]/section/section/aside/div[3]/div/div[2]/button")
        private WebElement checkout;

        // click on pay now option
        @FindBy(css = "div.ais-InstantSearch__root section.d6575_J-kZm div.c6dfe_HidJc:nth-child(3) section._0863a_3x99A main._050ef_K0hT7 div._7e0c4_1mL_a div._62f39_301Jg div.f78ce_2EMqS section._4b230_19Wk8._651d7_qAjL2.da539_3JsSH:nth-child(3) div._46c08_1Sov4 div._72d4a_2grAE div.ef287_1UjlY div._92b3c_pq4Z2 span:nth-child(1) > input:nth-child(1)")
        private WebElement paynow;

        // click on continue to payment button
        @FindBy(xpath = "//button[contains(text(),'Continue to Payment')]")
        private WebElement payment;
        public WebForm(WebDriver driver)
        {
            super(driver);
        }
        public void loginSignup(){
                this.loginsignup.click();
        }
        public void enterEmailAddress(){
            this.username.sendKeys(EMAIL_ADDRESS);
        }
        public void enterPassword(){
            this.password.sendKeys(PASSWORD);
        }

        public void clickLogin(){
            this.login.click();
        }
        public void clickcomputer(){
                this.accessories.click();
        }
        public void clicklaptop(){
                this.laptop.click();
        }
        public void clickapplemacbooks(){
                this.macbook.click();
        }
        public void selectitem(){
                this.item.click();
        }
        public void mycart(){
                this.mycart.click();
        }
        public void checkout(){
                this.checkout.click();
        }
        public void payNow(){
                this.paynow.click();
        }
        public void paymentButton(){
                this.payment.click();
        }



}
