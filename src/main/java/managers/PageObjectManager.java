package managers;

import org.openqa.selenium.WebDriver;

import pages.CartPage;
import pages.HomePage;
import pages.PreCartPage;
import pages.SearchResultPage;


public class PageObjectManager {

    private WebDriver driver;

    private SearchResultPage searchResultPage;

    private PreCartPage preCartPage;

    private CartPage cartPage;

    private HomePage homePage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }



    public HomePage getHomePage(){

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }

    public SearchResultPage getSearchResultPage() {

        return (searchResultPage == null) ? searchResultPage = new SearchResultPage(driver) : searchResultPage;

    }

    public PreCartPage getPreCartPage() {

        return (preCartPage == null) ? preCartPage = new PreCartPage(driver) : preCartPage;

    }

    public CartPage getCartPage() {

        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

    }

}