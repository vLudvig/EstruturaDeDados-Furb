/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaDuplamenteEncadeada;

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
public class ListaDuplaTest {
    
    public ListaDuplaTest() {
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
     * Test of getPrimeiro method, of class ListaDupla.
     */
    @Test
    public void testGetPrimeiro() {
        System.out.println("getPrimeiro");
        ListaDupla instance = new ListaDupla();
        NoListaDupla expResult = null;
        NoListaDupla result = instance.getPrimeiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserir method, of class ListaDupla.
     */
    @Test
    public void testInserirAndRetirar() {
        System.out.println("inserir e remover");
        ListaDupla<Integer> instance = new ListaDupla();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
        
        
        
        assertEquals("20, 15, 10, 5" , instance.toString());
        instance.exibirOrdemInversa();
        instance.retirar(20);
        assertEquals("15, 10, 5" , instance.toString());
        instance.exibirOrdemInversa();
    }

    /**
     * Test of buscar method, of class ListaDupla.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        ListaDupla<Integer> instance = new ListaDupla();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
        
        assertEquals(20, instance.buscar(20).getInfo());
        assertEquals(10, instance.buscar(10).getInfo());
    }

    /**
     * Test of retirar method, of class ListaDupla.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        ListaDupla<Integer> instance = new ListaDupla();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
    
        instance.retirar(10);
        assertEquals("20, 15, 5" , instance.toString());
        instance.exibirOrdemInversa();
    }

    /**
     * Test of retirar method, of class ListaDupla.
     */
    @Test
    public void testRetirarUltimo() {
        System.out.println("retirar ultimo");
        ListaDupla<Integer> instance = new ListaDupla();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
    
        instance.retirar(5);
        assertEquals("20, 15, 10" , instance.toString());
        instance.exibirOrdemInversa();
    }
    
    /**
     * Test of exibirOrdemInversa method, of class ListaDupla.
     */
    @Test
    public void testExibirOrdemInversa() {
        System.out.println("exibirOrdemInversa");
        ListaDupla instance = new ListaDupla();
        instance.exibirOrdemInversa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liberar method, of class ListaDupla.
     */
    @Test
    public void testLiberar() {
        System.out.println("liberar");
        ListaDupla<Integer> instance = new ListaDupla();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
    
        instance.toString();
        instance.liberar();
        assertEquals(null, instance.buscar(20));
        assertEquals(null, instance.buscar(15));
        assertEquals(null, instance.buscar(10));
        assertEquals(null, instance.buscar(5));
    }

    /**
     * Test of toString method, of class ListaDupla.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaDupla instance = new ListaDupla();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
