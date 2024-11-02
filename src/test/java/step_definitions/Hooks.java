package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utilities.DriverSetUp.quiteBrowser;
import static utilities.DriverSetUp.setBrowser;


public class Hooks {
    private static String browserName = System.getProperty("browser", "chrome");

    @Before
    public void openBrowser(){
        setBrowser(browserName);
    }

    @After
    public void closeBrowser(Scenario scenario){
        quiteBrowser(scenario);
    }
}
