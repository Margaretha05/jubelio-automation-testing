package jubelio.step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import jubelio.config.env;
import org.junit.Assert;
import org.openqa.selenium.By;

public class produk extends env {
    @Given("in review page")
    public void inReviewPage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        String titleAssert = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1")).getText();
        Assert.assertEquals("In Review", titleAssert);
    }

    @When("click add new")
    public void clickAddNew() {
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[1]/div[2]/div/div/button")).click();
    }

    @And("input detail barang")
    public void inputDetailBarang() throws InterruptedException {
        // Input Nama
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div/input")).sendKeys("INFINIX SMART 6");
        // Select Non Variant (Kategori barang)
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div/div/div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@data-item-id=1000000005]")).click();
        // Select Merek
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div/div/div[2]/div[1]/input")).sendKeys("infinix");
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@data-item-id=124444458]")).click();
        // Input SKU
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[5]/div/input")).sendKeys("S02.H01.I01.000.000099");
        // Input Barcode
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[6]/div/input")).sendKeys("9876543210");
        // Input Deskripsi brand
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/span/br")).sendKeys("Brand : INFINIX\n" +
                "Layar 6.6 inch HD+ 500 nits Waterdrop Sunlight Display\n" +
                "Baterai 5000mAh\n" +
                "RAM 2GB + ROM 32GB\n" +
                "Micro SD Storage hingga 512GB\n" +
                "Real Camera 8MP + AI Lens AI Dual Camera Dual - Flash Light\n" +
                "From Camera 5MP FF with Single Flash Light");
    }

    @And("input variasi barang")
    public void inputVariasiBarang() {
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[3]/div[2]/div/div/div[3]/table/tbody/tr/td[1]/div/input")).sendKeys("S02.H01.I01.000.00003");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[3]/div[2]/div/div/div[3]/table/tbody/tr/td[5]/div/input")).sendKeys("2500000");
    }

    @And("input other field")
    public void inputOtherField() {
        // Input berat barang
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[4]/div/div/div[2]/div/div/div[1]/div[1]/div/input")).sendKeys("1000");
        // Input Harga default
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[5]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div/div[1]/div/input")).sendKeys("3000000");
    }

    @And("click simpan button")
    public void clickSimpanButton() {
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[4]/div[2]/button")).click();
    }

    @And("upload product image")
    public void uploadProductImage() {
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div/input"))
                .sendKeys("C:\\Users\\Public\\Documents\\Margaretta-Rakamin\\jubelio-testing\\src\\test\\java\\jubelio\\resources\\images\\image.png");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div/input"))
                .sendKeys("C:\\Users\\Public\\Documents\\Margaretta-Rakamin\\jubelio-testing\\src\\test\\java\\jubelio\\resources\\images\\image.png");
    }
}
