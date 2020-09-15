package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GlobalHooks {
    private static boolean dunit = false;

    @Before
    public void beforeAll() {
        if(!dunit) {
            //Runtime.getRuntime().addShutdownHook();
            // do the beforeAll stuff...
            System.out.println("GLOBAL_BEFORE");
            dunit = true;
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            System.out.println("JESTEM WSZEDZIE");
            if (scenario.isFailed()) {
                System.out.println("NAZWA SCENARIUSZA: "+scenario.getName());
                System.out.println("MOJE TESTY - Scenario failed");
            }
        } finally {

        }
    }
}