package stepsDefinitions;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.CartPage;
import pages.HomePage;
import pages.SearchResultPage;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class BuscarProdutoStep {

    WebDriver driver;
    HomePage homePage;
    CartPage cartPage;
    PageObjectManager pageObjectManager;
    WebDriverManager webDriverManager;

    @Dado("que estou acessando a aplicação")
    public void que_estou_acessando_a_aplicação() {
//        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        home = new HomePage(driver);
        driver.get("https://www.kabum.com.br/");
    }

    @Quando("digito o nome do produto {string}")
    public void digito_o_nome_do_produto(String produto) {
        home.setSearchInput(produto);
    }

    @Quando("teclo enter")
    public void teclo_enter() {
        home.pressEnter();
    }

    @E("visualizo página URL {string}")
    public void visualizo_página_URL(String url) throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, url);
    }

    @E("clico no primeiro item")
    public void clico_no_primeiro_item() throws InterruptedException {
        SearchResultPage.selectProduto();
    }

    @Quando("clico no botao para ir para o carrinho")
    public void clico_no_botao_para_ir_para_o_carrinho() throws InterruptedException {
        Thread.sleep(2000);
        home.goToCart();
    }

    @Entao("o carrinho contém um item")
    public void o_carrinho_contém_um_item() throws InterruptedException {
        home.checkProduct();
        driver.quit();
    }

    @Dado("que estou no checkout")
    public void que_estou_no_checkout() throws InterruptedException {
        //home = new Home(driver);
        driver.get("https://www.kabum.com.br/cgi-local/site/carrinho/carrinho.cgi");
    }

    @Quando("eu clico pra comprar o item da sugestão")
    public void eu_clico_pra_comprar_o_item_da_sugestão() throws InterruptedException {
        home.buySuggestion();
    }

    @Então("o carrinho contém dois itens")
    public void o_carrinho_contém_dois_itens() throws InterruptedException {
        home.checkProduct2();
        driver.quit();
    }


}