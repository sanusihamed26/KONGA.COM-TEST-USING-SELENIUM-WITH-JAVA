import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testkOnga {
    private WebDriver driver;

    @Test
    public void start() throws InterruptedException{
        System.setProperty("web-driver.gecko.driver","C:\\Users\\User\\IdeaProjects\\TestkKonga\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.konga.com");

        Thread.sleep(10000);

        //login
        driver.findElement(By.xpath("//a[normalize-space()='Login / Signup']")).click();
        Thread.sleep(10000);

        //insert email address
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sanusihamed26@gmail.com");

        //insert password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("omotoyosi1");

        //click on submit option
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(10000);

        //click on computers and accessories
        driver.findElement(By.cssSelector("div.ais-InstantSearch__root section.d6575_J-kZm._1eecb_eqPMu div.e5dc4_DR8xw:nth-child(5) nav:nth-child(1) div:nth-child(3) div._46ff9_Nvz9p._716d0_1mCht div._0d327_3ftRW > a.ef511_2c5_i:nth-child(2)")).click();
        Thread.sleep(50000);
        //click on laptop
        driver.findElement(By.xpath("//span[normalize-space()='Laptops']")).click();
        Thread.sleep(30000);

        //click on apple macbooks
        driver.findElement(By.xpath("//span[normalize-space()='Apple MacBooks']")).click();
        Thread.sleep(30000);
        // Add item to cart
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[3]/section[1]/main[1]/section[3]/section[1]/section[1]/section[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")).click();
        Thread.sleep(60000);

        // click on my cart
        driver.findElement(By.xpath("//span[normalize-space()='My Cart']")).click();
        Thread.sleep(90000);

        // click on checkout button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        Thread.sleep(90000);

        // click on pay now option
        driver.findElement(By.cssSelector("div.ais-InstantSearch__root section.d6575_J-kZm div.c6dfe_HidJc:nth-child(3) section._0863a_3x99A main._050ef_K0hT7 div._7e0c4_1mL_a div._62f39_301Jg div.f78ce_2EMqS section._4b230_19Wk8._651d7_qAjL2.da539_3JsSH:nth-child(3) div._46c08_1Sov4 div._72d4a_2grAE div.ef287_1UjlY div._92b3c_pq4Z2 span:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(90000);

        // click on continue to payment button
        driver.findElement(By.xpath("//button[contains(text(),'Continue to Payment')]")).click();
        Thread.sleep(90000);

        driver.quit();

    }
}
