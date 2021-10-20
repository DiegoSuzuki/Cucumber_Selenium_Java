package pages;

import dataProviders.ConfigFileReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

  WebDriver driver;
  ConfigFileReader configFileReader;


  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    configFileReader= new ConfigFileReader();
  }

  @FindBy(id = "input-busca")
  @CacheLookup
  WebElement txtProduto;

  @FindBy(className = "sc-bTRMho bbCnrT")
  @CacheLookup
  WebElement btnSearch;

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

}