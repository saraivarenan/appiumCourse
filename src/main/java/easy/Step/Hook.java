package easy.Step;


import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import easy.utils.Base;


public class Hook {

    Base bs = new Base();

    @Before
    public void beforeHookfunction() throws MalformedURLException {
        bs.criarDriver();
    }

    @After
    public void afterHookfunction() {
        bs.teardown();
    }

}
