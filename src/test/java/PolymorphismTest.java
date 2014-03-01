/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.designprinciples.Polymorphism.Equipment;
import com.tonata.designprinciples.Polymorphism.NotebookPC;
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
public class PolymorphismTest {
    private static Equipment equip;
    public PolymorphismTest() {
    }

    @Test
    public void polymorphismTest() {
        Assert.assertEquals(equip.getEquipmentName(), "ASUS K53U");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        equip = new NotebookPC("ASUS K53U");
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
