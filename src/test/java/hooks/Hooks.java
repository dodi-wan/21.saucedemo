package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.com.helper.Utility;

import static org.com.helper.Utility.driver;
import static org.com.helper.Utility.run_driver;


public class Hooks {
    Utility helper = new Utility();

    @Before
    public void set_up () {
        System.out.println("before : ");

        if (driver == null) {
            run_driver();
            driver.get("https://www.saucedemo.com/");
        }
    }


    @After
    public void tear_down () {
        helper.close_driver();
        System.out.println("after : quit driver");

    }
}
