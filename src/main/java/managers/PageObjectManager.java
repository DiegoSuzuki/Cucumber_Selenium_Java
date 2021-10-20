package managers;



import org.openqa.selenium.WebDriver;

import pages.CartPage;
import pages.HomePage;
import pages.SearchResultPage;


public class PageObjectManager {

    private WebDriver driver;

    private SearchResultPage searchResultPage;

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



    public CartPage getCartPage() {

        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

    }

}