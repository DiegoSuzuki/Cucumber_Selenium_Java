package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public WebDriver ldriver;

    public CartPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[@id=\"CorpoCarrinho\"]/div[1]/div[2]/div[2]/div[1]/div/div[2]/h4")
    @CacheLookup
    WebElement divProduto;

    @FindBy(xpath = "//*[@id=\"CorpoCarrinho\"]/div[1]/div[3]/div[1]/div[1]/span")
    @CacheLookup
    WebElement divProduto2;

    @FindBy(xpath = "//*[@id=\"swipper-comprejunto\"]/div/div[1]/div[1]/div/div[2]/div[5]/a/img")
    @CacheLookup
    WebElement  btnBuySuggestion;

    public void checkProduct() throws InterruptedException {
        Thread.sleep(3000);
        divProduto.getText();
    }

    public void buySuggestion() throws InterruptedException {
        Thread.sleep(10000);
        btnBuySuggestion.click();
    }

    public void checkProduct2() throws InterruptedException {
        Thread.sleep(5000);
        divProduto2.getText();
    }
}
