/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ludvig
 */
public class ListaEncadeadaTest {
    
    public ListaEncadeadaTest() {
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
     * Test of estaVazia method, of class ListaEncadeada.
     */
    @Test
    public void testEstaVazia1() {
        System.out.println("estaVazia");
        ListaEncadeada instance = new ListaEncadeada();
        
        assertEquals(true, instance.estaVazia());
    }

   /**
     * Test of estaVazia method, of class ListaEncadeada.
     */
    @Test
    public void testEstaVazia2() {
        System.out.println("estaVazia");
        ListaEncadeada<Integer> instance = new ListaEncadeada();
        instance.inserir(1);
        assertEquals(false, instance.estaVazia());
    }


    /**
     * Test of retirar method, of class ListaEncadeada.
     */
    @Test
    public void testInserir1() {
        System.out.println("inserir");
        ListaEncadeada<Integer> instance = new ListaEncadeada();
        instance.inserir(5);
        
        assertEquals(5, instance.getPrimeiro().getInfo());
        assertEquals(null, instance.getPrimeiro().getProximo());
        assertEquals(1, instance.obterComprimento());
    }

    /**
     * Test of retirar method, of class ListaEncadeada.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        ListaEncadeada<Integer> instance = new ListaEncadeada();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
        
        assertEquals(20, instance.buscar(20).getInfo());
        assertEquals(15, instance.buscar(15).getInfo());
        assertEquals(null, instance.buscar(50));
    }

    /**
     * Test of retirar method, of class ListaEncadeada.
     */
    @Test
    public void testRetir() {
        System.out.println("Buscar");
        ListaEncadeada<Integer> instance = new ListaEncadeada();
        instance.inserir(5);
        instance.inserir(10);
        instance.inserir(15);
        instance.inserir(20);
        
        assertEquals(20, instance.buscar(20).getInfo());
        
        instance.retirar(20);
                
        assertEquals(null, instance.buscar(20));
    }

    /**
     * Test of toString method, of class ListaEncadeada.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaEncadeada instance = new ListaEncadeada();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
