/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.designprinciples.Encapsulation.Customer;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class EncapsulationTest {
    private static Customer c;
    public EncapsulationTest() {
    }
    @Test
    public void encapTest() {
        Assert.assertEquals("Thomas", c.getFirstName());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        c = new Customer();
        c.setFirstName("Thomas");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
