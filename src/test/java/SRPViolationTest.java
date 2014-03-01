/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.tonata.designprinciples.SRP.Violation.Email;
import com.tonata.designprinciples.SRP.Violation.JobEmail;
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
public class SRPViolationTest {
    private static JobEmail service;
    public SRPViolationTest() {
    }
     @Test
    public void srpViolation() {
        service.setSender("Tonata");
        Assert.assertEquals("Tonata" ,service.getSender());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       service = new JobEmail();
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
