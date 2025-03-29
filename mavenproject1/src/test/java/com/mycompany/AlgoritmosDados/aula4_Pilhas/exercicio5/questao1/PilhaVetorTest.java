/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula4_Pilhas.exercicio5.questao1;

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
public class PilhaVetorTest {
    
    public PilhaVetorTest() {
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
     * Test of push method, of class PilhaVetor.
     */
    @Test
    public void testPush() throws PilhaCheiaException{
        System.out.println("push");
        PilhaVetor<Integer> instance = new PilhaVetor(3);
        instance.push(10);
        instance.push(20);
        instance.push(30);
        instance.push(40);
    }

    /**
     * Test of pop method, of class PilhaVetor.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilhaVetor<Integer> instance = new PilhaVetor(10);
        instance.push(10);
        instance.push(20);
        instance.push(30);
        
        assertEquals(30, instance.pop());
        assertEquals(20, instance.pop());
        assertEquals(10, instance.pop());
    }
    
    /**
     * Test of pop method, of class PilhaVetor.
     */
    @Test
    public void testPopVazia() throws PilhaVaziaExcpetion{
        System.out.println("pop");
        PilhaVetor<Integer> instance = new PilhaVetor(10);
        
        
        instance.pop();
    }

    /**
     * Test of peek method, of class PilhaVetor.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PilhaVetor<Integer> instance = new PilhaVetor(10);
        instance.push(10);
        instance.push(20);
        instance.push(30);
        
        assertEquals(30, instance.peek());
        assertEquals(30, instance.pop());
    }

    /**
     * Test of estaVazia method, of class PilhaVetor.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        PilhaVetor<Integer> instance = new PilhaVetor(10);
        boolean expResult = true;
        boolean result = instance.estaVazia();
        
        assertEquals(expResult, result);
        
        instance.push(10);
        System.out.println("Teste: " + instance.toString());
        expResult = false;
        result = instance.estaVazia();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of liberar method, of class PilhaVetor.
     */
    @Test
    public void testLiberar() {
        System.out.println("liberar");
        PilhaVetor<Integer> instance = new PilhaVetor(10);
        instance.push(10);
        instance.push(20);
        instance.push(30);
        instance.liberar();
        
        assertEquals(true, instance.estaVazia());
    }

    /**
     * Test of toString method, of class PilhaVetor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PilhaVetor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concatenar method, of class PilhaVetor.
     */
    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        PilhaVetor<Integer> instance = new PilhaVetor(20);
        instance.push(10);
        instance.push(20);
        instance.push(30);
        
        PilhaVetor<Integer> instance2 = new PilhaVetor(10);
        instance2.push(40);
        instance2.push(50);
        instance.concatenar(instance2);
        
        assertEquals("50,40,30,20,10", instance.toString());
    }
}
