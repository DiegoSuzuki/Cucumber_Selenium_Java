package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
  public WebDriver ldriver;

  public Home(WebDriver rdriver) {
    ldriver = rdriver;
    PageFactory.initElements(rdriver, this);
  }

  @FindBy(className = "sprocura")
  @CacheLookup
  WebElement txtProduto;

  @FindBy(id = "bt-busca")
  @CacheLookup
  WebElement btnSearch;

  @FindBy(xpath = "//*[@id=\"listagem-produtos\"]/div/div[3]/div/div[2]/div[2]/a[1]/img")
  @CacheLookup
  WebElement btnProduto;

  @FindBy(className = "go-to-cart-button")
  @CacheLookup
  WebElement btnGotoCart;

  @FindBy(xpath = "//*[@id=\"CorpoCarrinho\"]/div[1]/div[2]/div[2]/div[1]/div/div[2]/h4")
  @CacheLookup
  WebElement divProduto;

  @FindBy(xpath = "//*[@id=\"CorpoCarrinho\"]/div[1]/div[3]/div[1]/div[1]/span")
  @CacheLookup
  WebElement divProduto2;

  @FindBy(xpath = "//*[@id=\"swipper-comprejunto\"]/div/div[1]/div[1]/div/div[2]/div[5]/a/img")
  @CacheLookup
  WebElement  btnBuySuggestion;

  public void setSearchInput(String produto) {
    txtProduto.clear();
    txtProduto.sendKeys(produto);
  }

  public void clickSearchBtn() {
    btnSearch.click();
  }

  public void pressEnter() {
    txtProduto.sendKeys(Keys.ENTER);
  }

  public void selectProduto() throws InterruptedException {
    Thread.sleep(3000);
    btnProduto.click();
  }
  public void goToCart(){ btnGotoCart.click();}

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