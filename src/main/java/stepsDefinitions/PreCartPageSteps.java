package stepsDefinitions;

import cucumber.TestContext;
import io.cucumber.java.pt.Quando;
import pages.PreCartPage;

public class PreCartPageSteps {

    TestContext testContext;
    PreCartPage preCartPage;

    public PreCartPageSteps(TestContext context) {
        testContext = context;
        preCartPage = testContext.getPageObjectManager().getPreCartPage();
    }

    @Quando("clico no botao para ir para o carrinho")
    public void clico_no_botao_para_ir_para_o_carrinho() throws InterruptedException {
        Thread.sleep(2000);
        preCartPage.goToCart();
    }
}