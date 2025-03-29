/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula4_Pilhas.exercicio5.questao2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class PilhaListaTest {
    
    public PilhaListaTest() {
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
     * Test of push method, of class PilhaLista.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        PilhaLista<Integer> instance = new PilhaLista();
        
        assertEquals(true, instance.estaVazia());
        
        instance.push(10);
        
        assertEquals(false, instance.estaVazia());
    }

    /**
     * Test of pop method, of class PilhaLista.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilhaLista<Integer> instance = new PilhaLista();
        instance.push(10);
        instance.push(20);
        instance.push(30);
        
        assertEquals(30, instance.pop());
        assertEquals(20, instance.pop());
        assertEquals(10, instance.pop());
        assertEquals(true, instance.estaVazia());
    }

    /**
     * Test of peek method, of class PilhaLista.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PilhaLista<Integer> instance = new PilhaLista();
        instance.push(10);
        instance.push(20);
        instance.push(30);
        
        assertEquals(30, instance.peek());
        assertEquals(30, instance.pop());
    }

    /**
     * Test of estaVazia method, of class PilhaLista.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        PilhaLista instance = new PilhaLista();
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liberar method, of class PilhaLista.
     */
    @Test
    public void testLiberar() {
        System.out.println("liberar");
        PilhaLista<Integer> instance = new PilhaLista();
        instance.push(10);
        instance.push(20);
        instance.push(30);
        
        instance.liberar();
        
        assertEquals(true, instance.estaVazia());
    }

    /**
     * Test of toString method, of class PilhaLista.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PilhaLista instance = new PilhaLista();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
