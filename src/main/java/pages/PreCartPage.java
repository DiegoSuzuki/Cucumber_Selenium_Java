package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreCartPage {

    public WebDriver ldriver;

    public PreCartPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(className = "sc-eCstlR eyLMzs buttonGoToCart")
    @CacheLookup
    WebElement btnGotoCart;

    public void goToCart(){ btnGotoCart.click();}
}