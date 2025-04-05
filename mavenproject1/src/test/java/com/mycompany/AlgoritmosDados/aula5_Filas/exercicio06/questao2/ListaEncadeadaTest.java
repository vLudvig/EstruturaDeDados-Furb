/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula5_Filas.exercicio06.questao2;

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
     * Test of inserirNoFinal method, of class ListaEncadeada.
     */
    @Test
    public void testInserirNoFinal() {
        System.out.println("inserirNoFinal");
        Object valor = null;
        ListaEncadeada instance = new ListaEncadeada();
        instance.inserirNoFinal(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserir method, of class ListaEncadeada.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Object valor = null;
        ListaEncadeada instance = new ListaEncadeada();
        instance.inserir(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class ListaEncadeada.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        Object valor = null;
        ListaEncadeada instance = new ListaEncadeada();
        instance.retirar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterComprimento method, of class ListaEncadeada.
     */
    @Test
    public void testObterComprimento() {
        System.out.println("obterComprimento");
        ListaEncadeada instance = new ListaEncadeada();
        int expResult = 0;
        int result = instance.obterComprimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterNo method, of class ListaEncadeada.
     */
    @Test
    public void testObterNo() {
        System.out.println("obterNo");
        int idx = 0;
        ListaEncadeada instance = new ListaEncadeada();
        NoLista expResult = null;
        NoLista result = instance.obterNo(idx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

    /**
     * Test of exibir method, of class ListaEncadeada.
     */
    @Test
    public void testExibir() {
        System.out.println("exibir");
        ListaEncadeada instance = new ListaEncadeada();
        instance.exibir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
