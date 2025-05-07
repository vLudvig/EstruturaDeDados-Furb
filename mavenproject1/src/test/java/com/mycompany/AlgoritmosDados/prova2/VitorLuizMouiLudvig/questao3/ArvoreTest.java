/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.prova2.VitorLuizMouiLudvig.questao3;

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
public class ArvoreTest {
    
    public ArvoreTest() {
    }
    
    private Arvore createArvoreDefault(){
        var arvore = new Arvore<Integer>();
        var no4 = new NoArvore<Integer>(10);
        var no3 = new NoArvore<Integer>(20);
        var no2 = new NoArvore<Integer>(40);
        var no1 = new NoArvore<Integer>(90);
       
       no4.inserirFilho(no3);
       no4.inserirFilho(no2);
       no2.inserirFilho(no1);
       
       arvore.setRaiz(no4);
       
       return arvore;
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
     * Test of setRaiz method, of class Arvore.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        NoArvore raiz = null;
        Arvore instance = new Arvore();
        instance.setRaiz(raiz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class Arvore.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        Arvore instance = new Arvore();
        NoArvore expResult = null;
        NoArvore result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Arvore.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Arvore instance = new Arvore();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterRepresentacaoTextual method, of class Arvore.
     */
    @Test
    public void testObterRepresentacaoTextual() {
        System.out.println("obterRepresentacaoTextual");
        Arvore instance = new Arvore();
        String expResult = "";
        String result = instance.obterRepresentacaoTextual(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertence() {
        System.out.println("pertence");
        Object info = null;
        Arvore instance = new Arvore();
        boolean expResult = false;
        boolean result = instance.pertence(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarNos method, of class Arvore.
     */
    @Test
    public void testContarNos() {
        System.out.println("contarNos");
        Arvore instance = new Arvore();
        int expResult = 0;
        int result = instance.contarNos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarNosInternos method, of class Arvore.
     */
    @Test
    public void testContarNosInternos() {
        System.out.println("contarNosInternos");
        Arvore instance = this.createArvoreDefault();
        int expResult = 3;
        int result = instance.contarNosInternos();
        assertEquals(expResult, result);
        
    }
    
}
