package org.com.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.com.helper.utility;

import java.sql.DriverManager;

import static org.com.helper.utility.driver;
import static org.com.helper.utility.run_driver;


public class hooks {


    @Before
    public void set_up () {
        System.out.println("before : ");
    }

    @After
    public void tear_down () {
        utility Utility = new utility();
        Utility.close_driver();
        System.out.println("after : quit driver");

    }
}
