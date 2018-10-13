/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roman
 */
public class ModelTest {

    public ModelTest() {
    }

    @Test
    public void testSomeMethod() {
        Model model = new Model();
        assertEquals("HELLO", model.respond("response"));
    }

}
