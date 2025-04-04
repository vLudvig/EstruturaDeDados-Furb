/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula5_Filas.exercicio06.questao01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ludvi
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
        FilaVetor<Integer> instance = new FilaVetor(10);
        Integer expResult = 10;
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        Integer result = instance.retirar();
        assertEquals(expResult, result);
        expResult = 20;
        result = instance.retirar();
        assertEquals(expResult, result);
        expResult = 30;
        result = instance.retirar();
        assertEquals(expResult, result);
        assertEquals(true, instance.estaVazia() );
    }

    /**
     * Test of estaVazia method, of class FilaVetor.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        FilaVetor<Integer> instance = new FilaVetor(10);
        boolean expResult = false;
        instance.inserir(1);
        boolean result = instance.estaVazia();
        
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of FilaCheiaException class.
     */
    @Test
    public void testCheiaException() throws FilaCheiaException {
        System.out.println("estaVazia");
        FilaVetor<Integer> instance = new FilaVetor(3);
        
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        
        assertThrows(FilaCheiaException.class, () -> instance.inserir(40));
    }
    
    /**
     * Test of FilaVaziaException class.
     */
    @Test
    public void testVaziaException() throws FilaCheiaException {
        System.out.println("estaVazia");
        FilaVetor<Integer> instance = new FilaVetor(3);
        
        assertThrows(FilaVaziaException.class, () -> instance.retirar());
    }

    /**
     * Test of peek method, of class FilaVetor.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        FilaVetor<Integer> instance = new FilaVetor(5);
        
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        assertEquals(10, instance.peek());
        assertEquals(10, instance.retirar());
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
        FilaVetor<Integer> instance = new FilaVetor(5);
        
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        instance.liberar();
        
        assertEquals(true, instance.estaVazia());
    }
    
    /**
     * Test of criarFilaConcatenada method, of class FilaVetor.
     */
    @Test
    public void testCriarFilaConcatenada() {
        System.out.println("liberar");
        FilaVetor<Integer> instance = new FilaVetor(5);
        FilaVetor<Integer> instance2 = new FilaVetor(10);
        
        instance.inserir(10);
        instance2.inserir(20);
        instance2.inserir(30);
        instance2.inserir(40);
        instance.retirar();
        instance.inserir(10);
        instance.inserir(20);
        instance.retirar();
        instance.inserir(10);
        instance2.retirar();
        
        assertEquals(true, instance.estaVazia());
    }
}
