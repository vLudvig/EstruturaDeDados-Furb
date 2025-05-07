/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.prova2.VitorLuizMouiLudvig.questao2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vludvig
 */
public class ArvoreBinariaTest {
    
    public ArvoreBinariaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setRaiz method, of class ArvoreBinaria.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        ArvoreBinaria instance = new ArvoreBinaria();
        instance.setRaiz(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class ArvoreBinaria.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria expResult = null;
        NoArvoreBinaria result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class ArvoreBinaria.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        ArvoreBinaria instance = new ArvoreBinaria();
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pertence method, of class ArvoreBinaria.
     */
    @Test
    public void testPertence() {
        System.out.println("pertence");
        Object info = null;
        ArvoreBinaria instance = new ArvoreBinaria();
        boolean expResult = false;
        boolean result = instance.pertence(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ArvoreBinaria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArvoreBinaria instance = new ArvoreBinaria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarNos method, of class ArvoreBinaria.
     */
    @Test
    public void testContarNos() {
        System.out.println("contarNos");
        ArvoreBinaria instance = new ArvoreBinaria();
        int expResult = 0;
        int result = instance.contarNos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverter method, of class ArvoreBinaria.
     */
    @Test
    public void testInverter() {
        System.out.println("inverter");
        ArvoreBinaria instance = new ArvoreBinaria();
        instance.inverter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromString method, of class ArvoreBinaria.
     */
    @Test
    public void testFromString() {
        System.out.println("fromString");
        String str = "";
        ArvoreBinaria instance = new ArvoreBinaria();
        instance.fromString(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of noFromString method, of class ArvoreBinaria.
     */
    @Test
    public void testNoFromString() {
        System.out.println("noFromString");
        String str = "";
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria expResult = null;
        NoArvoreBinaria result = instance.noFromString(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarFolhas method, of class ArvoreBinaria.
     */
    @Test
    public void testContarFolhas() {
        System.out.println("contarFolhas");
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no1, no2, no3, no4, no5, no6;
        no6 = new NoArvoreBinaria(6);
        no5 = new NoArvoreBinaria(5);
        no4 = new NoArvoreBinaria(4);
        no3 = new NoArvoreBinaria(3,no5,no6);
        no2 = new NoArvoreBinaria(2,no4,no4);
        no1 = new NoArvoreBinaria(1,no2,no3);
        
        instance.setRaiz(no1);
        
        assertEquals(4, instance.contarFolhas());
    }
    
}
