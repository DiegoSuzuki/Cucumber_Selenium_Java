package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Dado("que estou acessando a aplicação")
    public void que_estou_acessando_a_aplicação() {

    }

    @Quando("digito o nome do produto {string}")
    public void digito_o_nome_do_produto(String produto) {
        homePage.setSearchInput(produto);
    }

}