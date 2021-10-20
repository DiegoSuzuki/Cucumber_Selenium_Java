package stepsDefinitions;

import cucumber.TestContext;
import io.cucumber.java.pt.E;
import pages.SearchResultPage;

public class SearchResultPageSteps {

    TestContext testContext;
    SearchResultPage searchResultPage;

    public SearchResultPageSteps(TestContext context) {
        testContext = context;
        searchResultPage = testContext.getPageObjectManager().getSearchResultPage();
    }

    @E("visualizo página URL {string}")
    public void visualizo_página_URL(String url) throws InterruptedException {
        searchResultPage.checkUrlSearchResult(url);
    }

    @E("clico no primeiro item")
    public void clico_no_primeiro_item() throws InterruptedException {
        searchResultPage.selectProduto();
    }

}
