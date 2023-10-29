package jubelio.step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import jubelio.config.env;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login extends env {
    @Given("login page jubelio")
    public void loginPageJubelio() {
        String loginPageAssert = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Login", loginPageAssert);
    }

    @When("input correct email")
    public void inputCorrectEmail() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qa.rakamin.jubelio@gmail.com");
    }

    @And("input correct password")
    public void inputCorrectPassword() {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jubelio123!");
    }

    @And("click login button")
    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user in on dashboard page")
    public void userInOnDashboardPage() throws InterruptedException {
        Thread.sleep(6000);
        String pageAssert = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Dashboard", pageAssert);
    }

    @Then("Display an error message below the email input")
    public void displayAnErrorMessageBelowTheEmailInput() {
        String belowEmailMessage = driver.findElement(By.xpath("//input[@name='email']/following-sibling::span[@class='help-block']")).getText();
        Assert.assertEquals("Email harus diisi.", belowEmailMessage);
    }

    @And("Display an error message below the password input")
    public void displayAnErrorMessageBelowThePasswordInput() {
        String belowPasswordMessage = driver.findElement(By.xpath("//input[@name='password']/following-sibling::span[@class='help-block']")).getText();
        Assert.assertEquals("Password harus diisi.", belowPasswordMessage);
    }

    @When("input invalid email format")
    public void inputInvalidEmailFormat() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qa.rakamin.jubelio@@gmail...com");
    }

    @Then("Display an invalid email error message below the email input")
    public void displayAnInvalidEmailErrorMessageBelowTheEmailInput()  {
        String belowEmailMessage = driver.findElement(By.xpath("//input[@name='email']/following-sibling::span[@class='help-block']")).getText();
        Assert.assertEquals("Format Email tidak valid.", belowEmailMessage);
    }

    @And("input invalid password less than six character")
    public void inputInvalidPasswordLessThanSixCharacter() {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jube");
    }

    @Then("Display an invalid password error message below the password input")
    public void displayAnInvalidPasswordErrorMessageBelowThePasswordInput() {
        String belowPasswordMessage = driver.findElement(By.xpath("//input[@name='password']/following-sibling::span[@class='help-block']")).getText();
        Assert.assertEquals("Password harus di antara 6 dan 30.", belowPasswordMessage);
    }
}
