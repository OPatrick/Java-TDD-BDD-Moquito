package test.org.cefim;

import org.cefim.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* Main Tester. 
* 
* @author <Authors name> 
* @since <pre>févr. 21, 2022</pre> 
* @version 1.0 
*/ 
public class MainTest { 

    private Main main;

    @Before
    public void before() throws Exception {
        main = new Main();
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: main(String[] args)
    *
    */
    @Test
    public void shouldReturn12WithValues1and2() throws Exception {
        assertEquals("12", main.generate(1, 2));
    }

}
