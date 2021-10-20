package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    public WebDriver ldriver;

    public SearchResultPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(className = "sc-bYEvvW bPAlPg")
    @CacheLookup
    WebElement btnProduto;

    public void selectProduto() throws InterruptedException {
        Thread.sleep(3000);
        btnProduto.click();
    }

}
