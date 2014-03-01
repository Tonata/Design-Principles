/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.designprinciples.LSP.Correction.GraphicDesigner;
import junit.framework.Assert;
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
public class LSPCorrectionTest {
    private static GraphicDesigner designer;
    public LSPCorrectionTest() {
    }

    @Test
    public void lspCorrection() {
        designer.setWorkerID("A133N");
        Assert.assertEquals("A133N", designer.getWorkedId());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        designer = new GraphicDesigner();
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
