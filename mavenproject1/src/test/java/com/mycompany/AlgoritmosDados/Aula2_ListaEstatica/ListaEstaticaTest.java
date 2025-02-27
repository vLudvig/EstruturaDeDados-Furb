/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula2_ListaEstatica;

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
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
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
     * Test of inserir method, of class ListaEstatica.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Object novoNumero = null;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exibir method, of class ListaEstatica.
     */
    @Test
    public void testExibir() {
        System.out.println("exibir");
        ListaEstatica instance = new ListaEstatica();
        instance.exibir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ListaEstatica.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Object valor = null;
        ListaEstatica instance = new ListaEstatica();
        int expResult = 0;
        int result = instance.buscar(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class ListaEstatica.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        Object valor = null;
        ListaEstatica instance = new ListaEstatica();
        instance.retirar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liberar method, of class ListaEstatica.
     */
    @Test
    public void testLiberar() {
        System.out.println("liberar");
        ListaEstatica instance = new ListaEstatica();
        instance.liberar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterElemento method, of class ListaEstatica.
     */
    @Test
    public void testObterElemento() {
        System.out.println("obterElemento");
        int posicao = 0;
        ListaEstatica instance = new ListaEstatica();
        Object expResult = null;
        Object result = instance.obterElemento(posicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class ListaEstatica.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        ListaEstatica instance = new ListaEstatica();
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamanho method, of class ListaEstatica.
     */
    @Test
    public void testGetTamanho() {
        System.out.println("getTamanho");
        ListaEstatica instance = new ListaEstatica();
        int expResult = 0;
        int result = instance.getTamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaEstatica.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaEstatica instance = new ListaEstatica();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
