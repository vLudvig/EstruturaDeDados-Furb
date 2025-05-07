/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.prova2.VitorLuizMouiLudvig.questao1;

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
public class FilaVetorTest {
    
    public FilaVetorTest() {
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
     * Test of inserir method, of class FilaVetor.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Object valor = null;
        FilaVetor instance = null;
        instance.inserir(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class FilaVetor.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        FilaVetor instance = null;
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class FilaVetor.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        FilaVetor instance = null;
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class FilaVetor.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        FilaVetor instance = null;
        Object expResult = null;
        Object result = instance.retirar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liberar method, of class FilaVetor.
     */
    @Test
    public void testLiberar() {
        System.out.println("liberar");
        FilaVetor instance = null;
        instance.liberar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarFilaConcatenadaByVitor method, of class FilaVetor.
     */
    @Test
    public void testCriarFilaConcatenadaByVitor() {
        System.out.println("criarFilaConcatenadaByVitor");
        FilaVetor instance = null;
        FilaVetor expResult = null;
        FilaVetor result = instance.criarFilaConcatenadaByVitor(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarFilaConcatenada method, of class FilaVetor.
     */
    @Test
    public void testCriarFilaConcatenada() {
        System.out.println("criarFilaConcatenada");
        FilaVetor instance = null;
        FilaVetor expResult = null;
        FilaVetor result = instance.criarFilaConcatenada(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FilaVetor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FilaVetor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimite method, of class FilaVetor.
     */
    @Test
    public void testGetLimite() {
        System.out.println("getLimite");
        FilaVetor instance = null;
        int expResult = 0;
        int result = instance.getLimite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encolher method, of class FilaVetor.
     */
    @Test
    public void testEncolher() {
        System.out.println("encolher");
        FilaVetor<Integer> instance = new FilaVetor(10);
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        instance.retirar();
        System.out.println("Antes de encolehr: "+ instance.toString());
        
        instance.encolher();
        System.out.println("Depois de encolehr: "+ instance.toString());
        
        
        assertEquals(2, instance.getLimite());
    }
    
}
