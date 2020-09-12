package com.cybertek.step_definitions;

import com.cybertek.pages.LandingPage;
import com.cybertek.utilities.Driver;
import org.junit.After;
import org.junit.runners.Parameterized;

public class Hooks {

@After
    public void tearDown(){
    Driver.closeDriver();
}



}
