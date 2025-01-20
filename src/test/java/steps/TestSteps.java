package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSteps {

    private ChromeDriver driver;


    public TestSteps() {
        System.setProperty("webdriver.chrome.driver", "/Users/irkan.ahmadov/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Given("Go to url")
    public void goToUrl() {
        driver.manage().window().maximize();
        driver.get("https://az.linkedin.com/");
    }
    @When("Login in linkedin")
    public void loginInLinkedin(){
        WebElement input1 = this.driver.findElement(By.name("session_key"));
        input1.sendKeys(new CharSequence[]{"ur.ramazanov@gmail.com"});
        WebElement input2 = this.driver.findElement(By.name("session_password"));
        input2.sendKeys(new CharSequence[]{"Urf@n19990818"});
        input2.sendKeys(new CharSequence[]{Keys.ENTER});
    }
    @And("Sharing post to linkedin")
    public void sharingPostToLinkedin() throws InterruptedException {
        WebElement input = this.driver.findElement(By.id("ember28"));
        input.click();
        Thread.sleep(1000L);
        WebElement input1 = this.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]"));
        Thread.sleep(1000L);
        input1.click();
        Thread.sleep(1000L);
        input1.sendKeys(new CharSequence[]{"Salam Nihad Abi"});
        Thread.sleep(1000L);
        WebElement input3 = this.driver.findElement(By.xpath("//*[@id=\"ember257\"]"));
        Thread.sleep(1000L);
        input3.click();
    }
    @Then("Quit linkedin")
    public void quitLinkedin(){this.driver.quit();}
}
