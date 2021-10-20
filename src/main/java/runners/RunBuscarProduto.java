package runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions
        (
                features="src\\test\\resources\\feature\\",
                glue= "stepsDefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty",
                        "html:test-output"}

        )

public class RunBuscarProduto {

}
