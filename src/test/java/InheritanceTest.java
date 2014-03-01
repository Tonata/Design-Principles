/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.designprinciples.Inheritance.Equipment;
import com.tonata.designprinciples.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class InheritanceTest {
    private static Equipment e;
    public InheritanceTest() {
    }
    @Test
    public void inheritanceTest() {
        Assert.assertEquals("Canon D900", e.getEquipmentName());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       e = (Equipment)ctx.getBean("Inheritance");
       e.setEquipmentName("Canon D900");
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
