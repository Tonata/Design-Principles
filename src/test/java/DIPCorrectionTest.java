/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.designprinciples.DIP.Correction.WorkHours;
import com.tonata.designprinciples.config.AppConfig;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class DIPCorrectionTest {
    private static WorkHours service; 
    public DIPCorrectionTest() {
    }

    @Test
    public void dipCorrection() {
        Assert.assertEquals(service.hours() , "Standard 10 hours per staff member");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       service = (WorkHours)ctx.getBean("DIP");
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
