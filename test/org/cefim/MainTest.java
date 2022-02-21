package test.org.cefim;

import org.cefim.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void shouldReturn12WithValues1and2() throws Exception {
        assertEquals("12", main.generate(1, 2));
    }

    @Test
    public void shouldReturn12FizzWithValues1To3() {
        assertEquals("12Fizz", main.generate(1, 3));
    }

    @Test
    public void shouldReturn12Fizz4BuzzWithValues1To5() {
        assertEquals("12Fizz4Buzz", main.generate(1, 5));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzWithValues1To15() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", main.generate(1, 15));
    }
}
