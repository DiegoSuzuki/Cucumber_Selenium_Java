package stepsDefinitions;

import cucumber.TestContext;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CartPage;

public class CartPageSteps {

    TestContext testContext;
    CartPage cartPage;

    public CartPageSteps(TestContext context) {
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();
    }

    @Entao("o carrinho contém um item")
    public void o_carrinho_contem_um_item() throws InterruptedException {
        cartPage.checkProduct();
        driver.quit();
    }

    @Dado("que estou no checkout")
    public void que_estou_no_checkout() throws InterruptedException {
        //home = new Home(driver);
        driver.get("https://www.kabum.com.br/cgi-local/site/carrinho/carrinho.cgi");
    }

    @Quando("eu clico pra comprar o item da sugestão")
    public void eu_clico_pra_comprar_o_item_da_sugestao() throws InterruptedException {
        cartPage.buySuggestion();
    }

    @Então("o carrinho contém dois itens")
    public void o_carrinho_contem_dois_itens() throws InterruptedException {
        cartPage.checkProduct2();
        driver.quit();
    }
}
